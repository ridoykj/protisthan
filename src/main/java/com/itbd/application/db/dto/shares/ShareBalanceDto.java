package com.itbd.application.db.dto.shares;

import com.itbd.application.db.dao.accounts.ShareBalanceDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ShareBalanceDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String shareType,
        Integer fromNo,
        Integer rate,
        Integer noOfShares,
        Integer toNo,
        Integer amount,
        Boolean isCompany,
        String currentState,
        String parent,
        String parentField,
        String parentType
) {
    public static ShareBalanceDto fromEntity(ShareBalanceDao eShareBalanceDao) {
        return new ShareBalanceDto(
                eShareBalanceDao.getName(),
                eShareBalanceDao.getCreation(),
                eShareBalanceDao.getModified(),
                eShareBalanceDao.getModifiedBy(),
                eShareBalanceDao.getOwner(),
                eShareBalanceDao.getIsDocStatus(),
                eShareBalanceDao.getIdx(),
                eShareBalanceDao.getShareType(),
                eShareBalanceDao.getFromNo(),
                eShareBalanceDao.getRate(),
                eShareBalanceDao.getNoOfShares(),
                eShareBalanceDao.getToNo(),
                eShareBalanceDao.getAmount(),
                eShareBalanceDao.getIsCompany(),
                eShareBalanceDao.getCurrentState(),
                eShareBalanceDao.getParent(),
                eShareBalanceDao.getParentField(),
                eShareBalanceDao.getParentType());
    }

    public static void fromDTO(ShareBalanceDto vShareBalanceDto, ShareBalanceDao eShareBalanceDao) {
        eShareBalanceDao.setName(vShareBalanceDto.name());
        eShareBalanceDao.setCreation(vShareBalanceDto.creation());
        eShareBalanceDao.setModified(vShareBalanceDto.modified());
        eShareBalanceDao.setModifiedBy(vShareBalanceDto.modifiedBy());
        eShareBalanceDao.setOwner(vShareBalanceDto.owner());
        eShareBalanceDao.setIsDocStatus(vShareBalanceDto.isDocStatus());
        eShareBalanceDao.setIdx(vShareBalanceDto.idx());
        eShareBalanceDao.setShareType(vShareBalanceDto.shareType());
        eShareBalanceDao.setFromNo(vShareBalanceDto.fromNo());
        eShareBalanceDao.setRate(vShareBalanceDto.rate());
        eShareBalanceDao.setNoOfShares(vShareBalanceDto.noOfShares());
        eShareBalanceDao.setToNo(vShareBalanceDto.toNo());
        eShareBalanceDao.setAmount(vShareBalanceDto.amount());
        eShareBalanceDao.setIsCompany(vShareBalanceDto.isCompany());
        eShareBalanceDao.setCurrentState(vShareBalanceDto.currentState());
        eShareBalanceDao.setParent(vShareBalanceDto.parent());
        eShareBalanceDao.setParentField(vShareBalanceDto.parentField());
        eShareBalanceDao.setParentType(vShareBalanceDto.parentType());
    }
}