package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.accounts.payment.PaymentGatewayAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PaymentGatewayAccountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String paymentGateway,
        String paymentChannel,
        Boolean isDefault,
        String paymentAccount,
        String currency,
        String message,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PaymentGatewayAccountDto fromEntity(PaymentGatewayAccountDao ePaymentGatewayAccountDao) {
        return new PaymentGatewayAccountDto(
                ePaymentGatewayAccountDao.getName(),
                ePaymentGatewayAccountDao.getCreation(),
                ePaymentGatewayAccountDao.getModified(),
                ePaymentGatewayAccountDao.getModifiedBy(),
                ePaymentGatewayAccountDao.getOwner(),
                ePaymentGatewayAccountDao.getIsDocStatus(),
                ePaymentGatewayAccountDao.getIdx(),
                ePaymentGatewayAccountDao.getPaymentGateway(),
                ePaymentGatewayAccountDao.getPaymentChannel(),
                ePaymentGatewayAccountDao.getIsDefault(),
                ePaymentGatewayAccountDao.getPaymentAccount(),
                ePaymentGatewayAccountDao.getCurrency(),
                ePaymentGatewayAccountDao.getMessage(),
                ePaymentGatewayAccountDao.getUserTags(),
                ePaymentGatewayAccountDao.getComments(),
                ePaymentGatewayAccountDao.getAssign(),
                ePaymentGatewayAccountDao.getLikedBy());
    }

    public static void fromDTO(PaymentGatewayAccountDto vPaymentGatewayAccountDto, PaymentGatewayAccountDao ePaymentGatewayAccountDao) {
        ePaymentGatewayAccountDao.setName(vPaymentGatewayAccountDto.name());
        ePaymentGatewayAccountDao.setCreation(vPaymentGatewayAccountDto.creation());
        ePaymentGatewayAccountDao.setModified(vPaymentGatewayAccountDto.modified());
        ePaymentGatewayAccountDao.setModifiedBy(vPaymentGatewayAccountDto.modifiedBy());
        ePaymentGatewayAccountDao.setOwner(vPaymentGatewayAccountDto.owner());
        ePaymentGatewayAccountDao.setIsDocStatus(vPaymentGatewayAccountDto.isDocStatus());
        ePaymentGatewayAccountDao.setIdx(vPaymentGatewayAccountDto.idx());
        ePaymentGatewayAccountDao.setPaymentGateway(vPaymentGatewayAccountDto.paymentGateway());
        ePaymentGatewayAccountDao.setPaymentChannel(vPaymentGatewayAccountDto.paymentChannel());
        ePaymentGatewayAccountDao.setIsDefault(vPaymentGatewayAccountDto.isDefault());
        ePaymentGatewayAccountDao.setPaymentAccount(vPaymentGatewayAccountDto.paymentAccount());
        ePaymentGatewayAccountDao.setCurrency(vPaymentGatewayAccountDto.currency());
        ePaymentGatewayAccountDao.setMessage(vPaymentGatewayAccountDto.message());
        ePaymentGatewayAccountDao.setUserTags(vPaymentGatewayAccountDto.userTags());
        ePaymentGatewayAccountDao.setComments(vPaymentGatewayAccountDto.comments());
        ePaymentGatewayAccountDao.setAssign(vPaymentGatewayAccountDto.assign());
        ePaymentGatewayAccountDao.setLikedBy(vPaymentGatewayAccountDto.likedBy());
    }
}