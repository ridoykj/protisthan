package com.itbd.application.db.dto.website.component;

import com.itbd.application.db.dao.website.component.WebPageDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebPageDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String route,
        Boolean dynamicRoute,
        Boolean published,
        String module,
        String contentType,
        String slideshow,
        Boolean dynamicTemplate,
        String mainSection,
        String mainSectionMd,
        String mainSectionHtml,
        String contextScript,
        String javascript,
        Boolean insertStyle,
        String textAlign,
        String css,
        Boolean fullWidth,
        Boolean showTitle,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String metaTitle,
        String metaDescription,
        String metaImage,
        Boolean showSidebar,
        String websiteSidebar,
        Boolean enableComments,
        String header,
        String breadcrumbs,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WebPageDto fromEntity(WebPageDao eWebPageDao) {
        return new WebPageDto(
                eWebPageDao.getName(),
                eWebPageDao.getCreation(),
                eWebPageDao.getModified(),
                eWebPageDao.getModifiedBy(),
                eWebPageDao.getOwner(),
                eWebPageDao.getIsDocStatus(),
                eWebPageDao.getIdx(),
                eWebPageDao.getTitle(),
                eWebPageDao.getRoute(),
                eWebPageDao.getDynamicRoute(),
                eWebPageDao.getPublished(),
                eWebPageDao.getModule(),
                eWebPageDao.getContentType(),
                eWebPageDao.getSlideshow(),
                eWebPageDao.getDynamicTemplate(),
                eWebPageDao.getMainSection(),
                eWebPageDao.getMainSectionMd(),
                eWebPageDao.getMainSectionHtml(),
                eWebPageDao.getContextScript(),
                eWebPageDao.getJavascript(),
                eWebPageDao.getInsertStyle(),
                eWebPageDao.getTextAlign(),
                eWebPageDao.getCss(),
                eWebPageDao.getFullWidth(),
                eWebPageDao.getShowTitle(),
                eWebPageDao.getStartDate(),
                eWebPageDao.getEndDate(),
                eWebPageDao.getMetaTitle(),
                eWebPageDao.getMetaDescription(),
                eWebPageDao.getMetaImage(),
                eWebPageDao.getShowSidebar(),
                eWebPageDao.getWebsiteSidebar(),
                eWebPageDao.getEnableComments(),
                eWebPageDao.getHeader(),
                eWebPageDao.getBreadcrumbs(),
                eWebPageDao.getUserTags(),
                eWebPageDao.getComments(),
                eWebPageDao.getAssign(),
                eWebPageDao.getLikedBy());
    }

    public static void fromDTO(WebPageDto vWebPageDto, WebPageDao eWebPageDao) {
        eWebPageDao.setName(vWebPageDto.name());
        eWebPageDao.setCreation(vWebPageDto.creation());
        eWebPageDao.setModified(vWebPageDto.modified());
        eWebPageDao.setModifiedBy(vWebPageDto.modifiedBy());
        eWebPageDao.setOwner(vWebPageDto.owner());
        eWebPageDao.setIsDocStatus(vWebPageDto.isDocStatus());
        eWebPageDao.setIdx(vWebPageDto.idx());
        eWebPageDao.setTitle(vWebPageDto.title());
        eWebPageDao.setRoute(vWebPageDto.route());
        eWebPageDao.setDynamicRoute(vWebPageDto.dynamicRoute());
        eWebPageDao.setPublished(vWebPageDto.published());
        eWebPageDao.setModule(vWebPageDto.module());
        eWebPageDao.setContentType(vWebPageDto.contentType());
        eWebPageDao.setSlideshow(vWebPageDto.slideshow());
        eWebPageDao.setDynamicTemplate(vWebPageDto.dynamicTemplate());
        eWebPageDao.setMainSection(vWebPageDto.mainSection());
        eWebPageDao.setMainSectionMd(vWebPageDto.mainSectionMd());
        eWebPageDao.setMainSectionHtml(vWebPageDto.mainSectionHtml());
        eWebPageDao.setContextScript(vWebPageDto.contextScript());
        eWebPageDao.setJavascript(vWebPageDto.javascript());
        eWebPageDao.setInsertStyle(vWebPageDto.insertStyle());
        eWebPageDao.setTextAlign(vWebPageDto.textAlign());
        eWebPageDao.setCss(vWebPageDto.css());
        eWebPageDao.setFullWidth(vWebPageDto.fullWidth());
        eWebPageDao.setShowTitle(vWebPageDto.showTitle());
        eWebPageDao.setStartDate(vWebPageDto.startDate());
        eWebPageDao.setEndDate(vWebPageDto.endDate());
        eWebPageDao.setMetaTitle(vWebPageDto.metaTitle());
        eWebPageDao.setMetaDescription(vWebPageDto.metaDescription());
        eWebPageDao.setMetaImage(vWebPageDto.metaImage());
        eWebPageDao.setShowSidebar(vWebPageDto.showSidebar());
        eWebPageDao.setWebsiteSidebar(vWebPageDto.websiteSidebar());
        eWebPageDao.setEnableComments(vWebPageDto.enableComments());
        eWebPageDao.setHeader(vWebPageDto.header());
        eWebPageDao.setBreadcrumbs(vWebPageDto.breadcrumbs());
        eWebPageDao.setUserTags(vWebPageDto.userTags());
        eWebPageDao.setComments(vWebPageDto.comments());
        eWebPageDao.setAssign(vWebPageDto.assign());
        eWebPageDao.setLikedBy(vWebPageDto.likedBy());
    }
}