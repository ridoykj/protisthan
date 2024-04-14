package com.itbd.application.db.dto.documents;

import com.itbd.application.db.dao.documents.DocumentNamingRuleConditionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocumentNamingRuleConditionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String field,
        String condition,
        String value,
        String parent,
        String parentField,
        String parentType
) {
    public static DocumentNamingRuleConditionDto fromEntity(DocumentNamingRuleConditionDao eDocumentNamingRuleConditionDao) {
        return new DocumentNamingRuleConditionDto(
                eDocumentNamingRuleConditionDao.getName(),
                eDocumentNamingRuleConditionDao.getCreation(),
                eDocumentNamingRuleConditionDao.getModified(),
                eDocumentNamingRuleConditionDao.getModifiedBy(),
                eDocumentNamingRuleConditionDao.getOwner(),
                eDocumentNamingRuleConditionDao.getIsDocStatus(),
                eDocumentNamingRuleConditionDao.getIdx(),
                eDocumentNamingRuleConditionDao.getField(),
                eDocumentNamingRuleConditionDao.getCondition(),
                eDocumentNamingRuleConditionDao.getValue(),
                eDocumentNamingRuleConditionDao.getParent(),
                eDocumentNamingRuleConditionDao.getParentField(),
                eDocumentNamingRuleConditionDao.getParentType());
    }

    public static void fromDTO(DocumentNamingRuleConditionDto vDocumentNamingRuleConditionDto, DocumentNamingRuleConditionDao eDocumentNamingRuleConditionDao) {
        eDocumentNamingRuleConditionDao.setName(vDocumentNamingRuleConditionDto.name());
        eDocumentNamingRuleConditionDao.setCreation(vDocumentNamingRuleConditionDto.creation());
        eDocumentNamingRuleConditionDao.setModified(vDocumentNamingRuleConditionDto.modified());
        eDocumentNamingRuleConditionDao.setModifiedBy(vDocumentNamingRuleConditionDto.modifiedBy());
        eDocumentNamingRuleConditionDao.setOwner(vDocumentNamingRuleConditionDto.owner());
        eDocumentNamingRuleConditionDao.setIsDocStatus(vDocumentNamingRuleConditionDto.isDocStatus());
        eDocumentNamingRuleConditionDao.setIdx(vDocumentNamingRuleConditionDto.idx());
        eDocumentNamingRuleConditionDao.setField(vDocumentNamingRuleConditionDto.field());
        eDocumentNamingRuleConditionDao.setCondition(vDocumentNamingRuleConditionDto.condition());
        eDocumentNamingRuleConditionDao.setValue(vDocumentNamingRuleConditionDto.value());
        eDocumentNamingRuleConditionDao.setParent(vDocumentNamingRuleConditionDto.parent());
        eDocumentNamingRuleConditionDao.setParentField(vDocumentNamingRuleConditionDto.parentField());
        eDocumentNamingRuleConditionDao.setParentType(vDocumentNamingRuleConditionDto.parentType());
    }
}