package com.itbd.application.db.dto.website.component;

import com.itbd.application.db.dao.website.component.WebPageBlockDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebPageBlockDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String webTemplate,
        String webTemplateValues,
        String cssClass,
        String sectionId,
        Boolean addContainer,
        Boolean addTopPadding,
        Boolean addBottomPadding,
        Boolean addBorderAtTop,
        Boolean addBorderAtBottom,
        Boolean addShade,
        Boolean hideBlock,
        Boolean addBackgroundImage,
        String backgroundImage,
        String parent,
        String parentField,
        String parentType
) {
    public static WebPageBlockDto fromEntity(WebPageBlockDao eWebPageBlockDao) {
        return new WebPageBlockDto(
                eWebPageBlockDao.getName(),
                eWebPageBlockDao.getCreation(),
                eWebPageBlockDao.getModified(),
                eWebPageBlockDao.getModifiedBy(),
                eWebPageBlockDao.getOwner(),
                eWebPageBlockDao.getIsDocStatus(),
                eWebPageBlockDao.getIdx(),
                eWebPageBlockDao.getWebTemplate(),
                eWebPageBlockDao.getWebTemplateValues(),
                eWebPageBlockDao.getCssClass(),
                eWebPageBlockDao.getSectionId(),
                eWebPageBlockDao.getAddContainer(),
                eWebPageBlockDao.getAddTopPadding(),
                eWebPageBlockDao.getAddBottomPadding(),
                eWebPageBlockDao.getAddBorderAtTop(),
                eWebPageBlockDao.getAddBorderAtBottom(),
                eWebPageBlockDao.getAddShade(),
                eWebPageBlockDao.getHideBlock(),
                eWebPageBlockDao.getAddBackgroundImage(),
                eWebPageBlockDao.getBackgroundImage(),
                eWebPageBlockDao.getParent(),
                eWebPageBlockDao.getParentField(),
                eWebPageBlockDao.getParentType());
    }

    public static void fromDTO(WebPageBlockDto vWebPageBlockDto, WebPageBlockDao eWebPageBlockDao) {
        eWebPageBlockDao.setName(vWebPageBlockDto.name());
        eWebPageBlockDao.setCreation(vWebPageBlockDto.creation());
        eWebPageBlockDao.setModified(vWebPageBlockDto.modified());
        eWebPageBlockDao.setModifiedBy(vWebPageBlockDto.modifiedBy());
        eWebPageBlockDao.setOwner(vWebPageBlockDto.owner());
        eWebPageBlockDao.setIsDocStatus(vWebPageBlockDto.isDocStatus());
        eWebPageBlockDao.setIdx(vWebPageBlockDto.idx());
        eWebPageBlockDao.setWebTemplate(vWebPageBlockDto.webTemplate());
        eWebPageBlockDao.setWebTemplateValues(vWebPageBlockDto.webTemplateValues());
        eWebPageBlockDao.setCssClass(vWebPageBlockDto.cssClass());
        eWebPageBlockDao.setSectionId(vWebPageBlockDto.sectionId());
        eWebPageBlockDao.setAddContainer(vWebPageBlockDto.addContainer());
        eWebPageBlockDao.setAddTopPadding(vWebPageBlockDto.addTopPadding());
        eWebPageBlockDao.setAddBottomPadding(vWebPageBlockDto.addBottomPadding());
        eWebPageBlockDao.setAddBorderAtTop(vWebPageBlockDto.addBorderAtTop());
        eWebPageBlockDao.setAddBorderAtBottom(vWebPageBlockDto.addBorderAtBottom());
        eWebPageBlockDao.setAddShade(vWebPageBlockDto.addShade());
        eWebPageBlockDao.setHideBlock(vWebPageBlockDto.hideBlock());
        eWebPageBlockDao.setAddBackgroundImage(vWebPageBlockDto.addBackgroundImage());
        eWebPageBlockDao.setBackgroundImage(vWebPageBlockDto.backgroundImage());
        eWebPageBlockDao.setParent(vWebPageBlockDto.parent());
        eWebPageBlockDao.setParentField(vWebPageBlockDto.parentField());
        eWebPageBlockDao.setParentType(vWebPageBlockDto.parentType());
    }
}