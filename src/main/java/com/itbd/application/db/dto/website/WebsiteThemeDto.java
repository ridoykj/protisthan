package com.itbd.application.db.dto.website;

import com.itbd.application.db.dao.website.website.WebsiteThemeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebsiteThemeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String theme,
        String module,
        Boolean custom,
        String googleFont,
        String fontSize,
        String fontProperties,
        Boolean buttonRoundedCorners,
        Boolean buttonShadows,
        Boolean buttonGradients,
        String primaryColor,
        String textColor,
        String lightColor,
        String darkColor,
        String backgroundColor,
        String customOverrides,
        String customScss,
        String themeScss,
        String themeUrl,
        String js,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WebsiteThemeDto fromEntity(WebsiteThemeDao eWebsiteThemeDao) {
        return new WebsiteThemeDto(
                eWebsiteThemeDao.getName(),
                eWebsiteThemeDao.getCreation(),
                eWebsiteThemeDao.getModified(),
                eWebsiteThemeDao.getModifiedBy(),
                eWebsiteThemeDao.getOwner(),
                eWebsiteThemeDao.getIsDocStatus(),
                eWebsiteThemeDao.getIdx(),
                eWebsiteThemeDao.getTheme(),
                eWebsiteThemeDao.getModule(),
                eWebsiteThemeDao.getCustom(),
                eWebsiteThemeDao.getGoogleFont(),
                eWebsiteThemeDao.getFontSize(),
                eWebsiteThemeDao.getFontProperties(),
                eWebsiteThemeDao.getButtonRoundedCorners(),
                eWebsiteThemeDao.getButtonShadows(),
                eWebsiteThemeDao.getButtonGradients(),
                eWebsiteThemeDao.getPrimaryColor(),
                eWebsiteThemeDao.getTextColor(),
                eWebsiteThemeDao.getLightColor(),
                eWebsiteThemeDao.getDarkColor(),
                eWebsiteThemeDao.getBackgroundColor(),
                eWebsiteThemeDao.getCustomOverrides(),
                eWebsiteThemeDao.getCustomScss(),
                eWebsiteThemeDao.getThemeScss(),
                eWebsiteThemeDao.getThemeUrl(),
                eWebsiteThemeDao.getJs(),
                eWebsiteThemeDao.getUserTags(),
                eWebsiteThemeDao.getComments(),
                eWebsiteThemeDao.getAssign(),
                eWebsiteThemeDao.getLikedBy());
    }

    public static void fromDTO(WebsiteThemeDto vWebsiteThemeDto, WebsiteThemeDao eWebsiteThemeDao) {
        eWebsiteThemeDao.setName(vWebsiteThemeDto.name());
        eWebsiteThemeDao.setCreation(vWebsiteThemeDto.creation());
        eWebsiteThemeDao.setModified(vWebsiteThemeDto.modified());
        eWebsiteThemeDao.setModifiedBy(vWebsiteThemeDto.modifiedBy());
        eWebsiteThemeDao.setOwner(vWebsiteThemeDto.owner());
        eWebsiteThemeDao.setIsDocStatus(vWebsiteThemeDto.isDocStatus());
        eWebsiteThemeDao.setIdx(vWebsiteThemeDto.idx());
        eWebsiteThemeDao.setTheme(vWebsiteThemeDto.theme());
        eWebsiteThemeDao.setModule(vWebsiteThemeDto.module());
        eWebsiteThemeDao.setCustom(vWebsiteThemeDto.custom());
        eWebsiteThemeDao.setGoogleFont(vWebsiteThemeDto.googleFont());
        eWebsiteThemeDao.setFontSize(vWebsiteThemeDto.fontSize());
        eWebsiteThemeDao.setFontProperties(vWebsiteThemeDto.fontProperties());
        eWebsiteThemeDao.setButtonRoundedCorners(vWebsiteThemeDto.buttonRoundedCorners());
        eWebsiteThemeDao.setButtonShadows(vWebsiteThemeDto.buttonShadows());
        eWebsiteThemeDao.setButtonGradients(vWebsiteThemeDto.buttonGradients());
        eWebsiteThemeDao.setPrimaryColor(vWebsiteThemeDto.primaryColor());
        eWebsiteThemeDao.setTextColor(vWebsiteThemeDto.textColor());
        eWebsiteThemeDao.setLightColor(vWebsiteThemeDto.lightColor());
        eWebsiteThemeDao.setDarkColor(vWebsiteThemeDto.darkColor());
        eWebsiteThemeDao.setBackgroundColor(vWebsiteThemeDto.backgroundColor());
        eWebsiteThemeDao.setCustomOverrides(vWebsiteThemeDto.customOverrides());
        eWebsiteThemeDao.setCustomScss(vWebsiteThemeDto.customScss());
        eWebsiteThemeDao.setThemeScss(vWebsiteThemeDto.themeScss());
        eWebsiteThemeDao.setThemeUrl(vWebsiteThemeDto.themeUrl());
        eWebsiteThemeDao.setJs(vWebsiteThemeDto.js());
        eWebsiteThemeDao.setUserTags(vWebsiteThemeDto.userTags());
        eWebsiteThemeDao.setComments(vWebsiteThemeDto.comments());
        eWebsiteThemeDao.setAssign(vWebsiteThemeDto.assign());
        eWebsiteThemeDao.setLikedBy(vWebsiteThemeDto.likedBy());
    }
}