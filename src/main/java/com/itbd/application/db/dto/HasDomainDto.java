package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.HasDomainDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record HasDomainDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String domain,
        String parent,
        String parentField,
        String parentType
) {
    public static HasDomainDto fromEntity(HasDomainDao eHasDomainDao) {
        return new HasDomainDto(
                eHasDomainDao.getName(),
                eHasDomainDao.getCreation(),
                eHasDomainDao.getModified(),
                eHasDomainDao.getModifiedBy(),
                eHasDomainDao.getOwner(),
                eHasDomainDao.getIsDocStatus(),
                eHasDomainDao.getIdx(),
                eHasDomainDao.getDomain(),
                eHasDomainDao.getParent(),
                eHasDomainDao.getParentField(),
                eHasDomainDao.getParentType());
    }

    public static void fromDTO(HasDomainDto vHasDomainDto, HasDomainDao eHasDomainDao) {
        eHasDomainDao.setName(vHasDomainDto.name());
        eHasDomainDao.setCreation(vHasDomainDto.creation());
        eHasDomainDao.setModified(vHasDomainDto.modified());
        eHasDomainDao.setModifiedBy(vHasDomainDto.modifiedBy());
        eHasDomainDao.setOwner(vHasDomainDto.owner());
        eHasDomainDao.setIsDocStatus(vHasDomainDto.isDocStatus());
        eHasDomainDao.setIdx(vHasDomainDto.idx());
        eHasDomainDao.setDomain(vHasDomainDto.domain());
        eHasDomainDao.setParent(vHasDomainDto.parent());
        eHasDomainDao.setParentField(vHasDomainDto.parentField());
        eHasDomainDao.setParentType(vHasDomainDto.parentType());
    }
}