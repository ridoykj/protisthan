package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosInvoiceReferenceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PosInvoiceReferenceDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String posInvoice,
        LocalDate postingDate,
        String customer,
        BigDecimal grandTotal,
        Boolean isReturn,
        String returnAgainst,
        String parent,
        String parentField,
        String parentType
) {
    public static PosInvoiceReferenceDto fromEntity(PosInvoiceReferenceDao ePosInvoiceReferenceDao) {
        return new PosInvoiceReferenceDto(
                ePosInvoiceReferenceDao.getName(),
                ePosInvoiceReferenceDao.getCreation(),
                ePosInvoiceReferenceDao.getModified(),
                ePosInvoiceReferenceDao.getModifiedBy(),
                ePosInvoiceReferenceDao.getOwner(),
                ePosInvoiceReferenceDao.getIsDocStatus(),
                ePosInvoiceReferenceDao.getIdx(),
                ePosInvoiceReferenceDao.getPosInvoice(),
                ePosInvoiceReferenceDao.getPostingDate(),
                ePosInvoiceReferenceDao.getCustomer(),
                ePosInvoiceReferenceDao.getGrandTotal(),
                ePosInvoiceReferenceDao.getIsReturn(),
                ePosInvoiceReferenceDao.getReturnAgainst(),
                ePosInvoiceReferenceDao.getParent(),
                ePosInvoiceReferenceDao.getParentField(),
                ePosInvoiceReferenceDao.getParentType());
    }

    public static void fromDTO(PosInvoiceReferenceDto vPosInvoiceReferenceDto, PosInvoiceReferenceDao ePosInvoiceReferenceDao) {
        ePosInvoiceReferenceDao.setName(vPosInvoiceReferenceDto.name());
        ePosInvoiceReferenceDao.setCreation(vPosInvoiceReferenceDto.creation());
        ePosInvoiceReferenceDao.setModified(vPosInvoiceReferenceDto.modified());
        ePosInvoiceReferenceDao.setModifiedBy(vPosInvoiceReferenceDto.modifiedBy());
        ePosInvoiceReferenceDao.setOwner(vPosInvoiceReferenceDto.owner());
        ePosInvoiceReferenceDao.setIsDocStatus(vPosInvoiceReferenceDto.isDocStatus());
        ePosInvoiceReferenceDao.setIdx(vPosInvoiceReferenceDto.idx());
        ePosInvoiceReferenceDao.setPosInvoice(vPosInvoiceReferenceDto.posInvoice());
        ePosInvoiceReferenceDao.setPostingDate(vPosInvoiceReferenceDto.postingDate());
        ePosInvoiceReferenceDao.setCustomer(vPosInvoiceReferenceDto.customer());
        ePosInvoiceReferenceDao.setGrandTotal(vPosInvoiceReferenceDto.grandTotal());
        ePosInvoiceReferenceDao.setIsReturn(vPosInvoiceReferenceDto.isReturn());
        ePosInvoiceReferenceDao.setReturnAgainst(vPosInvoiceReferenceDto.returnAgainst());
        ePosInvoiceReferenceDao.setParent(vPosInvoiceReferenceDto.parent());
        ePosInvoiceReferenceDao.setParentField(vPosInvoiceReferenceDto.parentField());
        ePosInvoiceReferenceDao.setParentType(vPosInvoiceReferenceDto.parentType());
    }
}