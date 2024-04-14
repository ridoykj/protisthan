package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemDefaultDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemDefaultDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String defaultWarehouse,
        String defaultPriceList,
        String defaultDiscountAccount,
        String buyingCostCenter,
        String defaultSupplier,
        String expenseAccount,
        String defaultProvisionalAccount,
        String sellingCostCenter,
        String incomeAccount,
        String deferredExpenseAccount,
        String deferredRevenueAccount,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemDefaultDto fromEntity(ItemDefaultDao eItemDefaultDao) {
        return new ItemDefaultDto(
                eItemDefaultDao.getName(),
                eItemDefaultDao.getCreation(),
                eItemDefaultDao.getModified(),
                eItemDefaultDao.getModifiedBy(),
                eItemDefaultDao.getOwner(),
                eItemDefaultDao.getIsDocStatus(),
                eItemDefaultDao.getIdx(),
                eItemDefaultDao.getCompany(),
                eItemDefaultDao.getDefaultWarehouse(),
                eItemDefaultDao.getDefaultPriceList(),
                eItemDefaultDao.getDefaultDiscountAccount(),
                eItemDefaultDao.getBuyingCostCenter(),
                eItemDefaultDao.getDefaultSupplier(),
                eItemDefaultDao.getExpenseAccount(),
                eItemDefaultDao.getDefaultProvisionalAccount(),
                eItemDefaultDao.getSellingCostCenter(),
                eItemDefaultDao.getIncomeAccount(),
                eItemDefaultDao.getDeferredExpenseAccount(),
                eItemDefaultDao.getDeferredRevenueAccount(),
                eItemDefaultDao.getParent(),
                eItemDefaultDao.getParentField(),
                eItemDefaultDao.getParentType());
    }

    public static void fromDTO(ItemDefaultDto vItemDefaultDto, ItemDefaultDao eItemDefaultDao) {
        eItemDefaultDao.setName(vItemDefaultDto.name());
        eItemDefaultDao.setCreation(vItemDefaultDto.creation());
        eItemDefaultDao.setModified(vItemDefaultDto.modified());
        eItemDefaultDao.setModifiedBy(vItemDefaultDto.modifiedBy());
        eItemDefaultDao.setOwner(vItemDefaultDto.owner());
        eItemDefaultDao.setIsDocStatus(vItemDefaultDto.isDocStatus());
        eItemDefaultDao.setIdx(vItemDefaultDto.idx());
        eItemDefaultDao.setCompany(vItemDefaultDto.company());
        eItemDefaultDao.setDefaultWarehouse(vItemDefaultDto.defaultWarehouse());
        eItemDefaultDao.setDefaultPriceList(vItemDefaultDto.defaultPriceList());
        eItemDefaultDao.setDefaultDiscountAccount(vItemDefaultDto.defaultDiscountAccount());
        eItemDefaultDao.setBuyingCostCenter(vItemDefaultDto.buyingCostCenter());
        eItemDefaultDao.setDefaultSupplier(vItemDefaultDto.defaultSupplier());
        eItemDefaultDao.setExpenseAccount(vItemDefaultDto.expenseAccount());
        eItemDefaultDao.setDefaultProvisionalAccount(vItemDefaultDto.defaultProvisionalAccount());
        eItemDefaultDao.setSellingCostCenter(vItemDefaultDto.sellingCostCenter());
        eItemDefaultDao.setIncomeAccount(vItemDefaultDto.incomeAccount());
        eItemDefaultDao.setDeferredExpenseAccount(vItemDefaultDto.deferredExpenseAccount());
        eItemDefaultDao.setDeferredRevenueAccount(vItemDefaultDto.deferredRevenueAccount());
        eItemDefaultDao.setParent(vItemDefaultDto.parent());
        eItemDefaultDao.setParentField(vItemDefaultDto.parentField());
        eItemDefaultDao.setParentType(vItemDefaultDto.parentType());
    }
}