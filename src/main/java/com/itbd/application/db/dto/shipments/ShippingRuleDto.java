package com.itbd.application.db.dto.shipments;

import com.itbd.application.db.dao.shipments.ShippingRuleDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ShippingRuleDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String label,
        Boolean disabled,
        String shippingRuleType,
        String company,
        String account,
        String costCenter,
        String calculateBasedOn,
        BigDecimal shippingAmount,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ShippingRuleDto fromEntity(ShippingRuleDao eShippingRuleDao) {
        return new ShippingRuleDto(
                eShippingRuleDao.getName(),
                eShippingRuleDao.getCreation(),
                eShippingRuleDao.getModified(),
                eShippingRuleDao.getModifiedBy(),
                eShippingRuleDao.getOwner(),
                eShippingRuleDao.getIsDocStatus(),
                eShippingRuleDao.getIdx(),
                eShippingRuleDao.getLabel(),
                eShippingRuleDao.getDisabled(),
                eShippingRuleDao.getShippingRuleType(),
                eShippingRuleDao.getCompany(),
                eShippingRuleDao.getAccount(),
                eShippingRuleDao.getCostCenter(),
                eShippingRuleDao.getCalculateBasedOn(),
                eShippingRuleDao.getShippingAmount(),
                eShippingRuleDao.getUserTags(),
                eShippingRuleDao.getComments(),
                eShippingRuleDao.getAssign(),
                eShippingRuleDao.getLikedBy());
    }

    public static void fromDTO(ShippingRuleDto vShippingRuleDto, ShippingRuleDao eShippingRuleDao) {
        eShippingRuleDao.setName(vShippingRuleDto.name());
        eShippingRuleDao.setCreation(vShippingRuleDto.creation());
        eShippingRuleDao.setModified(vShippingRuleDto.modified());
        eShippingRuleDao.setModifiedBy(vShippingRuleDto.modifiedBy());
        eShippingRuleDao.setOwner(vShippingRuleDto.owner());
        eShippingRuleDao.setIsDocStatus(vShippingRuleDto.isDocStatus());
        eShippingRuleDao.setIdx(vShippingRuleDto.idx());
        eShippingRuleDao.setLabel(vShippingRuleDto.label());
        eShippingRuleDao.setDisabled(vShippingRuleDto.disabled());
        eShippingRuleDao.setShippingRuleType(vShippingRuleDto.shippingRuleType());
        eShippingRuleDao.setCompany(vShippingRuleDto.company());
        eShippingRuleDao.setAccount(vShippingRuleDto.account());
        eShippingRuleDao.setCostCenter(vShippingRuleDto.costCenter());
        eShippingRuleDao.setCalculateBasedOn(vShippingRuleDto.calculateBasedOn());
        eShippingRuleDao.setShippingAmount(vShippingRuleDto.shippingAmount());
        eShippingRuleDao.setUserTags(vShippingRuleDto.userTags());
        eShippingRuleDao.setComments(vShippingRuleDto.comments());
        eShippingRuleDao.setAssign(vShippingRuleDto.assign());
        eShippingRuleDao.setLikedBy(vShippingRuleDto.likedBy());
    }
}