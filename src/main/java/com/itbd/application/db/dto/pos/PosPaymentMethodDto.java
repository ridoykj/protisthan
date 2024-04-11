package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosPaymentMethodDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PosPaymentMethodDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean defaults,
        Boolean allowInReturns,
        String modeOfPayment,
        String parent,
        String parentField,
        String parentType
) {
    public static PosPaymentMethodDto fromEntity(PosPaymentMethodDao ePosPaymentMethodDao) {
        return new PosPaymentMethodDto(
                ePosPaymentMethodDao.getName(),
                ePosPaymentMethodDao.getCreation(),
                ePosPaymentMethodDao.getModified(),
                ePosPaymentMethodDao.getModifiedBy(),
                ePosPaymentMethodDao.getOwner(),
                ePosPaymentMethodDao.getIsDocStatus(),
                ePosPaymentMethodDao.getIdx(),
                ePosPaymentMethodDao.getDefaults(),
                ePosPaymentMethodDao.getAllowInReturns(),
                ePosPaymentMethodDao.getModeOfPayment(),
                ePosPaymentMethodDao.getParent(),
                ePosPaymentMethodDao.getParentField(),
                ePosPaymentMethodDao.getParentType());
    }

    public static void fromDTO(PosPaymentMethodDto vPosPaymentMethodDto, PosPaymentMethodDao ePosPaymentMethodDao) {
        ePosPaymentMethodDao.setName(vPosPaymentMethodDto.name());
        ePosPaymentMethodDao.setCreation(vPosPaymentMethodDto.creation());
        ePosPaymentMethodDao.setModified(vPosPaymentMethodDto.modified());
        ePosPaymentMethodDao.setModifiedBy(vPosPaymentMethodDto.modifiedBy());
        ePosPaymentMethodDao.setOwner(vPosPaymentMethodDto.owner());
        ePosPaymentMethodDao.setIsDocStatus(vPosPaymentMethodDto.isDocStatus());
        ePosPaymentMethodDao.setIdx(vPosPaymentMethodDto.idx());
        ePosPaymentMethodDao.setDefaults(vPosPaymentMethodDto.defaults());
        ePosPaymentMethodDao.setAllowInReturns(vPosPaymentMethodDto.allowInReturns());
        ePosPaymentMethodDao.setModeOfPayment(vPosPaymentMethodDto.modeOfPayment());
        ePosPaymentMethodDao.setParent(vPosPaymentMethodDto.parent());
        ePosPaymentMethodDao.setParentField(vPosPaymentMethodDto.parentField());
        ePosPaymentMethodDao.setParentType(vPosPaymentMethodDto.parentType());
    }
}