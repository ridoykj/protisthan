package com.itbd.application.db.dto.cummunication;

import com.itbd.application.db.dao.core.CommunicationLinkDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CommunicationLinkDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String linkDocType,
        String linkName,
        String linkTitle,
        String parent,
        String parentField,
        String parentType
) {
    public static CommunicationLinkDto fromEntity(CommunicationLinkDao eCommunicationLinkDao) {
        return new CommunicationLinkDto(
                eCommunicationLinkDao.getName(),
                eCommunicationLinkDao.getCreation(),
                eCommunicationLinkDao.getModified(),
                eCommunicationLinkDao.getModifiedBy(),
                eCommunicationLinkDao.getOwner(),
                eCommunicationLinkDao.getIsDocStatus(),
                eCommunicationLinkDao.getIdx(),
                eCommunicationLinkDao.getLinkDocType(),
                eCommunicationLinkDao.getLinkName(),
                eCommunicationLinkDao.getLinkTitle(),
                eCommunicationLinkDao.getParent(),
                eCommunicationLinkDao.getParentField(),
                eCommunicationLinkDao.getParentType());
    }

    public static void fromDTO(CommunicationLinkDto vCommunicationLinkDto, CommunicationLinkDao eCommunicationLinkDao) {
        eCommunicationLinkDao.setName(vCommunicationLinkDto.name());
        eCommunicationLinkDao.setCreation(vCommunicationLinkDto.creation());
        eCommunicationLinkDao.setModified(vCommunicationLinkDto.modified());
        eCommunicationLinkDao.setModifiedBy(vCommunicationLinkDto.modifiedBy());
        eCommunicationLinkDao.setOwner(vCommunicationLinkDto.owner());
        eCommunicationLinkDao.setIsDocStatus(vCommunicationLinkDto.isDocStatus());
        eCommunicationLinkDao.setIdx(vCommunicationLinkDto.idx());
        eCommunicationLinkDao.setLinkDocType(vCommunicationLinkDto.linkDocType());
        eCommunicationLinkDao.setLinkName(vCommunicationLinkDto.linkName());
        eCommunicationLinkDao.setLinkTitle(vCommunicationLinkDto.linkTitle());
        eCommunicationLinkDao.setParent(vCommunicationLinkDto.parent());
        eCommunicationLinkDao.setParentField(vCommunicationLinkDto.parentField());
        eCommunicationLinkDao.setParentType(vCommunicationLinkDto.parentType());
    }
}