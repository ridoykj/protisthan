package com.itbd.application.db.dto.accounts;

import com.itbd.application.db.dao.accounts.AccountingDimensionFilterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AccountingDimensionFilterDto(
        @Id String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String accountingDimension,
        Boolean disabled,
        String company,
        Boolean applyRestrictionOnValues,
        String allowOrRestrict,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AccountingDimensionFilterDto fromEntity(AccountingDimensionFilterDao eAccountingDimensionFilterDao) {
        return new AccountingDimensionFilterDto(
                eAccountingDimensionFilterDao.getName(),
                eAccountingDimensionFilterDao.getCreation(),
                eAccountingDimensionFilterDao.getModified(),
                eAccountingDimensionFilterDao.getModifiedBy(),
                eAccountingDimensionFilterDao.getOwner(),
                eAccountingDimensionFilterDao.getIsDocStatus(),
                eAccountingDimensionFilterDao.getIdx(),
                eAccountingDimensionFilterDao.getAccountingDimension(),
                eAccountingDimensionFilterDao.getDisabled(),
                eAccountingDimensionFilterDao.getCompany(),
                eAccountingDimensionFilterDao.getApplyRestrictionOnValues(),
                eAccountingDimensionFilterDao.getAllowOrRestrict(),
                eAccountingDimensionFilterDao.getUserTags(),
                eAccountingDimensionFilterDao.getComments(),
                eAccountingDimensionFilterDao.getAssign(),
                eAccountingDimensionFilterDao.getLikedBy());
    }

    public static void fromDTO(AccountingDimensionFilterDto vAccountingDimensionFilterDto, AccountingDimensionFilterDao eAccountingDimensionFilterDao) {
        eAccountingDimensionFilterDao.setName(vAccountingDimensionFilterDto.name());
        eAccountingDimensionFilterDao.setCreation(vAccountingDimensionFilterDto.creation());
        eAccountingDimensionFilterDao.setModified(vAccountingDimensionFilterDto.modified());
        eAccountingDimensionFilterDao.setModifiedBy(vAccountingDimensionFilterDto.modifiedBy());
        eAccountingDimensionFilterDao.setOwner(vAccountingDimensionFilterDto.owner());
        eAccountingDimensionFilterDao.setIsDocStatus(vAccountingDimensionFilterDto.isDocStatus());
        eAccountingDimensionFilterDao.setIdx(vAccountingDimensionFilterDto.idx());
        eAccountingDimensionFilterDao.setAccountingDimension(vAccountingDimensionFilterDto.accountingDimension());
        eAccountingDimensionFilterDao.setDisabled(vAccountingDimensionFilterDto.disabled());
        eAccountingDimensionFilterDao.setCompany(vAccountingDimensionFilterDto.company());
        eAccountingDimensionFilterDao.setApplyRestrictionOnValues(vAccountingDimensionFilterDto.applyRestrictionOnValues());
        eAccountingDimensionFilterDao.setAllowOrRestrict(vAccountingDimensionFilterDto.allowOrRestrict());
        eAccountingDimensionFilterDao.setUserTags(vAccountingDimensionFilterDto.userTags());
        eAccountingDimensionFilterDao.setComments(vAccountingDimensionFilterDto.comments());
        eAccountingDimensionFilterDao.setAssign(vAccountingDimensionFilterDto.assign());
        eAccountingDimensionFilterDao.setLikedBy(vAccountingDimensionFilterDto.likedBy());
    }
}