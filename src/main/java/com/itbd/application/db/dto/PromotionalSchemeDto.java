package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.promotional_scheme.PromotionalSchemeDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record PromotionalSchemeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String applyOn,
        Integer disable,
        Boolean mixedConditions,
        Boolean isCumulative,
        String applyRuleOnOther,
        String otherItemCode,
        String otherItemGroup,
        String otherBrand,
        Boolean selling,
        Boolean buying,
        String applicableFor,
        LocalDate validFrom,
        LocalDate validUpto,
        String company,
        String currency,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PromotionalSchemeDto fromEntity(PromotionalSchemeDao ePromotionalSchemeDao) {
        return new PromotionalSchemeDto(
                ePromotionalSchemeDao.getName(),
                ePromotionalSchemeDao.getCreation(),
                ePromotionalSchemeDao.getModified(),
                ePromotionalSchemeDao.getModifiedBy(),
                ePromotionalSchemeDao.getOwner(),
                ePromotionalSchemeDao.getIsDocStatus(),
                ePromotionalSchemeDao.getIdx(),
                ePromotionalSchemeDao.getApplyOn(),
                ePromotionalSchemeDao.getDisable(),
                ePromotionalSchemeDao.getMixedConditions(),
                ePromotionalSchemeDao.getIsCumulative(),
                ePromotionalSchemeDao.getApplyRuleOnOther(),
                ePromotionalSchemeDao.getOtherItemCode(),
                ePromotionalSchemeDao.getOtherItemGroup(),
                ePromotionalSchemeDao.getOtherBrand(),
                ePromotionalSchemeDao.getSelling(),
                ePromotionalSchemeDao.getBuying(),
                ePromotionalSchemeDao.getApplicableFor(),
                ePromotionalSchemeDao.getValidFrom(),
                ePromotionalSchemeDao.getValidUpto(),
                ePromotionalSchemeDao.getCompany(),
                ePromotionalSchemeDao.getCurrency(),
                ePromotionalSchemeDao.getUserTags(),
                ePromotionalSchemeDao.getComments(),
                ePromotionalSchemeDao.getAssign(),
                ePromotionalSchemeDao.getLikedBy());
    }

    public static void fromDTO(PromotionalSchemeDto vPromotionalSchemeDto, PromotionalSchemeDao ePromotionalSchemeDao) {
        ePromotionalSchemeDao.setName(vPromotionalSchemeDto.name());
        ePromotionalSchemeDao.setCreation(vPromotionalSchemeDto.creation());
        ePromotionalSchemeDao.setModified(vPromotionalSchemeDto.modified());
        ePromotionalSchemeDao.setModifiedBy(vPromotionalSchemeDto.modifiedBy());
        ePromotionalSchemeDao.setOwner(vPromotionalSchemeDto.owner());
        ePromotionalSchemeDao.setIsDocStatus(vPromotionalSchemeDto.isDocStatus());
        ePromotionalSchemeDao.setIdx(vPromotionalSchemeDto.idx());
        ePromotionalSchemeDao.setApplyOn(vPromotionalSchemeDto.applyOn());
        ePromotionalSchemeDao.setDisable(vPromotionalSchemeDto.disable());
        ePromotionalSchemeDao.setMixedConditions(vPromotionalSchemeDto.mixedConditions());
        ePromotionalSchemeDao.setIsCumulative(vPromotionalSchemeDto.isCumulative());
        ePromotionalSchemeDao.setApplyRuleOnOther(vPromotionalSchemeDto.applyRuleOnOther());
        ePromotionalSchemeDao.setOtherItemCode(vPromotionalSchemeDto.otherItemCode());
        ePromotionalSchemeDao.setOtherItemGroup(vPromotionalSchemeDto.otherItemGroup());
        ePromotionalSchemeDao.setOtherBrand(vPromotionalSchemeDto.otherBrand());
        ePromotionalSchemeDao.setSelling(vPromotionalSchemeDto.selling());
        ePromotionalSchemeDao.setBuying(vPromotionalSchemeDto.buying());
        ePromotionalSchemeDao.setApplicableFor(vPromotionalSchemeDto.applicableFor());
        ePromotionalSchemeDao.setValidFrom(vPromotionalSchemeDto.validFrom());
        ePromotionalSchemeDao.setValidUpto(vPromotionalSchemeDto.validUpto());
        ePromotionalSchemeDao.setCompany(vPromotionalSchemeDto.company());
        ePromotionalSchemeDao.setCurrency(vPromotionalSchemeDto.currency());
        ePromotionalSchemeDao.setUserTags(vPromotionalSchemeDto.userTags());
        ePromotionalSchemeDao.setComments(vPromotionalSchemeDto.comments());
        ePromotionalSchemeDao.setAssign(vPromotionalSchemeDto.assign());
        ePromotionalSchemeDao.setLikedBy(vPromotionalSchemeDto.likedBy());
    }
}