package com.itbd.application.db.dto;

import com.itbd.application.db.dao.InstallationNoteItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record InstallationNoteItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String serialAndBatchBundle,
        String serialNo,
        BigDecimal qty,
        String description,
        String prevDocumentDetailDocName,
        String prevDocumentDocName,
        String prevDocumentDocType,
        String parent,
        String parentField,
        String parentType
) {
    public static InstallationNoteItemDto fromEntity(InstallationNoteItemDao eInstallationNoteItemDao) {
        return new InstallationNoteItemDto(
                eInstallationNoteItemDao.getName(),
                eInstallationNoteItemDao.getCreation(),
                eInstallationNoteItemDao.getModified(),
                eInstallationNoteItemDao.getModifiedBy(),
                eInstallationNoteItemDao.getOwner(),
                eInstallationNoteItemDao.getIsDocStatus(),
                eInstallationNoteItemDao.getIdx(),
                eInstallationNoteItemDao.getItemCode(),
                eInstallationNoteItemDao.getSerialAndBatchBundle(),
                eInstallationNoteItemDao.getSerialNo(),
                eInstallationNoteItemDao.getQty(),
                eInstallationNoteItemDao.getDescription(),
                eInstallationNoteItemDao.getPrevDocumentDetailDocName(),
                eInstallationNoteItemDao.getPrevDocumentDocName(),
                eInstallationNoteItemDao.getPrevDocumentDocType(),
                eInstallationNoteItemDao.getParent(),
                eInstallationNoteItemDao.getParentField(),
                eInstallationNoteItemDao.getParentType());
    }

    public static void fromDTO(InstallationNoteItemDto vInstallationNoteItemDto, InstallationNoteItemDao eInstallationNoteItemDao) {
        eInstallationNoteItemDao.setName(vInstallationNoteItemDto.name());
        eInstallationNoteItemDao.setCreation(vInstallationNoteItemDto.creation());
        eInstallationNoteItemDao.setModified(vInstallationNoteItemDto.modified());
        eInstallationNoteItemDao.setModifiedBy(vInstallationNoteItemDto.modifiedBy());
        eInstallationNoteItemDao.setOwner(vInstallationNoteItemDto.owner());
        eInstallationNoteItemDao.setIsDocStatus(vInstallationNoteItemDto.isDocStatus());
        eInstallationNoteItemDao.setIdx(vInstallationNoteItemDto.idx());
        eInstallationNoteItemDao.setItemCode(vInstallationNoteItemDto.itemCode());
        eInstallationNoteItemDao.setSerialAndBatchBundle(vInstallationNoteItemDto.serialAndBatchBundle());
        eInstallationNoteItemDao.setSerialNo(vInstallationNoteItemDto.serialNo());
        eInstallationNoteItemDao.setQty(vInstallationNoteItemDto.qty());
        eInstallationNoteItemDao.setDescription(vInstallationNoteItemDto.description());
        eInstallationNoteItemDao.setPrevDocumentDetailDocName(vInstallationNoteItemDto.prevDocumentDetailDocName());
        eInstallationNoteItemDao.setPrevDocumentDocName(vInstallationNoteItemDto.prevDocumentDocName());
        eInstallationNoteItemDao.setPrevDocumentDocType(vInstallationNoteItemDto.prevDocumentDocType());
        eInstallationNoteItemDao.setParent(vInstallationNoteItemDto.parent());
        eInstallationNoteItemDao.setParentField(vInstallationNoteItemDto.parentField());
        eInstallationNoteItemDao.setParentType(vInstallationNoteItemDto.parentType());
    }
}