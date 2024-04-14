package com.itbd.application.db.dto;

import com.itbd.application.db.dao.AdvanceTaxDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AdvanceTaxDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String referenceType,
        String referenceName,
        String referenceDetail,
        String accountHead,
        BigDecimal allocatedAmount,
        String parent,
        String parentField,
        String parentType
) {
    public static AdvanceTaxDto fromEntity(AdvanceTaxDao eAdvanceTaxDao) {
        return new AdvanceTaxDto(
                eAdvanceTaxDao.getName(),
                eAdvanceTaxDao.getCreation(),
                eAdvanceTaxDao.getModified(),
                eAdvanceTaxDao.getModifiedBy(),
                eAdvanceTaxDao.getOwner(),
                eAdvanceTaxDao.getIsDocStatus(),
                eAdvanceTaxDao.getIdx(),
                eAdvanceTaxDao.getReferenceType(),
                eAdvanceTaxDao.getReferenceName(),
                eAdvanceTaxDao.getReferenceDetail(),
                eAdvanceTaxDao.getAccountHead(),
                eAdvanceTaxDao.getAllocatedAmount(),
                eAdvanceTaxDao.getParent(),
                eAdvanceTaxDao.getParentField(),
                eAdvanceTaxDao.getParentType());
    }

    public static void fromDTO(AdvanceTaxDto vAdvanceTaxDto, AdvanceTaxDao eAdvanceTaxDao) {
        eAdvanceTaxDao.setName(vAdvanceTaxDto.name());
        eAdvanceTaxDao.setCreation(vAdvanceTaxDto.creation());
        eAdvanceTaxDao.setModified(vAdvanceTaxDto.modified());
        eAdvanceTaxDao.setModifiedBy(vAdvanceTaxDto.modifiedBy());
        eAdvanceTaxDao.setOwner(vAdvanceTaxDto.owner());
        eAdvanceTaxDao.setIsDocStatus(vAdvanceTaxDto.isDocStatus());
        eAdvanceTaxDao.setIdx(vAdvanceTaxDto.idx());
        eAdvanceTaxDao.setReferenceType(vAdvanceTaxDto.referenceType());
        eAdvanceTaxDao.setReferenceName(vAdvanceTaxDto.referenceName());
        eAdvanceTaxDao.setReferenceDetail(vAdvanceTaxDto.referenceDetail());
        eAdvanceTaxDao.setAccountHead(vAdvanceTaxDto.accountHead());
        eAdvanceTaxDao.setAllocatedAmount(vAdvanceTaxDto.allocatedAmount());
        eAdvanceTaxDao.setParent(vAdvanceTaxDto.parent());
        eAdvanceTaxDao.setParentField(vAdvanceTaxDto.parentField());
        eAdvanceTaxDao.setParentType(vAdvanceTaxDto.parentType());
    }
}