package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DesktopIconDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DesktopIconDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String moduleName,
        String label,
        Boolean standard,
        Boolean custom,
        String app,
        String description,
        String category,
        Boolean hidden,
        Boolean blocked,
        Boolean forceShow,
        String type,
        String docType,
        String report,
        String link,
        String color,
        String icon,
        Boolean reverse,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DesktopIconDto fromEntity(DesktopIconDao eDesktopIconDao) {
        return new DesktopIconDto(
                eDesktopIconDao.getName(),
                eDesktopIconDao.getCreation(),
                eDesktopIconDao.getModified(),
                eDesktopIconDao.getModifiedBy(),
                eDesktopIconDao.getOwner(),
                eDesktopIconDao.getIsDocStatus(),
                eDesktopIconDao.getIdx(),
                eDesktopIconDao.getModuleName(),
                eDesktopIconDao.getLabel(),
                eDesktopIconDao.getStandard(),
                eDesktopIconDao.getCustom(),
                eDesktopIconDao.getApp(),
                eDesktopIconDao.getDescription(),
                eDesktopIconDao.getCategory(),
                eDesktopIconDao.getHidden(),
                eDesktopIconDao.getBlocked(),
                eDesktopIconDao.getForceShow(),
                eDesktopIconDao.getType(),
                eDesktopIconDao.getDocType(),
                eDesktopIconDao.getReport(),
                eDesktopIconDao.getLink(),
                eDesktopIconDao.getColor(),
                eDesktopIconDao.getIcon(),
                eDesktopIconDao.getReverse(),
                eDesktopIconDao.getUserTags(),
                eDesktopIconDao.getComments(),
                eDesktopIconDao.getAssign(),
                eDesktopIconDao.getLikedBy());
    }

    public static void fromDTO(DesktopIconDto vDesktopIconDto, DesktopIconDao eDesktopIconDao) {
        eDesktopIconDao.setName(vDesktopIconDto.name());
        eDesktopIconDao.setCreation(vDesktopIconDto.creation());
        eDesktopIconDao.setModified(vDesktopIconDto.modified());
        eDesktopIconDao.setModifiedBy(vDesktopIconDto.modifiedBy());
        eDesktopIconDao.setOwner(vDesktopIconDto.owner());
        eDesktopIconDao.setIsDocStatus(vDesktopIconDto.isDocStatus());
        eDesktopIconDao.setIdx(vDesktopIconDto.idx());
        eDesktopIconDao.setModuleName(vDesktopIconDto.moduleName());
        eDesktopIconDao.setLabel(vDesktopIconDto.label());
        eDesktopIconDao.setStandard(vDesktopIconDto.standard());
        eDesktopIconDao.setCustom(vDesktopIconDto.custom());
        eDesktopIconDao.setApp(vDesktopIconDto.app());
        eDesktopIconDao.setDescription(vDesktopIconDto.description());
        eDesktopIconDao.setCategory(vDesktopIconDto.category());
        eDesktopIconDao.setHidden(vDesktopIconDto.hidden());
        eDesktopIconDao.setBlocked(vDesktopIconDto.blocked());
        eDesktopIconDao.setForceShow(vDesktopIconDto.forceShow());
        eDesktopIconDao.setType(vDesktopIconDto.type());
        eDesktopIconDao.setDocType(vDesktopIconDto.docType());
        eDesktopIconDao.setReport(vDesktopIconDto.report());
        eDesktopIconDao.setLink(vDesktopIconDto.link());
        eDesktopIconDao.setColor(vDesktopIconDto.color());
        eDesktopIconDao.setIcon(vDesktopIconDto.icon());
        eDesktopIconDao.setReverse(vDesktopIconDto.reverse());
        eDesktopIconDao.setUserTags(vDesktopIconDto.userTags());
        eDesktopIconDao.setComments(vDesktopIconDto.comments());
        eDesktopIconDao.setAssign(vDesktopIconDto.assign());
        eDesktopIconDao.setLikedBy(vDesktopIconDto.likedBy());
    }
}