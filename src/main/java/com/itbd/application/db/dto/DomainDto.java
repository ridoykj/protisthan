package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DomainDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DomainDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String domain,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DomainDto fromEntity(DomainDao eDomainDao) {
        return new DomainDto(
                eDomainDao.getName(),
                eDomainDao.getCreation(),
                eDomainDao.getModified(),
                eDomainDao.getModifiedBy(),
                eDomainDao.getOwner(),
                eDomainDao.getIsDocStatus(),
                eDomainDao.getIdx(),
                eDomainDao.getDomain(),
                eDomainDao.getUserTags(),
                eDomainDao.getComments(),
                eDomainDao.getAssign(),
                eDomainDao.getLikedBy());
    }

    public static void fromDTO(DomainDto vDomainDto, DomainDao eDomainDao) {
        eDomainDao.setName(vDomainDto.name());
        eDomainDao.setCreation(vDomainDto.creation());
        eDomainDao.setModified(vDomainDto.modified());
        eDomainDao.setModifiedBy(vDomainDto.modifiedBy());
        eDomainDao.setOwner(vDomainDto.owner());
        eDomainDao.setIsDocStatus(vDomainDto.isDocStatus());
        eDomainDao.setIdx(vDomainDto.idx());
        eDomainDao.setDomain(vDomainDto.domain());
        eDomainDao.setUserTags(vDomainDto.userTags());
        eDomainDao.setComments(vDomainDto.comments());
        eDomainDao.setAssign(vDomainDto.assign());
        eDomainDao.setLikedBy(vDomainDto.likedBy());
    }
}