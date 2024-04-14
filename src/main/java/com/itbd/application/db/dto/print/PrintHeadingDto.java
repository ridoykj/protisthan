package com.itbd.application.db.dto.print;

import com.itbd.application.db.dao.print.PrintHeadingDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PrintHeadingDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String printHeading,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PrintHeadingDto fromEntity(PrintHeadingDao ePrintHeadingDao) {
        return new PrintHeadingDto(
                ePrintHeadingDao.getName(),
                ePrintHeadingDao.getCreation(),
                ePrintHeadingDao.getModified(),
                ePrintHeadingDao.getModifiedBy(),
                ePrintHeadingDao.getOwner(),
                ePrintHeadingDao.getIsDocStatus(),
                ePrintHeadingDao.getIdx(),
                ePrintHeadingDao.getPrintHeading(),
                ePrintHeadingDao.getDescription(),
                ePrintHeadingDao.getUserTags(),
                ePrintHeadingDao.getComments(),
                ePrintHeadingDao.getAssign(),
                ePrintHeadingDao.getLikedBy());
    }

    public static void fromDTO(PrintHeadingDto vPrintHeadingDto, PrintHeadingDao ePrintHeadingDao) {
        ePrintHeadingDao.setName(vPrintHeadingDto.name());
        ePrintHeadingDao.setCreation(vPrintHeadingDto.creation());
        ePrintHeadingDao.setModified(vPrintHeadingDto.modified());
        ePrintHeadingDao.setModifiedBy(vPrintHeadingDto.modifiedBy());
        ePrintHeadingDao.setOwner(vPrintHeadingDto.owner());
        ePrintHeadingDao.setIsDocStatus(vPrintHeadingDto.isDocStatus());
        ePrintHeadingDao.setIdx(vPrintHeadingDto.idx());
        ePrintHeadingDao.setPrintHeading(vPrintHeadingDto.printHeading());
        ePrintHeadingDao.setDescription(vPrintHeadingDto.description());
        ePrintHeadingDao.setUserTags(vPrintHeadingDto.userTags());
        ePrintHeadingDao.setComments(vPrintHeadingDto.comments());
        ePrintHeadingDao.setAssign(vPrintHeadingDto.assign());
        ePrintHeadingDao.setLikedBy(vPrintHeadingDto.likedBy());
    }
}