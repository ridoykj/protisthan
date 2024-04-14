package com.itbd.application.db.dto.website.component;

import com.itbd.application.db.dao.website.component.WebPageViewDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebPageViewDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String path,
        String referrer,
        String browser,
        String browserVersion,
        String isUnique,
        String timeZone,
        String userAgent,
        String source,
        String campaign,
        String medium,
        String visitorId,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WebPageViewDto fromEntity(WebPageViewDao eWebPageViewDao) {
        return new WebPageViewDto(
                eWebPageViewDao.getName(),
                eWebPageViewDao.getCreation(),
                eWebPageViewDao.getModified(),
                eWebPageViewDao.getModifiedBy(),
                eWebPageViewDao.getOwner(),
                eWebPageViewDao.getIsDocStatus(),
                eWebPageViewDao.getIdx(),
                eWebPageViewDao.getPath(),
                eWebPageViewDao.getReferrer(),
                eWebPageViewDao.getBrowser(),
                eWebPageViewDao.getBrowserVersion(),
                eWebPageViewDao.getIsUnique(),
                eWebPageViewDao.getTimeZone(),
                eWebPageViewDao.getUserAgent(),
                eWebPageViewDao.getSource(),
                eWebPageViewDao.getCampaign(),
                eWebPageViewDao.getMedium(),
                eWebPageViewDao.getVisitorId(),
                eWebPageViewDao.getUserTags(),
                eWebPageViewDao.getComments(),
                eWebPageViewDao.getAssign(),
                eWebPageViewDao.getLikedBy());
    }

    public static void fromDTO(WebPageViewDto vWebPageViewDto, WebPageViewDao eWebPageViewDao) {
        eWebPageViewDao.setName(vWebPageViewDto.name());
        eWebPageViewDao.setCreation(vWebPageViewDto.creation());
        eWebPageViewDao.setModified(vWebPageViewDto.modified());
        eWebPageViewDao.setModifiedBy(vWebPageViewDto.modifiedBy());
        eWebPageViewDao.setOwner(vWebPageViewDto.owner());
        eWebPageViewDao.setIsDocStatus(vWebPageViewDto.isDocStatus());
        eWebPageViewDao.setIdx(vWebPageViewDto.idx());
        eWebPageViewDao.setPath(vWebPageViewDto.path());
        eWebPageViewDao.setReferrer(vWebPageViewDto.referrer());
        eWebPageViewDao.setBrowser(vWebPageViewDto.browser());
        eWebPageViewDao.setBrowserVersion(vWebPageViewDto.browserVersion());
        eWebPageViewDao.setIsUnique(vWebPageViewDto.isUnique());
        eWebPageViewDao.setTimeZone(vWebPageViewDto.timeZone());
        eWebPageViewDao.setUserAgent(vWebPageViewDto.userAgent());
        eWebPageViewDao.setSource(vWebPageViewDto.source());
        eWebPageViewDao.setCampaign(vWebPageViewDto.campaign());
        eWebPageViewDao.setMedium(vWebPageViewDto.medium());
        eWebPageViewDao.setVisitorId(vWebPageViewDto.visitorId());
        eWebPageViewDao.setUserTags(vWebPageViewDto.userTags());
        eWebPageViewDao.setComments(vWebPageViewDto.comments());
        eWebPageViewDao.setAssign(vWebPageViewDto.assign());
        eWebPageViewDao.setLikedBy(vWebPageViewDto.likedBy());
    }
}