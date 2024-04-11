package com.itbd.application.db.dto.documents;

import com.itbd.application.db.dao.documents.DocumentNamingRuleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocumentNamingRuleDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        Boolean disabled,
        Integer priority,
        String prefix,
        Integer counter,
        Integer prefixDigits,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DocumentNamingRuleDto fromEntity(DocumentNamingRuleDao eDocumentNamingRuleDao) {
        return new DocumentNamingRuleDto(
                eDocumentNamingRuleDao.getName(),
                eDocumentNamingRuleDao.getCreation(),
                eDocumentNamingRuleDao.getModified(),
                eDocumentNamingRuleDao.getModifiedBy(),
                eDocumentNamingRuleDao.getOwner(),
                eDocumentNamingRuleDao.getIsDocStatus(),
                eDocumentNamingRuleDao.getIdx(),
                eDocumentNamingRuleDao.getDocumentType(),
                eDocumentNamingRuleDao.getDisabled(),
                eDocumentNamingRuleDao.getPriority(),
                eDocumentNamingRuleDao.getPrefix(),
                eDocumentNamingRuleDao.getCounter(),
                eDocumentNamingRuleDao.getPrefixDigits(),
                eDocumentNamingRuleDao.getUserTags(),
                eDocumentNamingRuleDao.getComments(),
                eDocumentNamingRuleDao.getAssign(),
                eDocumentNamingRuleDao.getLikedBy());
    }

    public static void fromDTO(DocumentNamingRuleDto vDocumentNamingRuleDto, DocumentNamingRuleDao eDocumentNamingRuleDao) {
        eDocumentNamingRuleDao.setName(vDocumentNamingRuleDto.name());
        eDocumentNamingRuleDao.setCreation(vDocumentNamingRuleDto.creation());
        eDocumentNamingRuleDao.setModified(vDocumentNamingRuleDto.modified());
        eDocumentNamingRuleDao.setModifiedBy(vDocumentNamingRuleDto.modifiedBy());
        eDocumentNamingRuleDao.setOwner(vDocumentNamingRuleDto.owner());
        eDocumentNamingRuleDao.setIsDocStatus(vDocumentNamingRuleDto.isDocStatus());
        eDocumentNamingRuleDao.setIdx(vDocumentNamingRuleDto.idx());
        eDocumentNamingRuleDao.setDocumentType(vDocumentNamingRuleDto.documentType());
        eDocumentNamingRuleDao.setDisabled(vDocumentNamingRuleDto.disabled());
        eDocumentNamingRuleDao.setPriority(vDocumentNamingRuleDto.priority());
        eDocumentNamingRuleDao.setPrefix(vDocumentNamingRuleDto.prefix());
        eDocumentNamingRuleDao.setCounter(vDocumentNamingRuleDto.counter());
        eDocumentNamingRuleDao.setPrefixDigits(vDocumentNamingRuleDto.prefixDigits());
        eDocumentNamingRuleDao.setUserTags(vDocumentNamingRuleDto.userTags());
        eDocumentNamingRuleDao.setComments(vDocumentNamingRuleDto.comments());
        eDocumentNamingRuleDao.setAssign(vDocumentNamingRuleDto.assign());
        eDocumentNamingRuleDao.setLikedBy(vDocumentNamingRuleDto.likedBy());
    }
}