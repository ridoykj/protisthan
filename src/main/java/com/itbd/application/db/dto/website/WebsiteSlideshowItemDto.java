package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.WebsiteSlideshowItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteSlideshowItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String image,
        String heading,
        String description,
        String url,
        String parent,
        String parentField,
        String parentType
) {
    public static WebsiteSlideshowItemDto fromEntity(WebsiteSlideshowItemDao eWebsiteSlideshowItemDao) {
        return new WebsiteSlideshowItemDto(
                eWebsiteSlideshowItemDao.getName(),
                eWebsiteSlideshowItemDao.getCreation(),
                eWebsiteSlideshowItemDao.getModified(),
                eWebsiteSlideshowItemDao.getModifiedBy(),
                eWebsiteSlideshowItemDao.getOwner(),
                eWebsiteSlideshowItemDao.getIsDocStatus(),
                eWebsiteSlideshowItemDao.getIdx(),
                eWebsiteSlideshowItemDao.getImage(),
                eWebsiteSlideshowItemDao.getHeading(),
                eWebsiteSlideshowItemDao.getDescription(),
                eWebsiteSlideshowItemDao.getUrl(),
                eWebsiteSlideshowItemDao.getParent(),
                eWebsiteSlideshowItemDao.getParentField(),
                eWebsiteSlideshowItemDao.getParentType());
    }

    public static void fromDTO(WebsiteSlideshowItemDto vWebsiteSlideshowItemDto, WebsiteSlideshowItemDao eWebsiteSlideshowItemDao) {
        eWebsiteSlideshowItemDao.setName(vWebsiteSlideshowItemDto.name());
        eWebsiteSlideshowItemDao.setCreation(vWebsiteSlideshowItemDto.creation());
        eWebsiteSlideshowItemDao.setModified(vWebsiteSlideshowItemDto.modified());
        eWebsiteSlideshowItemDao.setModifiedBy(vWebsiteSlideshowItemDto.modifiedBy());
        eWebsiteSlideshowItemDao.setOwner(vWebsiteSlideshowItemDto.owner());
        eWebsiteSlideshowItemDao.setIsDocStatus(vWebsiteSlideshowItemDto.isDocStatus());
        eWebsiteSlideshowItemDao.setIdx(vWebsiteSlideshowItemDto.idx());
        eWebsiteSlideshowItemDao.setImage(vWebsiteSlideshowItemDto.image());
        eWebsiteSlideshowItemDao.setHeading(vWebsiteSlideshowItemDto.heading());
        eWebsiteSlideshowItemDao.setDescription(vWebsiteSlideshowItemDto.description());
        eWebsiteSlideshowItemDao.setUrl(vWebsiteSlideshowItemDto.url());
        eWebsiteSlideshowItemDao.setParent(vWebsiteSlideshowItemDto.parent());
        eWebsiteSlideshowItemDao.setParentField(vWebsiteSlideshowItemDto.parentField());
        eWebsiteSlideshowItemDao.setParentType(vWebsiteSlideshowItemDto.parentType());
    }
}