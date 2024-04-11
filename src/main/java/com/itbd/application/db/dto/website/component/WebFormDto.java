package com.itbd.application.db.dto.website.component;

import com.itbd.application.db.dao.website.component.WebFormDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebFormDto(
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
        Boolean published,
        String docType,
        String module,
        Boolean isStandard,
        String introductionText,
        Boolean loginRequired,
        Boolean allowMultiple,
        Boolean allowEdit,
        Boolean allowDelete,
        Boolean anonymous,
        Boolean applyDocumentPermissions,
        Boolean allowPrint,
        String printFormat,
        Boolean allowComments,
        Boolean showAttachments,
        Boolean allowIncomplete,
        Integer maxAttachmentSize,
        String conditionJson,
        Boolean showList,
        String listTitle,
        Boolean showSidebar,
        String websiteSidebar,
        String buttonLabel,
        String bannerImage,
        String breadcrumbs,
        String successTitle,
        String successUrl,
        String successMessage,
        String metaTitle,
        String metaDescription,
        String metaImage,
        String clientScript,
        String customCss,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WebFormDto fromEntity(WebFormDao eWebFormDao) {
        return new WebFormDto(
                eWebFormDao.getName(),
                eWebFormDao.getCreation(),
                eWebFormDao.getModified(),
                eWebFormDao.getModifiedBy(),
                eWebFormDao.getOwner(),
                eWebFormDao.getIsDocStatus(),
                eWebFormDao.getIdx(),
                eWebFormDao.getTitle(),
                eWebFormDao.getRoute(),
                eWebFormDao.getPublished(),
                eWebFormDao.getDocType(),
                eWebFormDao.getModule(),
                eWebFormDao.getIsStandard(),
                eWebFormDao.getIntroductionText(),
                eWebFormDao.getLoginRequired(),
                eWebFormDao.getAllowMultiple(),
                eWebFormDao.getAllowEdit(),
                eWebFormDao.getAllowDelete(),
                eWebFormDao.getAnonymous(),
                eWebFormDao.getApplyDocumentPermissions(),
                eWebFormDao.getAllowPrint(),
                eWebFormDao.getPrintFormat(),
                eWebFormDao.getAllowComments(),
                eWebFormDao.getShowAttachments(),
                eWebFormDao.getAllowIncomplete(),
                eWebFormDao.getMaxAttachmentSize(),
                eWebFormDao.getConditionJson(),
                eWebFormDao.getShowList(),
                eWebFormDao.getListTitle(),
                eWebFormDao.getShowSidebar(),
                eWebFormDao.getWebsiteSidebar(),
                eWebFormDao.getButtonLabel(),
                eWebFormDao.getBannerImage(),
                eWebFormDao.getBreadcrumbs(),
                eWebFormDao.getSuccessTitle(),
                eWebFormDao.getSuccessUrl(),
                eWebFormDao.getSuccessMessage(),
                eWebFormDao.getMetaTitle(),
                eWebFormDao.getMetaDescription(),
                eWebFormDao.getMetaImage(),
                eWebFormDao.getClientScript(),
                eWebFormDao.getCustomCss(),
                eWebFormDao.getUserTags(),
                eWebFormDao.getComments(),
                eWebFormDao.getAssign(),
                eWebFormDao.getLikedBy());
    }

    public static void fromDTO(WebFormDto vWebFormDto, WebFormDao eWebFormDao) {
        eWebFormDao.setName(vWebFormDto.name());
        eWebFormDao.setCreation(vWebFormDto.creation());
        eWebFormDao.setModified(vWebFormDto.modified());
        eWebFormDao.setModifiedBy(vWebFormDto.modifiedBy());
        eWebFormDao.setOwner(vWebFormDto.owner());
        eWebFormDao.setIsDocStatus(vWebFormDto.isDocStatus());
        eWebFormDao.setIdx(vWebFormDto.idx());
        eWebFormDao.setTitle(vWebFormDto.title());
        eWebFormDao.setRoute(vWebFormDto.route());
        eWebFormDao.setPublished(vWebFormDto.published());
        eWebFormDao.setDocType(vWebFormDto.docType());
        eWebFormDao.setModule(vWebFormDto.module());
        eWebFormDao.setIsStandard(vWebFormDto.isStandard());
        eWebFormDao.setIntroductionText(vWebFormDto.introductionText());
        eWebFormDao.setLoginRequired(vWebFormDto.loginRequired());
        eWebFormDao.setAllowMultiple(vWebFormDto.allowMultiple());
        eWebFormDao.setAllowEdit(vWebFormDto.allowEdit());
        eWebFormDao.setAllowDelete(vWebFormDto.allowDelete());
        eWebFormDao.setAnonymous(vWebFormDto.anonymous());
        eWebFormDao.setApplyDocumentPermissions(vWebFormDto.applyDocumentPermissions());
        eWebFormDao.setAllowPrint(vWebFormDto.allowPrint());
        eWebFormDao.setPrintFormat(vWebFormDto.printFormat());
        eWebFormDao.setAllowComments(vWebFormDto.allowComments());
        eWebFormDao.setShowAttachments(vWebFormDto.showAttachments());
        eWebFormDao.setAllowIncomplete(vWebFormDto.allowIncomplete());
        eWebFormDao.setMaxAttachmentSize(vWebFormDto.maxAttachmentSize());
        eWebFormDao.setConditionJson(vWebFormDto.conditionJson());
        eWebFormDao.setShowList(vWebFormDto.showList());
        eWebFormDao.setListTitle(vWebFormDto.listTitle());
        eWebFormDao.setShowSidebar(vWebFormDto.showSidebar());
        eWebFormDao.setWebsiteSidebar(vWebFormDto.websiteSidebar());
        eWebFormDao.setButtonLabel(vWebFormDto.buttonLabel());
        eWebFormDao.setBannerImage(vWebFormDto.bannerImage());
        eWebFormDao.setBreadcrumbs(vWebFormDto.breadcrumbs());
        eWebFormDao.setSuccessTitle(vWebFormDto.successTitle());
        eWebFormDao.setSuccessUrl(vWebFormDto.successUrl());
        eWebFormDao.setSuccessMessage(vWebFormDto.successMessage());
        eWebFormDao.setMetaTitle(vWebFormDto.metaTitle());
        eWebFormDao.setMetaDescription(vWebFormDto.metaDescription());
        eWebFormDao.setMetaImage(vWebFormDto.metaImage());
        eWebFormDao.setClientScript(vWebFormDto.clientScript());
        eWebFormDao.setCustomCss(vWebFormDto.customCss());
        eWebFormDao.setUserTags(vWebFormDto.userTags());
        eWebFormDao.setComments(vWebFormDto.comments());
        eWebFormDao.setAssign(vWebFormDto.assign());
        eWebFormDao.setLikedBy(vWebFormDto.likedBy());
    }
}