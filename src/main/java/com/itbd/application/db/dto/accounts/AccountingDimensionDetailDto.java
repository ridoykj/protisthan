package com.itbd.application.db.dto.accounts;

import com.itbd.application.db.dao.accounts.AccountingDimensionDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AccountingDimensionDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String referenceDocument,
        String defaultDimension,
        Boolean mandatoryForBs,
        Boolean mandatoryForPl,
        Boolean automaticallyPostBalancingAccountingEntry,
        String offsettingAccount,
        String parent,
        String parentField,
        String parentType
) {
    public static AccountingDimensionDetailDto fromEntity(AccountingDimensionDetailDao eAccountingDimensionDetailDao) {
        return new AccountingDimensionDetailDto(
                eAccountingDimensionDetailDao.getName(),
                eAccountingDimensionDetailDao.getCreation(),
                eAccountingDimensionDetailDao.getModified(),
                eAccountingDimensionDetailDao.getModifiedBy(),
                eAccountingDimensionDetailDao.getOwner(),
                eAccountingDimensionDetailDao.getIsDocStatus(),
                eAccountingDimensionDetailDao.getIdx(),
                eAccountingDimensionDetailDao.getCompany(),
                eAccountingDimensionDetailDao.getReferenceDocument(),
                eAccountingDimensionDetailDao.getDefaultDimension(),
                eAccountingDimensionDetailDao.getMandatoryForBs(),
                eAccountingDimensionDetailDao.getMandatoryForPl(),
                eAccountingDimensionDetailDao.getAutomaticallyPostBalancingAccountingEntry(),
                eAccountingDimensionDetailDao.getOffsettingAccount(),
                eAccountingDimensionDetailDao.getParent(),
                eAccountingDimensionDetailDao.getParentField(),
                eAccountingDimensionDetailDao.getParentType());
    }

    public static void fromDTO(AccountingDimensionDetailDto vAccountingDimensionDetailDto, AccountingDimensionDetailDao eAccountingDimensionDetailDao) {
        eAccountingDimensionDetailDao.setName(vAccountingDimensionDetailDto.name());
        eAccountingDimensionDetailDao.setCreation(vAccountingDimensionDetailDto.creation());
        eAccountingDimensionDetailDao.setModified(vAccountingDimensionDetailDto.modified());
        eAccountingDimensionDetailDao.setModifiedBy(vAccountingDimensionDetailDto.modifiedBy());
        eAccountingDimensionDetailDao.setOwner(vAccountingDimensionDetailDto.owner());
        eAccountingDimensionDetailDao.setIsDocStatus(vAccountingDimensionDetailDto.isDocStatus());
        eAccountingDimensionDetailDao.setIdx(vAccountingDimensionDetailDto.idx());
        eAccountingDimensionDetailDao.setCompany(vAccountingDimensionDetailDto.company());
        eAccountingDimensionDetailDao.setReferenceDocument(vAccountingDimensionDetailDto.referenceDocument());
        eAccountingDimensionDetailDao.setDefaultDimension(vAccountingDimensionDetailDto.defaultDimension());
        eAccountingDimensionDetailDao.setMandatoryForBs(vAccountingDimensionDetailDto.mandatoryForBs());
        eAccountingDimensionDetailDao.setMandatoryForPl(vAccountingDimensionDetailDto.mandatoryForPl());
        eAccountingDimensionDetailDao.setAutomaticallyPostBalancingAccountingEntry(vAccountingDimensionDetailDto.automaticallyPostBalancingAccountingEntry());
        eAccountingDimensionDetailDao.setOffsettingAccount(vAccountingDimensionDetailDto.offsettingAccount());
        eAccountingDimensionDetailDao.setParent(vAccountingDimensionDetailDto.parent());
        eAccountingDimensionDetailDao.setParentField(vAccountingDimensionDetailDto.parentField());
        eAccountingDimensionDetailDao.setParentType(vAccountingDimensionDetailDto.parentType());
    }
}