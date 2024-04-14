package com.itbd.application.db.dto.doctypes;

import com.itbd.application.db.dao.doctypes.DocTypeActionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocTypeActionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        String parent,
        String parentField,
        String parentType,
        Integer idx,
        String label,
        String group,
        String actionType,
        String action,
        Boolean hidden,
        Boolean custom
) {
    public static DocTypeActionDto fromEntity(DocTypeActionDao eDocTypeActionDao) {
        return new DocTypeActionDto(
                eDocTypeActionDao.getName(),
                eDocTypeActionDao.getCreation(),
                eDocTypeActionDao.getModified(),
                eDocTypeActionDao.getModifiedBy(),
                eDocTypeActionDao.getOwner(),
                eDocTypeActionDao.getIsDocStatus(),
                eDocTypeActionDao.getParent(),
                eDocTypeActionDao.getParentField(),
                eDocTypeActionDao.getParentType(),
                eDocTypeActionDao.getIdx(),
                eDocTypeActionDao.getLabel(),
                eDocTypeActionDao.getGroup(),
                eDocTypeActionDao.getActionType(),
                eDocTypeActionDao.getAction(),
                eDocTypeActionDao.getHidden(),
                eDocTypeActionDao.getCustom());
    }

    public static void fromDTO(DocTypeActionDto vDocTypeActionDto, DocTypeActionDao eDocTypeActionDao) {
        eDocTypeActionDao.setName(vDocTypeActionDto.name());
        eDocTypeActionDao.setCreation(vDocTypeActionDto.creation());
        eDocTypeActionDao.setModified(vDocTypeActionDto.modified());
        eDocTypeActionDao.setModifiedBy(vDocTypeActionDto.modifiedBy());
        eDocTypeActionDao.setOwner(vDocTypeActionDto.owner());
        eDocTypeActionDao.setIsDocStatus(vDocTypeActionDto.isDocStatus());
        eDocTypeActionDao.setParent(vDocTypeActionDto.parent());
        eDocTypeActionDao.setParentField(vDocTypeActionDto.parentField());
        eDocTypeActionDao.setParentType(vDocTypeActionDto.parentType());
        eDocTypeActionDao.setIdx(vDocTypeActionDto.idx());
        eDocTypeActionDao.setLabel(vDocTypeActionDto.label());
        eDocTypeActionDao.setGroup(vDocTypeActionDto.group());
        eDocTypeActionDao.setActionType(vDocTypeActionDto.actionType());
        eDocTypeActionDao.setAction(vDocTypeActionDto.action());
        eDocTypeActionDao.setHidden(vDocTypeActionDto.hidden());
        eDocTypeActionDao.setCustom(vDocTypeActionDto.custom());
    }
}