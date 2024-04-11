package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.payments.PaymentOrderDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record PaymentOrderDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String company,
        String paymentOrderType,
        String party,
        LocalDate postingDate,
        String companyBank,
        String companyBankAccount,
        String account,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PaymentOrderDto fromEntity(PaymentOrderDao ePaymentOrderDao) {
        return new PaymentOrderDto(
                ePaymentOrderDao.getName(),
                ePaymentOrderDao.getCreation(),
                ePaymentOrderDao.getModified(),
                ePaymentOrderDao.getModifiedBy(),
                ePaymentOrderDao.getOwner(),
                ePaymentOrderDao.getIsDocStatus(),
                ePaymentOrderDao.getIdx(),
                ePaymentOrderDao.getNamingSeries(),
                ePaymentOrderDao.getCompany(),
                ePaymentOrderDao.getPaymentOrderType(),
                ePaymentOrderDao.getParty(),
                ePaymentOrderDao.getPostingDate(),
                ePaymentOrderDao.getCompanyBank(),
                ePaymentOrderDao.getCompanyBankAccount(),
                ePaymentOrderDao.getAccount(),
                ePaymentOrderDao.getAmendedFrom(),
                ePaymentOrderDao.getUserTags(),
                ePaymentOrderDao.getComments(),
                ePaymentOrderDao.getAssign(),
                ePaymentOrderDao.getLikedBy());
    }

    public static void fromDTO(PaymentOrderDto vPaymentOrderDto, PaymentOrderDao ePaymentOrderDao) {
        ePaymentOrderDao.setName(vPaymentOrderDto.name());
        ePaymentOrderDao.setCreation(vPaymentOrderDto.creation());
        ePaymentOrderDao.setModified(vPaymentOrderDto.modified());
        ePaymentOrderDao.setModifiedBy(vPaymentOrderDto.modifiedBy());
        ePaymentOrderDao.setOwner(vPaymentOrderDto.owner());
        ePaymentOrderDao.setIsDocStatus(vPaymentOrderDto.isDocStatus());
        ePaymentOrderDao.setIdx(vPaymentOrderDto.idx());
        ePaymentOrderDao.setNamingSeries(vPaymentOrderDto.namingSeries());
        ePaymentOrderDao.setCompany(vPaymentOrderDto.company());
        ePaymentOrderDao.setPaymentOrderType(vPaymentOrderDto.paymentOrderType());
        ePaymentOrderDao.setParty(vPaymentOrderDto.party());
        ePaymentOrderDao.setPostingDate(vPaymentOrderDto.postingDate());
        ePaymentOrderDao.setCompanyBank(vPaymentOrderDto.companyBank());
        ePaymentOrderDao.setCompanyBankAccount(vPaymentOrderDto.companyBankAccount());
        ePaymentOrderDao.setAccount(vPaymentOrderDto.account());
        ePaymentOrderDao.setAmendedFrom(vPaymentOrderDto.amendedFrom());
        ePaymentOrderDao.setUserTags(vPaymentOrderDto.userTags());
        ePaymentOrderDao.setComments(vPaymentOrderDto.comments());
        ePaymentOrderDao.setAssign(vPaymentOrderDto.assign());
        ePaymentOrderDao.setLikedBy(vPaymentOrderDto.likedBy());
    }
}