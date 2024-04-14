package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.bom.BomUpdateBatchDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BomUpdateBatchDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Integer level,
        Integer batchNo,
        String bomsUpdated,
        String status,
        String parent,
        String parentField,
        String parentType
) {
    public static BomUpdateBatchDto fromEntity(BomUpdateBatchDao eBomUpdateBatchDao) {
        return new BomUpdateBatchDto(
                eBomUpdateBatchDao.getName(),
                eBomUpdateBatchDao.getCreation(),
                eBomUpdateBatchDao.getModified(),
                eBomUpdateBatchDao.getModifiedBy(),
                eBomUpdateBatchDao.getOwner(),
                eBomUpdateBatchDao.getIsDocStatus(),
                eBomUpdateBatchDao.getIdx(),
                eBomUpdateBatchDao.getLevel(),
                eBomUpdateBatchDao.getBatchNo(),
                eBomUpdateBatchDao.getBomsUpdated(),
                eBomUpdateBatchDao.getStatus(),
                eBomUpdateBatchDao.getParent(),
                eBomUpdateBatchDao.getParentField(),
                eBomUpdateBatchDao.getParentType());
    }

    public static void fromDTO(BomUpdateBatchDto vBomUpdateBatchDto, BomUpdateBatchDao eBomUpdateBatchDao) {
        eBomUpdateBatchDao.setName(vBomUpdateBatchDto.name());
        eBomUpdateBatchDao.setCreation(vBomUpdateBatchDto.creation());
        eBomUpdateBatchDao.setModified(vBomUpdateBatchDto.modified());
        eBomUpdateBatchDao.setModifiedBy(vBomUpdateBatchDto.modifiedBy());
        eBomUpdateBatchDao.setOwner(vBomUpdateBatchDto.owner());
        eBomUpdateBatchDao.setIsDocStatus(vBomUpdateBatchDto.isDocStatus());
        eBomUpdateBatchDao.setIdx(vBomUpdateBatchDto.idx());
        eBomUpdateBatchDao.setLevel(vBomUpdateBatchDto.level());
        eBomUpdateBatchDao.setBatchNo(vBomUpdateBatchDto.batchNo());
        eBomUpdateBatchDao.setBomsUpdated(vBomUpdateBatchDto.bomsUpdated());
        eBomUpdateBatchDao.setStatus(vBomUpdateBatchDto.status());
        eBomUpdateBatchDao.setParent(vBomUpdateBatchDto.parent());
        eBomUpdateBatchDao.setParentField(vBomUpdateBatchDto.parentField());
        eBomUpdateBatchDao.setParentType(vBomUpdateBatchDto.parentType());
    }
}