package com.itbd.application.db.dto.shares;

import com.itbd.application.db.dao.shares.ShareTransferDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ShareTransferDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String transferType,
        LocalDate date,
        String fromShareholder,
        String fromFolioNo,
        String toShareholder,
        String toFolioNo,
        String equityOrLiabilityAccount,
        String assetAccount,
        String shareType,
        Integer fromNo,
        BigDecimal rate,
        Integer noOfShares,
        Integer toNo,
        BigDecimal amount,
        String company,
        String remarks,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ShareTransferDto fromEntity(ShareTransferDao eShareTransferDao) {
        return new ShareTransferDto(
                eShareTransferDao.getName(),
                eShareTransferDao.getCreation(),
                eShareTransferDao.getModified(),
                eShareTransferDao.getModifiedBy(),
                eShareTransferDao.getOwner(),
                eShareTransferDao.getIsDocStatus(),
                eShareTransferDao.getIdx(),
                eShareTransferDao.getTransferType(),
                eShareTransferDao.getDate(),
                eShareTransferDao.getFromShareholder(),
                eShareTransferDao.getFromFolioNo(),
                eShareTransferDao.getToShareholder(),
                eShareTransferDao.getToFolioNo(),
                eShareTransferDao.getEquityOrLiabilityAccount(),
                eShareTransferDao.getAssetAccount(),
                eShareTransferDao.getShareType(),
                eShareTransferDao.getFromNo(),
                eShareTransferDao.getRate(),
                eShareTransferDao.getNoOfShares(),
                eShareTransferDao.getToNo(),
                eShareTransferDao.getAmount(),
                eShareTransferDao.getCompany(),
                eShareTransferDao.getRemarks(),
                eShareTransferDao.getAmendedFrom(),
                eShareTransferDao.getUserTags(),
                eShareTransferDao.getComments(),
                eShareTransferDao.getAssign(),
                eShareTransferDao.getLikedBy());
    }

    public static void fromDTO(ShareTransferDto vShareTransferDto, ShareTransferDao eShareTransferDao) {
        eShareTransferDao.setName(vShareTransferDto.name());
        eShareTransferDao.setCreation(vShareTransferDto.creation());
        eShareTransferDao.setModified(vShareTransferDto.modified());
        eShareTransferDao.setModifiedBy(vShareTransferDto.modifiedBy());
        eShareTransferDao.setOwner(vShareTransferDto.owner());
        eShareTransferDao.setIsDocStatus(vShareTransferDto.isDocStatus());
        eShareTransferDao.setIdx(vShareTransferDto.idx());
        eShareTransferDao.setTransferType(vShareTransferDto.transferType());
        eShareTransferDao.setDate(vShareTransferDto.date());
        eShareTransferDao.setFromShareholder(vShareTransferDto.fromShareholder());
        eShareTransferDao.setFromFolioNo(vShareTransferDto.fromFolioNo());
        eShareTransferDao.setToShareholder(vShareTransferDto.toShareholder());
        eShareTransferDao.setToFolioNo(vShareTransferDto.toFolioNo());
        eShareTransferDao.setEquityOrLiabilityAccount(vShareTransferDto.equityOrLiabilityAccount());
        eShareTransferDao.setAssetAccount(vShareTransferDto.assetAccount());
        eShareTransferDao.setShareType(vShareTransferDto.shareType());
        eShareTransferDao.setFromNo(vShareTransferDto.fromNo());
        eShareTransferDao.setRate(vShareTransferDto.rate());
        eShareTransferDao.setNoOfShares(vShareTransferDto.noOfShares());
        eShareTransferDao.setToNo(vShareTransferDto.toNo());
        eShareTransferDao.setAmount(vShareTransferDto.amount());
        eShareTransferDao.setCompany(vShareTransferDto.company());
        eShareTransferDao.setRemarks(vShareTransferDto.remarks());
        eShareTransferDao.setAmendedFrom(vShareTransferDto.amendedFrom());
        eShareTransferDao.setUserTags(vShareTransferDto.userTags());
        eShareTransferDao.setComments(vShareTransferDto.comments());
        eShareTransferDao.setAssign(vShareTransferDto.assign());
        eShareTransferDao.setLikedBy(vShareTransferDto.likedBy());
    }
}