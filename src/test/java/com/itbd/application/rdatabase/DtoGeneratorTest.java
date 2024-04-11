package com.itbd.application.rdatabase;

import com.itbd.application.db.dao.users.UserDao;
import jakarta.persistence.Entity;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class DtoGeneratorTest {


    @Test
    public void getDaoClasses() {
        Path filePath = Path.of("src/main/java/com/itbd/application/db/dao");
        try (Stream<Path> paths = Files.walk(filePath)) {
            List<Path> filesList = paths
                    .filter(Files::isRegularFile)
                    .toList();
            filesList.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void processDaoClasses() {
        Reflections reflections = new Reflections(("com.itbd.application.db.dao"));
//        Reflections reflections = new Reflections(("com.itbd.application.db.dao.users"));
        List<Class<?>> daoLs = reflections.getTypesAnnotatedWith(Entity.class).stream().toList();

        List<Class<?>> users = daoLs.stream().filter(Predicate.isEqual(UserDao.class)).toList();

        List<RClass> classes = daoLs.stream().map(c -> {
            String classPath = c.getName().replaceFirst("com.itbd.application.db.dao.", "");
            String className = c.getSimpleName();
            List<Field> fields = Arrays.stream(c.getDeclaredFields()).toList();
            List<RField> rFields = fields.stream().map(f -> new RField(f.getName(), f.getType().getSimpleName())).toList();
            Set<String> types = fields.stream().map(f -> f.getType().getName()).collect(Collectors.toSet());
            types.add("com.itbd.application.db.dao." + classPath);
            return new RClass(classPath, className.substring(0, className.length() - 3), rFields, types);
        }).toList();

        List<RDto> dtoLs = classes.stream().map(c -> {
            String className = c.name();
            String fields = c.fields().stream().map(f -> f.type() + " " + f.name()).reduce((a, b) -> a + ",\n" + b).orElse("");
            String types = c.types().stream().map(t -> "import " + t + ";").reduce((a, b) -> a + "\n" + b).orElse("");
            String path = c.path().lastIndexOf(".") >= 0 ? "." + c.path().substring(0, c.path().lastIndexOf(".")) : "";
            String content = "package com.itbd.application.db.dto" + path + ";\n"
                    + types + "\n"
                    + "public record " + className + "Dto "
                    + "(\n" + fields + "\n)\n"
                    + "{\n"
                    + " public static " + className + "Dto fromEntity(" + className + "Dao e" + className + "Dao) {"
                    + "\nreturn new " + className + "Dto(\n"
                    + c.fields().stream().map(f -> "e" + className + "Dao.get" + StringUtils.capitalize(f.name()) + "()").reduce((a, b) -> a + ",\n" + b).orElse("")
                    + ");"
                    + "\n}"
                    + " \npublic static void fromDTO(" + className + "Dto v" + className + "Dto, " + className + "Dao e" + className + "Dao) {\n"
                    + c.fields().stream().map(f -> "e" + className + "Dao.set" + StringUtils.capitalize(f.name()) + "(v" + className + "Dto." + f.name() + "())").reduce((a, b) -> a + ";\n" + b).orElse("")
                    + ";\n}"
                    + "\n}";

            return new RDto(("com.itbd.application.db.dto." + c.path()).replaceAll("\\.", "/"), content);
        }).toList();
//        dtoLs.forEach(System.out::println);
        dtoLs.forEach(item -> {
            try {
                FileUtils.write(new File("src/main/java/" + item.path().substring(0, item.path().length() - 3) + "Dto.java"), item.content(), "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }


    record RClass(String path, String name, List<RField> fields, Set<String> types) {
    }

    record RField(String name, String type) {
    }

    record RDto(String path, String content) {
    }
}
