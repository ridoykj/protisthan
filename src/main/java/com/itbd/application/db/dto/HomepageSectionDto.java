package com.itbd.application.db.dto;

import com.itbd.application.db.dao.HomepageSectionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record HomepageSectionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String sectionBasedOn,
        String noOfColumns,
        String sectionHtml,
        Integer sectionOrder,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static HomepageSectionDto fromEntity(HomepageSectionDao eHomepageSectionDao) {
        return new HomepageSectionDto(
                eHomepageSectionDao.getName(),
                eHomepageSectionDao.getCreation(),
                eHomepageSectionDao.getModified(),
                eHomepageSectionDao.getModifiedBy(),
                eHomepageSectionDao.getOwner(),
                eHomepageSectionDao.getIsDocStatus(),
                eHomepageSectionDao.getIdx(),
                eHomepageSectionDao.getSectionBasedOn(),
                eHomepageSectionDao.getNoOfColumns(),
                eHomepageSectionDao.getSectionHtml(),
                eHomepageSectionDao.getSectionOrder(),
                eHomepageSectionDao.getUserTags(),
                eHomepageSectionDao.getComments(),
                eHomepageSectionDao.getAssign(),
                eHomepageSectionDao.getLikedBy());
    }

    public static void fromDTO(HomepageSectionDto vHomepageSectionDto, HomepageSectionDao eHomepageSectionDao) {
        eHomepageSectionDao.setName(vHomepageSectionDto.name());
        eHomepageSectionDao.setCreation(vHomepageSectionDto.creation());
        eHomepageSectionDao.setModified(vHomepageSectionDto.modified());
        eHomepageSectionDao.setModifiedBy(vHomepageSectionDto.modifiedBy());
        eHomepageSectionDao.setOwner(vHomepageSectionDto.owner());
        eHomepageSectionDao.setIsDocStatus(vHomepageSectionDto.isDocStatus());
        eHomepageSectionDao.setIdx(vHomepageSectionDto.idx());
        eHomepageSectionDao.setSectionBasedOn(vHomepageSectionDto.sectionBasedOn());
        eHomepageSectionDao.setNoOfColumns(vHomepageSectionDto.noOfColumns());
        eHomepageSectionDao.setSectionHtml(vHomepageSectionDto.sectionHtml());
        eHomepageSectionDao.setSectionOrder(vHomepageSectionDto.sectionOrder());
        eHomepageSectionDao.setUserTags(vHomepageSectionDto.userTags());
        eHomepageSectionDao.setComments(vHomepageSectionDto.comments());
        eHomepageSectionDao.setAssign(vHomepageSectionDto.assign());
        eHomepageSectionDao.setLikedBy(vHomepageSectionDto.likedBy());
    }
}