package com.itbd.application.db.dto.doctypes;

import com.itbd.application.db.dao.doctypes.DocTypeLayoutFieldDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocTypeLayoutFieldDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String label,
        String fieldName,
        String parent,
        String parentField,
        String parentType
) {
    public static DocTypeLayoutFieldDto fromEntity(DocTypeLayoutFieldDao eDocTypeLayoutFieldDao) {
        return new DocTypeLayoutFieldDto(
                eDocTypeLayoutFieldDao.getName(),
                eDocTypeLayoutFieldDao.getCreation(),
                eDocTypeLayoutFieldDao.getModified(),
                eDocTypeLayoutFieldDao.getModifiedBy(),
                eDocTypeLayoutFieldDao.getOwner(),
                eDocTypeLayoutFieldDao.getIsDocStatus(),
                eDocTypeLayoutFieldDao.getIdx(),
                eDocTypeLayoutFieldDao.getLabel(),
                eDocTypeLayoutFieldDao.getFieldName(),
                eDocTypeLayoutFieldDao.getParent(),
                eDocTypeLayoutFieldDao.getParentField(),
                eDocTypeLayoutFieldDao.getParentType());
    }

    public static void fromDTO(DocTypeLayoutFieldDto vDocTypeLayoutFieldDto, DocTypeLayoutFieldDao eDocTypeLayoutFieldDao) {
        eDocTypeLayoutFieldDao.setName(vDocTypeLayoutFieldDto.name());
        eDocTypeLayoutFieldDao.setCreation(vDocTypeLayoutFieldDto.creation());
        eDocTypeLayoutFieldDao.setModified(vDocTypeLayoutFieldDto.modified());
        eDocTypeLayoutFieldDao.setModifiedBy(vDocTypeLayoutFieldDto.modifiedBy());
        eDocTypeLayoutFieldDao.setOwner(vDocTypeLayoutFieldDto.owner());
        eDocTypeLayoutFieldDao.setIsDocStatus(vDocTypeLayoutFieldDto.isDocStatus());
        eDocTypeLayoutFieldDao.setIdx(vDocTypeLayoutFieldDto.idx());
        eDocTypeLayoutFieldDao.setLabel(vDocTypeLayoutFieldDto.label());
        eDocTypeLayoutFieldDao.setFieldName(vDocTypeLayoutFieldDto.fieldName());
        eDocTypeLayoutFieldDao.setParent(vDocTypeLayoutFieldDto.parent());
        eDocTypeLayoutFieldDao.setParentField(vDocTypeLayoutFieldDto.parentField());
        eDocTypeLayoutFieldDao.setParentType(vDocTypeLayoutFieldDto.parentType());
    }
}