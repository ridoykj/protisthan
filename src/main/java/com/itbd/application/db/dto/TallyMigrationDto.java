package com.itbd.application.db.dto;

import com.itbd.application.db.dao.project_integrations.TallyMigrationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TallyMigrationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String status,
        String masterData,
        Boolean notifyEmployee,
        Boolean isMasterDataImported,
        String tallyCreditorsAccount,
        String tallyDebtorsAccount,
        String tallyCompany,
        String defaultUom,
        String erpnextCompany,
        String chartOfAccounts,
        String parties,
        String addresses,
        String uoms,
        String items,
        String vouchers,
        String defaultWarehouse,
        String defaultRoundOffAccount,
        String defaultCostCenter,
        String dayBookData,
        Boolean isDayBookDataProcessed,
        Integer isDayBookDataImported,
        String failedImportLog,
        String fixedErrorsLog,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TallyMigrationDto fromEntity(TallyMigrationDao eTallyMigrationDao) {
        return new TallyMigrationDto(
                eTallyMigrationDao.getName(),
                eTallyMigrationDao.getCreation(),
                eTallyMigrationDao.getModified(),
                eTallyMigrationDao.getModifiedBy(),
                eTallyMigrationDao.getOwner(),
                eTallyMigrationDao.getIsDocStatus(),
                eTallyMigrationDao.getIdx(),
                eTallyMigrationDao.getStatus(),
                eTallyMigrationDao.getMasterData(),
                eTallyMigrationDao.getNotifyEmployee(),
                eTallyMigrationDao.getIsMasterDataImported(),
                eTallyMigrationDao.getTallyCreditorsAccount(),
                eTallyMigrationDao.getTallyDebtorsAccount(),
                eTallyMigrationDao.getTallyCompany(),
                eTallyMigrationDao.getDefaultUom(),
                eTallyMigrationDao.getErpnextCompany(),
                eTallyMigrationDao.getChartOfAccounts(),
                eTallyMigrationDao.getParties(),
                eTallyMigrationDao.getAddresses(),
                eTallyMigrationDao.getUoms(),
                eTallyMigrationDao.getItems(),
                eTallyMigrationDao.getVouchers(),
                eTallyMigrationDao.getDefaultWarehouse(),
                eTallyMigrationDao.getDefaultRoundOffAccount(),
                eTallyMigrationDao.getDefaultCostCenter(),
                eTallyMigrationDao.getDayBookData(),
                eTallyMigrationDao.getIsDayBookDataProcessed(),
                eTallyMigrationDao.getIsDayBookDataImported(),
                eTallyMigrationDao.getFailedImportLog(),
                eTallyMigrationDao.getFixedErrorsLog(),
                eTallyMigrationDao.getUserTags(),
                eTallyMigrationDao.getComments(),
                eTallyMigrationDao.getAssign(),
                eTallyMigrationDao.getLikedBy());
    }

    public static void fromDTO(TallyMigrationDto vTallyMigrationDto, TallyMigrationDao eTallyMigrationDao) {
        eTallyMigrationDao.setName(vTallyMigrationDto.name());
        eTallyMigrationDao.setCreation(vTallyMigrationDto.creation());
        eTallyMigrationDao.setModified(vTallyMigrationDto.modified());
        eTallyMigrationDao.setModifiedBy(vTallyMigrationDto.modifiedBy());
        eTallyMigrationDao.setOwner(vTallyMigrationDto.owner());
        eTallyMigrationDao.setIsDocStatus(vTallyMigrationDto.isDocStatus());
        eTallyMigrationDao.setIdx(vTallyMigrationDto.idx());
        eTallyMigrationDao.setStatus(vTallyMigrationDto.status());
        eTallyMigrationDao.setMasterData(vTallyMigrationDto.masterData());
        eTallyMigrationDao.setNotifyEmployee(vTallyMigrationDto.notifyEmployee());
        eTallyMigrationDao.setIsMasterDataImported(vTallyMigrationDto.isMasterDataImported());
        eTallyMigrationDao.setTallyCreditorsAccount(vTallyMigrationDto.tallyCreditorsAccount());
        eTallyMigrationDao.setTallyDebtorsAccount(vTallyMigrationDto.tallyDebtorsAccount());
        eTallyMigrationDao.setTallyCompany(vTallyMigrationDto.tallyCompany());
        eTallyMigrationDao.setDefaultUom(vTallyMigrationDto.defaultUom());
        eTallyMigrationDao.setErpnextCompany(vTallyMigrationDto.erpnextCompany());
        eTallyMigrationDao.setChartOfAccounts(vTallyMigrationDto.chartOfAccounts());
        eTallyMigrationDao.setParties(vTallyMigrationDto.parties());
        eTallyMigrationDao.setAddresses(vTallyMigrationDto.addresses());
        eTallyMigrationDao.setUoms(vTallyMigrationDto.uoms());
        eTallyMigrationDao.setItems(vTallyMigrationDto.items());
        eTallyMigrationDao.setVouchers(vTallyMigrationDto.vouchers());
        eTallyMigrationDao.setDefaultWarehouse(vTallyMigrationDto.defaultWarehouse());
        eTallyMigrationDao.setDefaultRoundOffAccount(vTallyMigrationDto.defaultRoundOffAccount());
        eTallyMigrationDao.setDefaultCostCenter(vTallyMigrationDto.defaultCostCenter());
        eTallyMigrationDao.setDayBookData(vTallyMigrationDto.dayBookData());
        eTallyMigrationDao.setIsDayBookDataProcessed(vTallyMigrationDto.isDayBookDataProcessed());
        eTallyMigrationDao.setIsDayBookDataImported(vTallyMigrationDto.isDayBookDataImported());
        eTallyMigrationDao.setFailedImportLog(vTallyMigrationDto.failedImportLog());
        eTallyMigrationDao.setFixedErrorsLog(vTallyMigrationDto.fixedErrorsLog());
        eTallyMigrationDao.setUserTags(vTallyMigrationDto.userTags());
        eTallyMigrationDao.setComments(vTallyMigrationDto.comments());
        eTallyMigrationDao.setAssign(vTallyMigrationDto.assign());
        eTallyMigrationDao.setLikedBy(vTallyMigrationDto.likedBy());
    }
}