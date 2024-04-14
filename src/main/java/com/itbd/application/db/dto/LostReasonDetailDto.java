package com.itbd.application.db.dto;

import com.itbd.application.db.dao.LostReasonDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record LostReasonDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String lostReason,
        String parent,
        String parentField,
        String parentType
) {
    public static LostReasonDetailDto fromEntity(LostReasonDetailDao eLostReasonDetailDao) {
        return new LostReasonDetailDto(
                eLostReasonDetailDao.getName(),
                eLostReasonDetailDao.getCreation(),
                eLostReasonDetailDao.getModified(),
                eLostReasonDetailDao.getModifiedBy(),
                eLostReasonDetailDao.getOwner(),
                eLostReasonDetailDao.getIsDocStatus(),
                eLostReasonDetailDao.getIdx(),
                eLostReasonDetailDao.getLostReason(),
                eLostReasonDetailDao.getParent(),
                eLostReasonDetailDao.getParentField(),
                eLostReasonDetailDao.getParentType());
    }

    public static void fromDTO(LostReasonDetailDto vLostReasonDetailDto, LostReasonDetailDao eLostReasonDetailDao) {
        eLostReasonDetailDao.setName(vLostReasonDetailDto.name());
        eLostReasonDetailDao.setCreation(vLostReasonDetailDto.creation());
        eLostReasonDetailDao.setModified(vLostReasonDetailDto.modified());
        eLostReasonDetailDao.setModifiedBy(vLostReasonDetailDto.modifiedBy());
        eLostReasonDetailDao.setOwner(vLostReasonDetailDto.owner());
        eLostReasonDetailDao.setIsDocStatus(vLostReasonDetailDto.isDocStatus());
        eLostReasonDetailDao.setIdx(vLostReasonDetailDto.idx());
        eLostReasonDetailDao.setLostReason(vLostReasonDetailDto.lostReason());
        eLostReasonDetailDao.setParent(vLostReasonDetailDto.parent());
        eLostReasonDetailDao.setParentField(vLostReasonDetailDto.parentField());
        eLostReasonDetailDao.setParentType(vLostReasonDetailDto.parentType());
    }
}