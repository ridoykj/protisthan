package com.itbd.application.db.dto;

import com.itbd.application.db.dao.HomepageSectionCardDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record HomepageSectionCardDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String subtitle,
        String image,
        String content,
        String route,
        String parent,
        String parentField,
        String parentType
) {
    public static HomepageSectionCardDto fromEntity(HomepageSectionCardDao eHomepageSectionCardDao) {
        return new HomepageSectionCardDto(
                eHomepageSectionCardDao.getName(),
                eHomepageSectionCardDao.getCreation(),
                eHomepageSectionCardDao.getModified(),
                eHomepageSectionCardDao.getModifiedBy(),
                eHomepageSectionCardDao.getOwner(),
                eHomepageSectionCardDao.getIsDocStatus(),
                eHomepageSectionCardDao.getIdx(),
                eHomepageSectionCardDao.getTitle(),
                eHomepageSectionCardDao.getSubtitle(),
                eHomepageSectionCardDao.getImage(),
                eHomepageSectionCardDao.getContent(),
                eHomepageSectionCardDao.getRoute(),
                eHomepageSectionCardDao.getParent(),
                eHomepageSectionCardDao.getParentField(),
                eHomepageSectionCardDao.getParentType());
    }

    public static void fromDTO(HomepageSectionCardDto vHomepageSectionCardDto, HomepageSectionCardDao eHomepageSectionCardDao) {
        eHomepageSectionCardDao.setName(vHomepageSectionCardDto.name());
        eHomepageSectionCardDao.setCreation(vHomepageSectionCardDto.creation());
        eHomepageSectionCardDao.setModified(vHomepageSectionCardDto.modified());
        eHomepageSectionCardDao.setModifiedBy(vHomepageSectionCardDto.modifiedBy());
        eHomepageSectionCardDao.setOwner(vHomepageSectionCardDto.owner());
        eHomepageSectionCardDao.setIsDocStatus(vHomepageSectionCardDto.isDocStatus());
        eHomepageSectionCardDao.setIdx(vHomepageSectionCardDto.idx());
        eHomepageSectionCardDao.setTitle(vHomepageSectionCardDto.title());
        eHomepageSectionCardDao.setSubtitle(vHomepageSectionCardDto.subtitle());
        eHomepageSectionCardDao.setImage(vHomepageSectionCardDto.image());
        eHomepageSectionCardDao.setContent(vHomepageSectionCardDto.content());
        eHomepageSectionCardDao.setRoute(vHomepageSectionCardDto.route());
        eHomepageSectionCardDao.setParent(vHomepageSectionCardDto.parent());
        eHomepageSectionCardDao.setParentField(vHomepageSectionCardDto.parentField());
        eHomepageSectionCardDao.setParentType(vHomepageSectionCardDto.parentType());
    }
}