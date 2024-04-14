package com.itbd.application.db.dto;

import com.itbd.application.db.dao.InventoryDimensionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record InventoryDimensionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String dimensionName,
        String referenceDocument,
        Boolean disabled,
        String sourceFieldName,
        String targetFieldName,
        Boolean applyToAllDocTypes,
        Boolean validateNegativeStock,
        String documentType,
        String typeOfTransaction,
        String fetchFromParent,
        Boolean isTable,
        String condition,
        Boolean reqd,
        String mandatoryDependsOn,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static InventoryDimensionDto fromEntity(InventoryDimensionDao eInventoryDimensionDao) {
        return new InventoryDimensionDto(
                eInventoryDimensionDao.getName(),
                eInventoryDimensionDao.getCreation(),
                eInventoryDimensionDao.getModified(),
                eInventoryDimensionDao.getModifiedBy(),
                eInventoryDimensionDao.getOwner(),
                eInventoryDimensionDao.getIsDocStatus(),
                eInventoryDimensionDao.getIdx(),
                eInventoryDimensionDao.getDimensionName(),
                eInventoryDimensionDao.getReferenceDocument(),
                eInventoryDimensionDao.getDisabled(),
                eInventoryDimensionDao.getSourceFieldName(),
                eInventoryDimensionDao.getTargetFieldName(),
                eInventoryDimensionDao.getApplyToAllDocTypes(),
                eInventoryDimensionDao.getValidateNegativeStock(),
                eInventoryDimensionDao.getDocumentType(),
                eInventoryDimensionDao.getTypeOfTransaction(),
                eInventoryDimensionDao.getFetchFromParent(),
                eInventoryDimensionDao.getIsTable(),
                eInventoryDimensionDao.getCondition(),
                eInventoryDimensionDao.getReqd(),
                eInventoryDimensionDao.getMandatoryDependsOn(),
                eInventoryDimensionDao.getUserTags(),
                eInventoryDimensionDao.getComments(),
                eInventoryDimensionDao.getAssign(),
                eInventoryDimensionDao.getLikedBy());
    }

    public static void fromDTO(InventoryDimensionDto vInventoryDimensionDto, InventoryDimensionDao eInventoryDimensionDao) {
        eInventoryDimensionDao.setName(vInventoryDimensionDto.name());
        eInventoryDimensionDao.setCreation(vInventoryDimensionDto.creation());
        eInventoryDimensionDao.setModified(vInventoryDimensionDto.modified());
        eInventoryDimensionDao.setModifiedBy(vInventoryDimensionDto.modifiedBy());
        eInventoryDimensionDao.setOwner(vInventoryDimensionDto.owner());
        eInventoryDimensionDao.setIsDocStatus(vInventoryDimensionDto.isDocStatus());
        eInventoryDimensionDao.setIdx(vInventoryDimensionDto.idx());
        eInventoryDimensionDao.setDimensionName(vInventoryDimensionDto.dimensionName());
        eInventoryDimensionDao.setReferenceDocument(vInventoryDimensionDto.referenceDocument());
        eInventoryDimensionDao.setDisabled(vInventoryDimensionDto.disabled());
        eInventoryDimensionDao.setSourceFieldName(vInventoryDimensionDto.sourceFieldName());
        eInventoryDimensionDao.setTargetFieldName(vInventoryDimensionDto.targetFieldName());
        eInventoryDimensionDao.setApplyToAllDocTypes(vInventoryDimensionDto.applyToAllDocTypes());
        eInventoryDimensionDao.setValidateNegativeStock(vInventoryDimensionDto.validateNegativeStock());
        eInventoryDimensionDao.setDocumentType(vInventoryDimensionDto.documentType());
        eInventoryDimensionDao.setTypeOfTransaction(vInventoryDimensionDto.typeOfTransaction());
        eInventoryDimensionDao.setFetchFromParent(vInventoryDimensionDto.fetchFromParent());
        eInventoryDimensionDao.setIsTable(vInventoryDimensionDto.isTable());
        eInventoryDimensionDao.setCondition(vInventoryDimensionDto.condition());
        eInventoryDimensionDao.setReqd(vInventoryDimensionDto.reqd());
        eInventoryDimensionDao.setMandatoryDependsOn(vInventoryDimensionDto.mandatoryDependsOn());
        eInventoryDimensionDao.setUserTags(vInventoryDimensionDto.userTags());
        eInventoryDimensionDao.setComments(vInventoryDimensionDto.comments());
        eInventoryDimensionDao.setAssign(vInventoryDimensionDto.assign());
        eInventoryDimensionDao.setLikedBy(vInventoryDimensionDto.likedBy());
    }
}