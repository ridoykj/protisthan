package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ChequePrintTemplateDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ChequePrintTemplateDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean hasPrintFormat,
        String bankName,
        String chequeSize,
        BigDecimal startingPositionFromTopEdge,
        BigDecimal chequeWidth,
        BigDecimal chequeHeight,
        String scannedCheque,
        Boolean isAccountPayable,
        BigDecimal accPayDistFromTopEdge,
        BigDecimal accPayDistFromLeftEdge,
        String messageToShow,
        BigDecimal dateDistFromTopEdge,
        BigDecimal dateDistFromLeftEdge,
        BigDecimal payerNameFromTopEdge,
        BigDecimal payerNameFromLeftEdge,
        BigDecimal amtInWordsFromTopEdge,
        BigDecimal amtInWordsFromLeftEdge,
        BigDecimal amtInWordWidth,
        BigDecimal amtInWordsLineSpacing,
        BigDecimal amtInFiguresFromTopEdge,
        BigDecimal amtInFiguresFromLeftEdge,
        BigDecimal accNoDistFromTopEdge,
        BigDecimal accNoDistFromLeftEdge,
        BigDecimal signatoryFromTopEdge,
        BigDecimal signatoryFromLeftEdge,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ChequePrintTemplateDto fromEntity(ChequePrintTemplateDao eChequePrintTemplateDao) {
        return new ChequePrintTemplateDto(
                eChequePrintTemplateDao.getName(),
                eChequePrintTemplateDao.getCreation(),
                eChequePrintTemplateDao.getModified(),
                eChequePrintTemplateDao.getModifiedBy(),
                eChequePrintTemplateDao.getOwner(),
                eChequePrintTemplateDao.getIsDocStatus(),
                eChequePrintTemplateDao.getIdx(),
                eChequePrintTemplateDao.getHasPrintFormat(),
                eChequePrintTemplateDao.getBankName(),
                eChequePrintTemplateDao.getChequeSize(),
                eChequePrintTemplateDao.getStartingPositionFromTopEdge(),
                eChequePrintTemplateDao.getChequeWidth(),
                eChequePrintTemplateDao.getChequeHeight(),
                eChequePrintTemplateDao.getScannedCheque(),
                eChequePrintTemplateDao.getIsAccountPayable(),
                eChequePrintTemplateDao.getAccPayDistFromTopEdge(),
                eChequePrintTemplateDao.getAccPayDistFromLeftEdge(),
                eChequePrintTemplateDao.getMessageToShow(),
                eChequePrintTemplateDao.getDateDistFromTopEdge(),
                eChequePrintTemplateDao.getDateDistFromLeftEdge(),
                eChequePrintTemplateDao.getPayerNameFromTopEdge(),
                eChequePrintTemplateDao.getPayerNameFromLeftEdge(),
                eChequePrintTemplateDao.getAmtInWordsFromTopEdge(),
                eChequePrintTemplateDao.getAmtInWordsFromLeftEdge(),
                eChequePrintTemplateDao.getAmtInWordWidth(),
                eChequePrintTemplateDao.getAmtInWordsLineSpacing(),
                eChequePrintTemplateDao.getAmtInFiguresFromTopEdge(),
                eChequePrintTemplateDao.getAmtInFiguresFromLeftEdge(),
                eChequePrintTemplateDao.getAccNoDistFromTopEdge(),
                eChequePrintTemplateDao.getAccNoDistFromLeftEdge(),
                eChequePrintTemplateDao.getSignatoryFromTopEdge(),
                eChequePrintTemplateDao.getSignatoryFromLeftEdge(),
                eChequePrintTemplateDao.getUserTags(),
                eChequePrintTemplateDao.getComments(),
                eChequePrintTemplateDao.getAssign(),
                eChequePrintTemplateDao.getLikedBy());
    }

    public static void fromDTO(ChequePrintTemplateDto vChequePrintTemplateDto, ChequePrintTemplateDao eChequePrintTemplateDao) {
        eChequePrintTemplateDao.setName(vChequePrintTemplateDto.name());
        eChequePrintTemplateDao.setCreation(vChequePrintTemplateDto.creation());
        eChequePrintTemplateDao.setModified(vChequePrintTemplateDto.modified());
        eChequePrintTemplateDao.setModifiedBy(vChequePrintTemplateDto.modifiedBy());
        eChequePrintTemplateDao.setOwner(vChequePrintTemplateDto.owner());
        eChequePrintTemplateDao.setIsDocStatus(vChequePrintTemplateDto.isDocStatus());
        eChequePrintTemplateDao.setIdx(vChequePrintTemplateDto.idx());
        eChequePrintTemplateDao.setHasPrintFormat(vChequePrintTemplateDto.hasPrintFormat());
        eChequePrintTemplateDao.setBankName(vChequePrintTemplateDto.bankName());
        eChequePrintTemplateDao.setChequeSize(vChequePrintTemplateDto.chequeSize());
        eChequePrintTemplateDao.setStartingPositionFromTopEdge(vChequePrintTemplateDto.startingPositionFromTopEdge());
        eChequePrintTemplateDao.setChequeWidth(vChequePrintTemplateDto.chequeWidth());
        eChequePrintTemplateDao.setChequeHeight(vChequePrintTemplateDto.chequeHeight());
        eChequePrintTemplateDao.setScannedCheque(vChequePrintTemplateDto.scannedCheque());
        eChequePrintTemplateDao.setIsAccountPayable(vChequePrintTemplateDto.isAccountPayable());
        eChequePrintTemplateDao.setAccPayDistFromTopEdge(vChequePrintTemplateDto.accPayDistFromTopEdge());
        eChequePrintTemplateDao.setAccPayDistFromLeftEdge(vChequePrintTemplateDto.accPayDistFromLeftEdge());
        eChequePrintTemplateDao.setMessageToShow(vChequePrintTemplateDto.messageToShow());
        eChequePrintTemplateDao.setDateDistFromTopEdge(vChequePrintTemplateDto.dateDistFromTopEdge());
        eChequePrintTemplateDao.setDateDistFromLeftEdge(vChequePrintTemplateDto.dateDistFromLeftEdge());
        eChequePrintTemplateDao.setPayerNameFromTopEdge(vChequePrintTemplateDto.payerNameFromTopEdge());
        eChequePrintTemplateDao.setPayerNameFromLeftEdge(vChequePrintTemplateDto.payerNameFromLeftEdge());
        eChequePrintTemplateDao.setAmtInWordsFromTopEdge(vChequePrintTemplateDto.amtInWordsFromTopEdge());
        eChequePrintTemplateDao.setAmtInWordsFromLeftEdge(vChequePrintTemplateDto.amtInWordsFromLeftEdge());
        eChequePrintTemplateDao.setAmtInWordWidth(vChequePrintTemplateDto.amtInWordWidth());
        eChequePrintTemplateDao.setAmtInWordsLineSpacing(vChequePrintTemplateDto.amtInWordsLineSpacing());
        eChequePrintTemplateDao.setAmtInFiguresFromTopEdge(vChequePrintTemplateDto.amtInFiguresFromTopEdge());
        eChequePrintTemplateDao.setAmtInFiguresFromLeftEdge(vChequePrintTemplateDto.amtInFiguresFromLeftEdge());
        eChequePrintTemplateDao.setAccNoDistFromTopEdge(vChequePrintTemplateDto.accNoDistFromTopEdge());
        eChequePrintTemplateDao.setAccNoDistFromLeftEdge(vChequePrintTemplateDto.accNoDistFromLeftEdge());
        eChequePrintTemplateDao.setSignatoryFromTopEdge(vChequePrintTemplateDto.signatoryFromTopEdge());
        eChequePrintTemplateDao.setSignatoryFromLeftEdge(vChequePrintTemplateDto.signatoryFromLeftEdge());
        eChequePrintTemplateDao.setUserTags(vChequePrintTemplateDto.userTags());
        eChequePrintTemplateDao.setComments(vChequePrintTemplateDto.comments());
        eChequePrintTemplateDao.setAssign(vChequePrintTemplateDto.assign());
        eChequePrintTemplateDao.setLikedBy(vChequePrintTemplateDto.likedBy());
    }
}