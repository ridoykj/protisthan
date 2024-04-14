package com.itbd.application.db.dto.reports;

import com.itbd.application.db.dao.reports.ReportColumnDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ReportColumnDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String fieldName,
        String label,
        String fieldType,
        String options,
        Integer width,
        String parent,
        String parentField,
        String parentType
) {
    public static ReportColumnDto fromEntity(ReportColumnDao eReportColumnDao) {
        return new ReportColumnDto(
                eReportColumnDao.getName(),
                eReportColumnDao.getCreation(),
                eReportColumnDao.getModified(),
                eReportColumnDao.getModifiedBy(),
                eReportColumnDao.getOwner(),
                eReportColumnDao.getIsDocStatus(),
                eReportColumnDao.getIdx(),
                eReportColumnDao.getFieldName(),
                eReportColumnDao.getLabel(),
                eReportColumnDao.getFieldType(),
                eReportColumnDao.getOptions(),
                eReportColumnDao.getWidth(),
                eReportColumnDao.getParent(),
                eReportColumnDao.getParentField(),
                eReportColumnDao.getParentType());
    }

    public static void fromDTO(ReportColumnDto vReportColumnDto, ReportColumnDao eReportColumnDao) {
        eReportColumnDao.setName(vReportColumnDto.name());
        eReportColumnDao.setCreation(vReportColumnDto.creation());
        eReportColumnDao.setModified(vReportColumnDto.modified());
        eReportColumnDao.setModifiedBy(vReportColumnDto.modifiedBy());
        eReportColumnDao.setOwner(vReportColumnDto.owner());
        eReportColumnDao.setIsDocStatus(vReportColumnDto.isDocStatus());
        eReportColumnDao.setIdx(vReportColumnDto.idx());
        eReportColumnDao.setFieldName(vReportColumnDto.fieldName());
        eReportColumnDao.setLabel(vReportColumnDto.label());
        eReportColumnDao.setFieldType(vReportColumnDto.fieldType());
        eReportColumnDao.setOptions(vReportColumnDto.options());
        eReportColumnDao.setWidth(vReportColumnDto.width());
        eReportColumnDao.setParent(vReportColumnDto.parent());
        eReportColumnDao.setParentField(vReportColumnDto.parentField());
        eReportColumnDao.setParentType(vReportColumnDto.parentType());
    }
}