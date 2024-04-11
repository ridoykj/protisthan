package com.itbd.application.db.dto;

import com.itbd.application.db.dao.LowerDeductionCertificateDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record LowerDeductionCertificateDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String taxWithholdingCategory,
        String fiscalYear,
        String company,
        String certificateNo,
        String supplier,
        String panNo,
        LocalDate validFrom,
        LocalDate validUpto,
        BigDecimal rate,
        BigDecimal certificateLimit,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static LowerDeductionCertificateDto fromEntity(LowerDeductionCertificateDao eLowerDeductionCertificateDao) {
        return new LowerDeductionCertificateDto(
                eLowerDeductionCertificateDao.getName(),
                eLowerDeductionCertificateDao.getCreation(),
                eLowerDeductionCertificateDao.getModified(),
                eLowerDeductionCertificateDao.getModifiedBy(),
                eLowerDeductionCertificateDao.getOwner(),
                eLowerDeductionCertificateDao.getIsDocStatus(),
                eLowerDeductionCertificateDao.getIdx(),
                eLowerDeductionCertificateDao.getTaxWithholdingCategory(),
                eLowerDeductionCertificateDao.getFiscalYear(),
                eLowerDeductionCertificateDao.getCompany(),
                eLowerDeductionCertificateDao.getCertificateNo(),
                eLowerDeductionCertificateDao.getSupplier(),
                eLowerDeductionCertificateDao.getPanNo(),
                eLowerDeductionCertificateDao.getValidFrom(),
                eLowerDeductionCertificateDao.getValidUpto(),
                eLowerDeductionCertificateDao.getRate(),
                eLowerDeductionCertificateDao.getCertificateLimit(),
                eLowerDeductionCertificateDao.getUserTags(),
                eLowerDeductionCertificateDao.getComments(),
                eLowerDeductionCertificateDao.getAssign(),
                eLowerDeductionCertificateDao.getLikedBy());
    }

    public static void fromDTO(LowerDeductionCertificateDto vLowerDeductionCertificateDto, LowerDeductionCertificateDao eLowerDeductionCertificateDao) {
        eLowerDeductionCertificateDao.setName(vLowerDeductionCertificateDto.name());
        eLowerDeductionCertificateDao.setCreation(vLowerDeductionCertificateDto.creation());
        eLowerDeductionCertificateDao.setModified(vLowerDeductionCertificateDto.modified());
        eLowerDeductionCertificateDao.setModifiedBy(vLowerDeductionCertificateDto.modifiedBy());
        eLowerDeductionCertificateDao.setOwner(vLowerDeductionCertificateDto.owner());
        eLowerDeductionCertificateDao.setIsDocStatus(vLowerDeductionCertificateDto.isDocStatus());
        eLowerDeductionCertificateDao.setIdx(vLowerDeductionCertificateDto.idx());
        eLowerDeductionCertificateDao.setTaxWithholdingCategory(vLowerDeductionCertificateDto.taxWithholdingCategory());
        eLowerDeductionCertificateDao.setFiscalYear(vLowerDeductionCertificateDto.fiscalYear());
        eLowerDeductionCertificateDao.setCompany(vLowerDeductionCertificateDto.company());
        eLowerDeductionCertificateDao.setCertificateNo(vLowerDeductionCertificateDto.certificateNo());
        eLowerDeductionCertificateDao.setSupplier(vLowerDeductionCertificateDto.supplier());
        eLowerDeductionCertificateDao.setPanNo(vLowerDeductionCertificateDto.panNo());
        eLowerDeductionCertificateDao.setValidFrom(vLowerDeductionCertificateDto.validFrom());
        eLowerDeductionCertificateDao.setValidUpto(vLowerDeductionCertificateDto.validUpto());
        eLowerDeductionCertificateDao.setRate(vLowerDeductionCertificateDto.rate());
        eLowerDeductionCertificateDao.setCertificateLimit(vLowerDeductionCertificateDto.certificateLimit());
        eLowerDeductionCertificateDao.setUserTags(vLowerDeductionCertificateDto.userTags());
        eLowerDeductionCertificateDao.setComments(vLowerDeductionCertificateDto.comments());
        eLowerDeductionCertificateDao.setAssign(vLowerDeductionCertificateDto.assign());
        eLowerDeductionCertificateDao.setLikedBy(vLowerDeductionCertificateDto.likedBy());
    }
}