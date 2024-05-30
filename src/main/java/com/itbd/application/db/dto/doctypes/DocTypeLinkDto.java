package com.itbd.application.db.dto.doctypes;

import com.itbd.application.db.dao.core.doc.DocTypeLinkDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocTypeLinkDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        String parent,
        String parentField,
        String parentType,
        Integer idx,
        String group,
        String linkDocType,
        String linkFieldName,
        String parentDocType,
        String tableFieldName,
        Boolean hidden,
        Boolean isChildTable,
        Boolean custom
) {
    public static DocTypeLinkDto fromEntity(DocTypeLinkDao eDocTypeLinkDao) {
        return new DocTypeLinkDto(
                eDocTypeLinkDao.getName(),
                eDocTypeLinkDao.getCreation(),
                eDocTypeLinkDao.getModified(),
                eDocTypeLinkDao.getModifiedBy(),
                eDocTypeLinkDao.getOwner(),
                eDocTypeLinkDao.getIsDocStatus(),
                eDocTypeLinkDao.getParent(),
                eDocTypeLinkDao.getParentField(),
                eDocTypeLinkDao.getParentType(),
                eDocTypeLinkDao.getIdx(),
                eDocTypeLinkDao.getGroup(),
                eDocTypeLinkDao.getLinkDocType(),
                eDocTypeLinkDao.getLinkFieldName(),
                eDocTypeLinkDao.getParentDocType(),
                eDocTypeLinkDao.getTableFieldName(),
                eDocTypeLinkDao.getHidden(),
                eDocTypeLinkDao.getIsChildTable(),
                eDocTypeLinkDao.getCustom());
    }

    public static void fromDTO(DocTypeLinkDto vDocTypeLinkDto, DocTypeLinkDao eDocTypeLinkDao) {
        eDocTypeLinkDao.setName(vDocTypeLinkDto.name());
        eDocTypeLinkDao.setCreation(vDocTypeLinkDto.creation());
        eDocTypeLinkDao.setModified(vDocTypeLinkDto.modified());
        eDocTypeLinkDao.setModifiedBy(vDocTypeLinkDto.modifiedBy());
        eDocTypeLinkDao.setOwner(vDocTypeLinkDto.owner());
        eDocTypeLinkDao.setIsDocStatus(vDocTypeLinkDto.isDocStatus());
        eDocTypeLinkDao.setParent(vDocTypeLinkDto.parent());
        eDocTypeLinkDao.setParentField(vDocTypeLinkDto.parentField());
        eDocTypeLinkDao.setParentType(vDocTypeLinkDto.parentType());
        eDocTypeLinkDao.setIdx(vDocTypeLinkDto.idx());
        eDocTypeLinkDao.setGroup(vDocTypeLinkDto.group());
        eDocTypeLinkDao.setLinkDocType(vDocTypeLinkDto.linkDocType());
        eDocTypeLinkDao.setLinkFieldName(vDocTypeLinkDto.linkFieldName());
        eDocTypeLinkDao.setParentDocType(vDocTypeLinkDto.parentDocType());
        eDocTypeLinkDao.setTableFieldName(vDocTypeLinkDto.tableFieldName());
        eDocTypeLinkDao.setHidden(vDocTypeLinkDto.hidden());
        eDocTypeLinkDao.setIsChildTable(vDocTypeLinkDto.isChildTable());
        eDocTypeLinkDao.setCustom(vDocTypeLinkDto.custom());
    }
}