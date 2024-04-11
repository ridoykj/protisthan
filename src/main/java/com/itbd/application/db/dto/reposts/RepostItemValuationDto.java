package com.itbd.application.db.dto.reposts;

import com.itbd.application.db.dao.reposts.RepostItemValuationDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record RepostItemValuationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String basedOn,
        String voucherType,
        String voucherNo,
        String itemCode,
        String warehouse,
        LocalDate postingDate,
        LocalTime postingTime,
        String status,
        String company,
        Boolean allowNegativeStock,
        Boolean viaLandedCostVoucher,
        Boolean allowZeroRate,
        String amendedFrom,
        String errorLog,
        String repostingDataFile,
        String itemsToBeRepost,
        String distinctItemAndWarehouse,
        Integer totalRepostingCount,
        Integer currentIndex,
        Integer glRepostingIndex,
        String affectedTransactions,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static RepostItemValuationDto fromEntity(RepostItemValuationDao eRepostItemValuationDao) {
        return new RepostItemValuationDto(
                eRepostItemValuationDao.getName(),
                eRepostItemValuationDao.getCreation(),
                eRepostItemValuationDao.getModified(),
                eRepostItemValuationDao.getModifiedBy(),
                eRepostItemValuationDao.getOwner(),
                eRepostItemValuationDao.getIsDocStatus(),
                eRepostItemValuationDao.getIdx(),
                eRepostItemValuationDao.getBasedOn(),
                eRepostItemValuationDao.getVoucherType(),
                eRepostItemValuationDao.getVoucherNo(),
                eRepostItemValuationDao.getItemCode(),
                eRepostItemValuationDao.getWarehouse(),
                eRepostItemValuationDao.getPostingDate(),
                eRepostItemValuationDao.getPostingTime(),
                eRepostItemValuationDao.getStatus(),
                eRepostItemValuationDao.getCompany(),
                eRepostItemValuationDao.getAllowNegativeStock(),
                eRepostItemValuationDao.getViaLandedCostVoucher(),
                eRepostItemValuationDao.getAllowZeroRate(),
                eRepostItemValuationDao.getAmendedFrom(),
                eRepostItemValuationDao.getErrorLog(),
                eRepostItemValuationDao.getRepostingDataFile(),
                eRepostItemValuationDao.getItemsToBeRepost(),
                eRepostItemValuationDao.getDistinctItemAndWarehouse(),
                eRepostItemValuationDao.getTotalRepostingCount(),
                eRepostItemValuationDao.getCurrentIndex(),
                eRepostItemValuationDao.getGlRepostingIndex(),
                eRepostItemValuationDao.getAffectedTransactions(),
                eRepostItemValuationDao.getUserTags(),
                eRepostItemValuationDao.getComments(),
                eRepostItemValuationDao.getAssign(),
                eRepostItemValuationDao.getLikedBy());
    }

    public static void fromDTO(RepostItemValuationDto vRepostItemValuationDto, RepostItemValuationDao eRepostItemValuationDao) {
        eRepostItemValuationDao.setName(vRepostItemValuationDto.name());
        eRepostItemValuationDao.setCreation(vRepostItemValuationDto.creation());
        eRepostItemValuationDao.setModified(vRepostItemValuationDto.modified());
        eRepostItemValuationDao.setModifiedBy(vRepostItemValuationDto.modifiedBy());
        eRepostItemValuationDao.setOwner(vRepostItemValuationDto.owner());
        eRepostItemValuationDao.setIsDocStatus(vRepostItemValuationDto.isDocStatus());
        eRepostItemValuationDao.setIdx(vRepostItemValuationDto.idx());
        eRepostItemValuationDao.setBasedOn(vRepostItemValuationDto.basedOn());
        eRepostItemValuationDao.setVoucherType(vRepostItemValuationDto.voucherType());
        eRepostItemValuationDao.setVoucherNo(vRepostItemValuationDto.voucherNo());
        eRepostItemValuationDao.setItemCode(vRepostItemValuationDto.itemCode());
        eRepostItemValuationDao.setWarehouse(vRepostItemValuationDto.warehouse());
        eRepostItemValuationDao.setPostingDate(vRepostItemValuationDto.postingDate());
        eRepostItemValuationDao.setPostingTime(vRepostItemValuationDto.postingTime());
        eRepostItemValuationDao.setStatus(vRepostItemValuationDto.status());
        eRepostItemValuationDao.setCompany(vRepostItemValuationDto.company());
        eRepostItemValuationDao.setAllowNegativeStock(vRepostItemValuationDto.allowNegativeStock());
        eRepostItemValuationDao.setViaLandedCostVoucher(vRepostItemValuationDto.viaLandedCostVoucher());
        eRepostItemValuationDao.setAllowZeroRate(vRepostItemValuationDto.allowZeroRate());
        eRepostItemValuationDao.setAmendedFrom(vRepostItemValuationDto.amendedFrom());
        eRepostItemValuationDao.setErrorLog(vRepostItemValuationDto.errorLog());
        eRepostItemValuationDao.setRepostingDataFile(vRepostItemValuationDto.repostingDataFile());
        eRepostItemValuationDao.setItemsToBeRepost(vRepostItemValuationDto.itemsToBeRepost());
        eRepostItemValuationDao.setDistinctItemAndWarehouse(vRepostItemValuationDto.distinctItemAndWarehouse());
        eRepostItemValuationDao.setTotalRepostingCount(vRepostItemValuationDto.totalRepostingCount());
        eRepostItemValuationDao.setCurrentIndex(vRepostItemValuationDto.currentIndex());
        eRepostItemValuationDao.setGlRepostingIndex(vRepostItemValuationDto.glRepostingIndex());
        eRepostItemValuationDao.setAffectedTransactions(vRepostItemValuationDto.affectedTransactions());
        eRepostItemValuationDao.setUserTags(vRepostItemValuationDto.userTags());
        eRepostItemValuationDao.setComments(vRepostItemValuationDto.comments());
        eRepostItemValuationDao.setAssign(vRepostItemValuationDto.assign());
        eRepostItemValuationDao.setLikedBy(vRepostItemValuationDto.likedBy());
    }
}