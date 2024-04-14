package com.itbd.application.db.dto.tasks;

import com.itbd.application.db.dao.tasks.TaxWithholdingCategoryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TaxWithholdingCategoryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String categoryName,
        Boolean roundOffTaxAmount,
        Boolean considerPartyLedgerAmount,
        Boolean taxOnExcessAmount,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TaxWithholdingCategoryDto fromEntity(TaxWithholdingCategoryDao eTaxWithholdingCategoryDao) {
        return new TaxWithholdingCategoryDto(
                eTaxWithholdingCategoryDao.getName(),
                eTaxWithholdingCategoryDao.getCreation(),
                eTaxWithholdingCategoryDao.getModified(),
                eTaxWithholdingCategoryDao.getModifiedBy(),
                eTaxWithholdingCategoryDao.getOwner(),
                eTaxWithholdingCategoryDao.getIsDocStatus(),
                eTaxWithholdingCategoryDao.getIdx(),
                eTaxWithholdingCategoryDao.getCategoryName(),
                eTaxWithholdingCategoryDao.getRoundOffTaxAmount(),
                eTaxWithholdingCategoryDao.getConsiderPartyLedgerAmount(),
                eTaxWithholdingCategoryDao.getTaxOnExcessAmount(),
                eTaxWithholdingCategoryDao.getUserTags(),
                eTaxWithholdingCategoryDao.getComments(),
                eTaxWithholdingCategoryDao.getAssign(),
                eTaxWithholdingCategoryDao.getLikedBy());
    }

    public static void fromDTO(TaxWithholdingCategoryDto vTaxWithholdingCategoryDto, TaxWithholdingCategoryDao eTaxWithholdingCategoryDao) {
        eTaxWithholdingCategoryDao.setName(vTaxWithholdingCategoryDto.name());
        eTaxWithholdingCategoryDao.setCreation(vTaxWithholdingCategoryDto.creation());
        eTaxWithholdingCategoryDao.setModified(vTaxWithholdingCategoryDto.modified());
        eTaxWithholdingCategoryDao.setModifiedBy(vTaxWithholdingCategoryDto.modifiedBy());
        eTaxWithholdingCategoryDao.setOwner(vTaxWithholdingCategoryDto.owner());
        eTaxWithholdingCategoryDao.setIsDocStatus(vTaxWithholdingCategoryDto.isDocStatus());
        eTaxWithholdingCategoryDao.setIdx(vTaxWithholdingCategoryDto.idx());
        eTaxWithholdingCategoryDao.setCategoryName(vTaxWithholdingCategoryDto.categoryName());
        eTaxWithholdingCategoryDao.setRoundOffTaxAmount(vTaxWithholdingCategoryDto.roundOffTaxAmount());
        eTaxWithholdingCategoryDao.setConsiderPartyLedgerAmount(vTaxWithholdingCategoryDto.considerPartyLedgerAmount());
        eTaxWithholdingCategoryDao.setTaxOnExcessAmount(vTaxWithholdingCategoryDto.taxOnExcessAmount());
        eTaxWithholdingCategoryDao.setUserTags(vTaxWithholdingCategoryDto.userTags());
        eTaxWithholdingCategoryDao.setComments(vTaxWithholdingCategoryDto.comments());
        eTaxWithholdingCategoryDao.setAssign(vTaxWithholdingCategoryDto.assign());
        eTaxWithholdingCategoryDao.setLikedBy(vTaxWithholdingCategoryDto.likedBy());
    }
}