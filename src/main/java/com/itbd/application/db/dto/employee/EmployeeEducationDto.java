package com.itbd.application.db.dto.employee;

import com.itbd.application.db.dao.employee.EmployeeEducationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmployeeEducationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String schoolUniv,
        String qualification,
        String level,
        Integer yearOfPassing,
        String classPer,
        String majOptSubj,
        String parent,
        String parentField,
        String parentType
) {
    public static EmployeeEducationDto fromEntity(EmployeeEducationDao eEmployeeEducationDao) {
        return new EmployeeEducationDto(
                eEmployeeEducationDao.getName(),
                eEmployeeEducationDao.getCreation(),
                eEmployeeEducationDao.getModified(),
                eEmployeeEducationDao.getModifiedBy(),
                eEmployeeEducationDao.getOwner(),
                eEmployeeEducationDao.getIsDocStatus(),
                eEmployeeEducationDao.getIdx(),
                eEmployeeEducationDao.getSchoolUniv(),
                eEmployeeEducationDao.getQualification(),
                eEmployeeEducationDao.getLevel(),
                eEmployeeEducationDao.getYearOfPassing(),
                eEmployeeEducationDao.getClassPer(),
                eEmployeeEducationDao.getMajOptSubj(),
                eEmployeeEducationDao.getParent(),
                eEmployeeEducationDao.getParentField(),
                eEmployeeEducationDao.getParentType());
    }

    public static void fromDTO(EmployeeEducationDto vEmployeeEducationDto, EmployeeEducationDao eEmployeeEducationDao) {
        eEmployeeEducationDao.setName(vEmployeeEducationDto.name());
        eEmployeeEducationDao.setCreation(vEmployeeEducationDto.creation());
        eEmployeeEducationDao.setModified(vEmployeeEducationDto.modified());
        eEmployeeEducationDao.setModifiedBy(vEmployeeEducationDto.modifiedBy());
        eEmployeeEducationDao.setOwner(vEmployeeEducationDto.owner());
        eEmployeeEducationDao.setIsDocStatus(vEmployeeEducationDto.isDocStatus());
        eEmployeeEducationDao.setIdx(vEmployeeEducationDto.idx());
        eEmployeeEducationDao.setSchoolUniv(vEmployeeEducationDto.schoolUniv());
        eEmployeeEducationDao.setQualification(vEmployeeEducationDto.qualification());
        eEmployeeEducationDao.setLevel(vEmployeeEducationDto.level());
        eEmployeeEducationDao.setYearOfPassing(vEmployeeEducationDto.yearOfPassing());
        eEmployeeEducationDao.setClassPer(vEmployeeEducationDto.classPer());
        eEmployeeEducationDao.setMajOptSubj(vEmployeeEducationDto.majOptSubj());
        eEmployeeEducationDao.setParent(vEmployeeEducationDto.parent());
        eEmployeeEducationDao.setParentField(vEmployeeEducationDto.parentField());
        eEmployeeEducationDao.setParentType(vEmployeeEducationDto.parentType());
    }
}