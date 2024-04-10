package com.itbd.application.db.dto.accounts;

import com.itbd.application.db.dao.accounts.AccountDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AccountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean disabled,
        String accountName,
        String accountNumber,
        Boolean isGroup,
        String company,
        String rootType,
        String reportType,
        String accountCurrency,
        String parentAccount,
        String accountType,
        BigDecimal taxRate,
        String freezeAccount,
        String balanceMustBe,
        Integer lft,
        Integer rgt,
        String oldParent,
        Boolean includeInGross,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AccountDto fromEntity(AccountDao eAccountDao) {
        return new AccountDto(
                eAccountDao.getName(),
                eAccountDao.getCreation(),
                eAccountDao.getModified(),
                eAccountDao.getModifiedBy(),
                eAccountDao.getOwner(),
                eAccountDao.getIsDocStatus(),
                eAccountDao.getIdx(),
                eAccountDao.getDisabled(),
                eAccountDao.getAccountName(),
                eAccountDao.getAccountNumber(),
                eAccountDao.getIsGroup(),
                eAccountDao.getCompany(),
                eAccountDao.getRootType(),
                eAccountDao.getReportType(),
                eAccountDao.getAccountCurrency(),
                eAccountDao.getParentAccount(),
                eAccountDao.getAccountType(),
                eAccountDao.getTaxRate(),
                eAccountDao.getFreezeAccount(),
                eAccountDao.getBalanceMustBe(),
                eAccountDao.getLft(),
                eAccountDao.getRgt(),
                eAccountDao.getOldParent(),
                eAccountDao.getIncludeInGross(),
                eAccountDao.getUserTags(),
                eAccountDao.getComments(),
                eAccountDao.getAssign(),
                eAccountDao.getLikedBy());
    }

    public static void fromDTO(AccountDto vAccountDto, AccountDao eAccountDao) {
        eAccountDao.setName(vAccountDto.name());
        eAccountDao.setCreation(vAccountDto.creation());
        eAccountDao.setModified(vAccountDto.modified());
        eAccountDao.setModifiedBy(vAccountDto.modifiedBy());
        eAccountDao.setOwner(vAccountDto.owner());
        eAccountDao.setIsDocStatus(vAccountDto.isDocStatus());
        eAccountDao.setIdx(vAccountDto.idx());
        eAccountDao.setDisabled(vAccountDto.disabled());
        eAccountDao.setAccountName(vAccountDto.accountName());
        eAccountDao.setAccountNumber(vAccountDto.accountNumber());
        eAccountDao.setIsGroup(vAccountDto.isGroup());
        eAccountDao.setCompany(vAccountDto.company());
        eAccountDao.setRootType(vAccountDto.rootType());
        eAccountDao.setReportType(vAccountDto.reportType());
        eAccountDao.setAccountCurrency(vAccountDto.accountCurrency());
        eAccountDao.setParentAccount(vAccountDto.parentAccount());
        eAccountDao.setAccountType(vAccountDto.accountType());
        eAccountDao.setTaxRate(vAccountDto.taxRate());
        eAccountDao.setFreezeAccount(vAccountDto.freezeAccount());
        eAccountDao.setBalanceMustBe(vAccountDto.balanceMustBe());
        eAccountDao.setLft(vAccountDto.lft());
        eAccountDao.setRgt(vAccountDto.rgt());
        eAccountDao.setOldParent(vAccountDto.oldParent());
        eAccountDao.setIncludeInGross(vAccountDto.includeInGross());
        eAccountDao.setUserTags(vAccountDto.userTags());
        eAccountDao.setComments(vAccountDto.comments());
        eAccountDao.setAssign(vAccountDto.assign());
        eAccountDao.setLikedBy(vAccountDto.likedBy());
    }
}