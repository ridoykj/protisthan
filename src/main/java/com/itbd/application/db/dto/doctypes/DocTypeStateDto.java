package com.itbd.application.db.dto.doctypes;

import com.itbd.application.db.dao.doctypes.DocTypeStateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocTypeStateDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String color,
        Boolean custom,
        String parent,
        String parentField,
        String parentType
) {
    public static DocTypeStateDto fromEntity(DocTypeStateDao eDocTypeStateDao) {
        return new DocTypeStateDto(
                eDocTypeStateDao.getName(),
                eDocTypeStateDao.getCreation(),
                eDocTypeStateDao.getModified(),
                eDocTypeStateDao.getModifiedBy(),
                eDocTypeStateDao.getOwner(),
                eDocTypeStateDao.getIsDocStatus(),
                eDocTypeStateDao.getIdx(),
                eDocTypeStateDao.getTitle(),
                eDocTypeStateDao.getColor(),
                eDocTypeStateDao.getCustom(),
                eDocTypeStateDao.getParent(),
                eDocTypeStateDao.getParentField(),
                eDocTypeStateDao.getParentType());
    }

    public static void fromDTO(DocTypeStateDto vDocTypeStateDto, DocTypeStateDao eDocTypeStateDao) {
        eDocTypeStateDao.setName(vDocTypeStateDto.name());
        eDocTypeStateDao.setCreation(vDocTypeStateDto.creation());
        eDocTypeStateDao.setModified(vDocTypeStateDto.modified());
        eDocTypeStateDao.setModifiedBy(vDocTypeStateDto.modifiedBy());
        eDocTypeStateDao.setOwner(vDocTypeStateDto.owner());
        eDocTypeStateDao.setIsDocStatus(vDocTypeStateDto.isDocStatus());
        eDocTypeStateDao.setIdx(vDocTypeStateDto.idx());
        eDocTypeStateDao.setTitle(vDocTypeStateDto.title());
        eDocTypeStateDao.setColor(vDocTypeStateDto.color());
        eDocTypeStateDao.setCustom(vDocTypeStateDto.custom());
        eDocTypeStateDao.setParent(vDocTypeStateDto.parent());
        eDocTypeStateDao.setParentField(vDocTypeStateDto.parentField());
        eDocTypeStateDao.setParentType(vDocTypeStateDto.parentType());
    }
}