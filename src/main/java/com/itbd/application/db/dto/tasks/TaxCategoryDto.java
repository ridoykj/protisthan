package com.itbd.application.db.dto.tasks;

import com.itbd.application.db.dao.accounts.tax.TaxCategoryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TaxCategoryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        Boolean disabled,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TaxCategoryDto fromEntity(TaxCategoryDao eTaxCategoryDao) {
        return new TaxCategoryDto(
                eTaxCategoryDao.getName(),
                eTaxCategoryDao.getCreation(),
                eTaxCategoryDao.getModified(),
                eTaxCategoryDao.getModifiedBy(),
                eTaxCategoryDao.getOwner(),
                eTaxCategoryDao.getIsDocStatus(),
                eTaxCategoryDao.getIdx(),
                eTaxCategoryDao.getTitle(),
                eTaxCategoryDao.getDisabled(),
                eTaxCategoryDao.getUserTags(),
                eTaxCategoryDao.getComments(),
                eTaxCategoryDao.getAssign(),
                eTaxCategoryDao.getLikedBy());
    }

    public static void fromDTO(TaxCategoryDto vTaxCategoryDto, TaxCategoryDao eTaxCategoryDao) {
        eTaxCategoryDao.setName(vTaxCategoryDto.name());
        eTaxCategoryDao.setCreation(vTaxCategoryDto.creation());
        eTaxCategoryDao.setModified(vTaxCategoryDto.modified());
        eTaxCategoryDao.setModifiedBy(vTaxCategoryDto.modifiedBy());
        eTaxCategoryDao.setOwner(vTaxCategoryDto.owner());
        eTaxCategoryDao.setIsDocStatus(vTaxCategoryDto.isDocStatus());
        eTaxCategoryDao.setIdx(vTaxCategoryDto.idx());
        eTaxCategoryDao.setTitle(vTaxCategoryDto.title());
        eTaxCategoryDao.setDisabled(vTaxCategoryDto.disabled());
        eTaxCategoryDao.setUserTags(vTaxCategoryDto.userTags());
        eTaxCategoryDao.setComments(vTaxCategoryDto.comments());
        eTaxCategoryDao.setAssign(vTaxCategoryDto.assign());
        eTaxCategoryDao.setLikedBy(vTaxCategoryDto.likedBy());
    }
}