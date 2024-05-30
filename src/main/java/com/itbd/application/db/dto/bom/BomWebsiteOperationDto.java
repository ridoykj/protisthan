package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.manufacturing.bom.BomWebsiteOperationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BomWebsiteOperationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String operation,
        String workstation,
        BigDecimal timeInMins,
        String websiteImage,
        String thumbnail,
        String parent,
        String parentField,
        String parentType
) {
    public static BomWebsiteOperationDto fromEntity(BomWebsiteOperationDao eBomWebsiteOperationDao) {
        return new BomWebsiteOperationDto(
                eBomWebsiteOperationDao.getName(),
                eBomWebsiteOperationDao.getCreation(),
                eBomWebsiteOperationDao.getModified(),
                eBomWebsiteOperationDao.getModifiedBy(),
                eBomWebsiteOperationDao.getOwner(),
                eBomWebsiteOperationDao.getIsDocStatus(),
                eBomWebsiteOperationDao.getIdx(),
                eBomWebsiteOperationDao.getOperation(),
                eBomWebsiteOperationDao.getWorkstation(),
                eBomWebsiteOperationDao.getTimeInMins(),
                eBomWebsiteOperationDao.getWebsiteImage(),
                eBomWebsiteOperationDao.getThumbnail(),
                eBomWebsiteOperationDao.getParent(),
                eBomWebsiteOperationDao.getParentField(),
                eBomWebsiteOperationDao.getParentType());
    }

    public static void fromDTO(BomWebsiteOperationDto vBomWebsiteOperationDto, BomWebsiteOperationDao eBomWebsiteOperationDao) {
        eBomWebsiteOperationDao.setName(vBomWebsiteOperationDto.name());
        eBomWebsiteOperationDao.setCreation(vBomWebsiteOperationDto.creation());
        eBomWebsiteOperationDao.setModified(vBomWebsiteOperationDto.modified());
        eBomWebsiteOperationDao.setModifiedBy(vBomWebsiteOperationDto.modifiedBy());
        eBomWebsiteOperationDao.setOwner(vBomWebsiteOperationDto.owner());
        eBomWebsiteOperationDao.setIsDocStatus(vBomWebsiteOperationDto.isDocStatus());
        eBomWebsiteOperationDao.setIdx(vBomWebsiteOperationDto.idx());
        eBomWebsiteOperationDao.setOperation(vBomWebsiteOperationDto.operation());
        eBomWebsiteOperationDao.setWorkstation(vBomWebsiteOperationDto.workstation());
        eBomWebsiteOperationDao.setTimeInMins(vBomWebsiteOperationDto.timeInMins());
        eBomWebsiteOperationDao.setWebsiteImage(vBomWebsiteOperationDto.websiteImage());
        eBomWebsiteOperationDao.setThumbnail(vBomWebsiteOperationDto.thumbnail());
        eBomWebsiteOperationDao.setParent(vBomWebsiteOperationDto.parent());
        eBomWebsiteOperationDao.setParentField(vBomWebsiteOperationDto.parentField());
        eBomWebsiteOperationDao.setParentType(vBomWebsiteOperationDto.parentType());
    }
}