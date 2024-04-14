package com.itbd.application.db.dto.print;

import com.itbd.application.db.dao.print.PrintStyleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PrintStyleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String printStyleName,
        Boolean disabled,
        Boolean standard,
        String css,
        String preview,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PrintStyleDto fromEntity(PrintStyleDao ePrintStyleDao) {
        return new PrintStyleDto(
                ePrintStyleDao.getName(),
                ePrintStyleDao.getCreation(),
                ePrintStyleDao.getModified(),
                ePrintStyleDao.getModifiedBy(),
                ePrintStyleDao.getOwner(),
                ePrintStyleDao.getIsDocStatus(),
                ePrintStyleDao.getIdx(),
                ePrintStyleDao.getPrintStyleName(),
                ePrintStyleDao.getDisabled(),
                ePrintStyleDao.getStandard(),
                ePrintStyleDao.getCss(),
                ePrintStyleDao.getPreview(),
                ePrintStyleDao.getUserTags(),
                ePrintStyleDao.getComments(),
                ePrintStyleDao.getAssign(),
                ePrintStyleDao.getLikedBy());
    }

    public static void fromDTO(PrintStyleDto vPrintStyleDto, PrintStyleDao ePrintStyleDao) {
        ePrintStyleDao.setName(vPrintStyleDto.name());
        ePrintStyleDao.setCreation(vPrintStyleDto.creation());
        ePrintStyleDao.setModified(vPrintStyleDto.modified());
        ePrintStyleDao.setModifiedBy(vPrintStyleDto.modifiedBy());
        ePrintStyleDao.setOwner(vPrintStyleDto.owner());
        ePrintStyleDao.setIsDocStatus(vPrintStyleDto.isDocStatus());
        ePrintStyleDao.setIdx(vPrintStyleDto.idx());
        ePrintStyleDao.setPrintStyleName(vPrintStyleDto.printStyleName());
        ePrintStyleDao.setDisabled(vPrintStyleDto.disabled());
        ePrintStyleDao.setStandard(vPrintStyleDto.standard());
        ePrintStyleDao.setCss(vPrintStyleDto.css());
        ePrintStyleDao.setPreview(vPrintStyleDto.preview());
        ePrintStyleDao.setUserTags(vPrintStyleDto.userTags());
        ePrintStyleDao.setComments(vPrintStyleDto.comments());
        ePrintStyleDao.setAssign(vPrintStyleDto.assign());
        ePrintStyleDao.setLikedBy(vPrintStyleDto.likedBy());
    }
}