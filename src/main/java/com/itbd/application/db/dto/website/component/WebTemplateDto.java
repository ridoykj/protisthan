package com.itbd.application.db.dto.website.component;

import com.itbd.application.db.dao.website.component.WebTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebTemplateDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String type,
        Boolean standard,
        String module,
        String template,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WebTemplateDto fromEntity(WebTemplateDao eWebTemplateDao) {
        return new WebTemplateDto(
                eWebTemplateDao.getName(),
                eWebTemplateDao.getCreation(),
                eWebTemplateDao.getModified(),
                eWebTemplateDao.getModifiedBy(),
                eWebTemplateDao.getOwner(),
                eWebTemplateDao.getIsDocStatus(),
                eWebTemplateDao.getIdx(),
                eWebTemplateDao.getType(),
                eWebTemplateDao.getStandard(),
                eWebTemplateDao.getModule(),
                eWebTemplateDao.getTemplate(),
                eWebTemplateDao.getUserTags(),
                eWebTemplateDao.getComments(),
                eWebTemplateDao.getAssign(),
                eWebTemplateDao.getLikedBy());
    }

    public static void fromDTO(WebTemplateDto vWebTemplateDto, WebTemplateDao eWebTemplateDao) {
        eWebTemplateDao.setName(vWebTemplateDto.name());
        eWebTemplateDao.setCreation(vWebTemplateDto.creation());
        eWebTemplateDao.setModified(vWebTemplateDto.modified());
        eWebTemplateDao.setModifiedBy(vWebTemplateDto.modifiedBy());
        eWebTemplateDao.setOwner(vWebTemplateDto.owner());
        eWebTemplateDao.setIsDocStatus(vWebTemplateDto.isDocStatus());
        eWebTemplateDao.setIdx(vWebTemplateDto.idx());
        eWebTemplateDao.setType(vWebTemplateDto.type());
        eWebTemplateDao.setStandard(vWebTemplateDto.standard());
        eWebTemplateDao.setModule(vWebTemplateDto.module());
        eWebTemplateDao.setTemplate(vWebTemplateDto.template());
        eWebTemplateDao.setUserTags(vWebTemplateDto.userTags());
        eWebTemplateDao.setComments(vWebTemplateDto.comments());
        eWebTemplateDao.setAssign(vWebTemplateDto.assign());
        eWebTemplateDao.setLikedBy(vWebTemplateDto.likedBy());
    }
}