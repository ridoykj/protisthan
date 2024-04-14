package com.itbd.application.db.dto.subcontracting;

import com.itbd.application.db.dao.subcontracting.SubcontractingBomDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SubcontractingBomDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean isActive,
        String finishedGood,
        BigDecimal finishedGoodQty,
        String finishedGoodUom,
        String finishedGoodBom,
        String serviceItem,
        BigDecimal serviceItemQty,
        String serviceItemUom,
        BigDecimal conversionFactor,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SubcontractingBomDto fromEntity(SubcontractingBomDao eSubcontractingBomDao) {
        return new SubcontractingBomDto(
                eSubcontractingBomDao.getName(),
                eSubcontractingBomDao.getCreation(),
                eSubcontractingBomDao.getModified(),
                eSubcontractingBomDao.getModifiedBy(),
                eSubcontractingBomDao.getOwner(),
                eSubcontractingBomDao.getIsDocStatus(),
                eSubcontractingBomDao.getIdx(),
                eSubcontractingBomDao.getIsActive(),
                eSubcontractingBomDao.getFinishedGood(),
                eSubcontractingBomDao.getFinishedGoodQty(),
                eSubcontractingBomDao.getFinishedGoodUom(),
                eSubcontractingBomDao.getFinishedGoodBom(),
                eSubcontractingBomDao.getServiceItem(),
                eSubcontractingBomDao.getServiceItemQty(),
                eSubcontractingBomDao.getServiceItemUom(),
                eSubcontractingBomDao.getConversionFactor(),
                eSubcontractingBomDao.getUserTags(),
                eSubcontractingBomDao.getComments(),
                eSubcontractingBomDao.getAssign(),
                eSubcontractingBomDao.getLikedBy());
    }

    public static void fromDTO(SubcontractingBomDto vSubcontractingBomDto, SubcontractingBomDao eSubcontractingBomDao) {
        eSubcontractingBomDao.setName(vSubcontractingBomDto.name());
        eSubcontractingBomDao.setCreation(vSubcontractingBomDto.creation());
        eSubcontractingBomDao.setModified(vSubcontractingBomDto.modified());
        eSubcontractingBomDao.setModifiedBy(vSubcontractingBomDto.modifiedBy());
        eSubcontractingBomDao.setOwner(vSubcontractingBomDto.owner());
        eSubcontractingBomDao.setIsDocStatus(vSubcontractingBomDto.isDocStatus());
        eSubcontractingBomDao.setIdx(vSubcontractingBomDto.idx());
        eSubcontractingBomDao.setIsActive(vSubcontractingBomDto.isActive());
        eSubcontractingBomDao.setFinishedGood(vSubcontractingBomDto.finishedGood());
        eSubcontractingBomDao.setFinishedGoodQty(vSubcontractingBomDto.finishedGoodQty());
        eSubcontractingBomDao.setFinishedGoodUom(vSubcontractingBomDto.finishedGoodUom());
        eSubcontractingBomDao.setFinishedGoodBom(vSubcontractingBomDto.finishedGoodBom());
        eSubcontractingBomDao.setServiceItem(vSubcontractingBomDto.serviceItem());
        eSubcontractingBomDao.setServiceItemQty(vSubcontractingBomDto.serviceItemQty());
        eSubcontractingBomDao.setServiceItemUom(vSubcontractingBomDto.serviceItemUom());
        eSubcontractingBomDao.setConversionFactor(vSubcontractingBomDto.conversionFactor());
        eSubcontractingBomDao.setUserTags(vSubcontractingBomDto.userTags());
        eSubcontractingBomDao.setComments(vSubcontractingBomDto.comments());
        eSubcontractingBomDao.setAssign(vSubcontractingBomDto.assign());
        eSubcontractingBomDao.setLikedBy(vSubcontractingBomDto.likedBy());
    }
}