package com.itbd.application.db.dto;

import com.itbd.application.db.dao.printing.LetterHeadDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LetterHeadDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String letterHeadName,
        String source,
        String footerSource,
        Boolean disabled,
        Boolean isDefault,
        String image,
        BigDecimal imageHeight,
        BigDecimal imageWidth,
        String align,
        String content,
        String footer,
        String footerImage,
        BigDecimal footerImageHeight,
        BigDecimal footerImageWidth,
        String footerAlign,
        String headerScript,
        String footerScript,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static LetterHeadDto fromEntity(LetterHeadDao eLetterHeadDao) {
        return new LetterHeadDto(
                eLetterHeadDao.getName(),
                eLetterHeadDao.getCreation(),
                eLetterHeadDao.getModified(),
                eLetterHeadDao.getModifiedBy(),
                eLetterHeadDao.getOwner(),
                eLetterHeadDao.getIsDocStatus(),
                eLetterHeadDao.getIdx(),
                eLetterHeadDao.getLetterHeadName(),
                eLetterHeadDao.getSource(),
                eLetterHeadDao.getFooterSource(),
                eLetterHeadDao.getDisabled(),
                eLetterHeadDao.getIsDefault(),
                eLetterHeadDao.getImage(),
                eLetterHeadDao.getImageHeight(),
                eLetterHeadDao.getImageWidth(),
                eLetterHeadDao.getAlign(),
                eLetterHeadDao.getContent(),
                eLetterHeadDao.getFooter(),
                eLetterHeadDao.getFooterImage(),
                eLetterHeadDao.getFooterImageHeight(),
                eLetterHeadDao.getFooterImageWidth(),
                eLetterHeadDao.getFooterAlign(),
                eLetterHeadDao.getHeaderScript(),
                eLetterHeadDao.getFooterScript(),
                eLetterHeadDao.getUserTags(),
                eLetterHeadDao.getComments(),
                eLetterHeadDao.getAssign(),
                eLetterHeadDao.getLikedBy());
    }

    public static void fromDTO(LetterHeadDto vLetterHeadDto, LetterHeadDao eLetterHeadDao) {
        eLetterHeadDao.setName(vLetterHeadDto.name());
        eLetterHeadDao.setCreation(vLetterHeadDto.creation());
        eLetterHeadDao.setModified(vLetterHeadDto.modified());
        eLetterHeadDao.setModifiedBy(vLetterHeadDto.modifiedBy());
        eLetterHeadDao.setOwner(vLetterHeadDto.owner());
        eLetterHeadDao.setIsDocStatus(vLetterHeadDto.isDocStatus());
        eLetterHeadDao.setIdx(vLetterHeadDto.idx());
        eLetterHeadDao.setLetterHeadName(vLetterHeadDto.letterHeadName());
        eLetterHeadDao.setSource(vLetterHeadDto.source());
        eLetterHeadDao.setFooterSource(vLetterHeadDto.footerSource());
        eLetterHeadDao.setDisabled(vLetterHeadDto.disabled());
        eLetterHeadDao.setIsDefault(vLetterHeadDto.isDefault());
        eLetterHeadDao.setImage(vLetterHeadDto.image());
        eLetterHeadDao.setImageHeight(vLetterHeadDto.imageHeight());
        eLetterHeadDao.setImageWidth(vLetterHeadDto.imageWidth());
        eLetterHeadDao.setAlign(vLetterHeadDto.align());
        eLetterHeadDao.setContent(vLetterHeadDto.content());
        eLetterHeadDao.setFooter(vLetterHeadDto.footer());
        eLetterHeadDao.setFooterImage(vLetterHeadDto.footerImage());
        eLetterHeadDao.setFooterImageHeight(vLetterHeadDto.footerImageHeight());
        eLetterHeadDao.setFooterImageWidth(vLetterHeadDto.footerImageWidth());
        eLetterHeadDao.setFooterAlign(vLetterHeadDto.footerAlign());
        eLetterHeadDao.setHeaderScript(vLetterHeadDto.headerScript());
        eLetterHeadDao.setFooterScript(vLetterHeadDto.footerScript());
        eLetterHeadDao.setUserTags(vLetterHeadDto.userTags());
        eLetterHeadDao.setComments(vLetterHeadDto.comments());
        eLetterHeadDao.setAssign(vLetterHeadDto.assign());
        eLetterHeadDao.setLikedBy(vLetterHeadDto.likedBy());
    }
}