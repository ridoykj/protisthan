package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SessionDefaultDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SessionDefaultDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String refDocType,
        String parent,
        String parentField,
        String parentType
) {
    public static SessionDefaultDto fromEntity(SessionDefaultDao eSessionDefaultDao) {
        return new SessionDefaultDto(
                eSessionDefaultDao.getName(),
                eSessionDefaultDao.getCreation(),
                eSessionDefaultDao.getModified(),
                eSessionDefaultDao.getModifiedBy(),
                eSessionDefaultDao.getOwner(),
                eSessionDefaultDao.getIsDocStatus(),
                eSessionDefaultDao.getIdx(),
                eSessionDefaultDao.getRefDocType(),
                eSessionDefaultDao.getParent(),
                eSessionDefaultDao.getParentField(),
                eSessionDefaultDao.getParentType());
    }

    public static void fromDTO(SessionDefaultDto vSessionDefaultDto, SessionDefaultDao eSessionDefaultDao) {
        eSessionDefaultDao.setName(vSessionDefaultDto.name());
        eSessionDefaultDao.setCreation(vSessionDefaultDto.creation());
        eSessionDefaultDao.setModified(vSessionDefaultDto.modified());
        eSessionDefaultDao.setModifiedBy(vSessionDefaultDto.modifiedBy());
        eSessionDefaultDao.setOwner(vSessionDefaultDto.owner());
        eSessionDefaultDao.setIsDocStatus(vSessionDefaultDto.isDocStatus());
        eSessionDefaultDao.setIdx(vSessionDefaultDto.idx());
        eSessionDefaultDao.setRefDocType(vSessionDefaultDto.refDocType());
        eSessionDefaultDao.setParent(vSessionDefaultDto.parent());
        eSessionDefaultDao.setParentField(vSessionDefaultDto.parentField());
        eSessionDefaultDao.setParentType(vSessionDefaultDto.parentType());
    }
}