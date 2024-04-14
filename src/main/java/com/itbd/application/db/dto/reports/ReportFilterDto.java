package com.itbd.application.db.dto.reports;

import com.itbd.application.db.dao.reports.ReportFilterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ReportFilterDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String label,
        String fieldType,
        String fieldName,
        Boolean mandatory,
        Boolean wildcardFilter,
        String options,
        String defaults,
        String parent,
        String parentField,
        String parentType
) {
    public static ReportFilterDto fromEntity(ReportFilterDao eReportFilterDao) {
        return new ReportFilterDto(
                eReportFilterDao.getName(),
                eReportFilterDao.getCreation(),
                eReportFilterDao.getModified(),
                eReportFilterDao.getModifiedBy(),
                eReportFilterDao.getOwner(),
                eReportFilterDao.getIsDocStatus(),
                eReportFilterDao.getIdx(),
                eReportFilterDao.getLabel(),
                eReportFilterDao.getFieldType(),
                eReportFilterDao.getFieldName(),
                eReportFilterDao.getMandatory(),
                eReportFilterDao.getWildcardFilter(),
                eReportFilterDao.getOptions(),
                eReportFilterDao.getDefaults(),
                eReportFilterDao.getParent(),
                eReportFilterDao.getParentField(),
                eReportFilterDao.getParentType());
    }

    public static void fromDTO(ReportFilterDto vReportFilterDto, ReportFilterDao eReportFilterDao) {
        eReportFilterDao.setName(vReportFilterDto.name());
        eReportFilterDao.setCreation(vReportFilterDto.creation());
        eReportFilterDao.setModified(vReportFilterDto.modified());
        eReportFilterDao.setModifiedBy(vReportFilterDto.modifiedBy());
        eReportFilterDao.setOwner(vReportFilterDto.owner());
        eReportFilterDao.setIsDocStatus(vReportFilterDto.isDocStatus());
        eReportFilterDao.setIdx(vReportFilterDto.idx());
        eReportFilterDao.setLabel(vReportFilterDto.label());
        eReportFilterDao.setFieldType(vReportFilterDto.fieldType());
        eReportFilterDao.setFieldName(vReportFilterDto.fieldName());
        eReportFilterDao.setMandatory(vReportFilterDto.mandatory());
        eReportFilterDao.setWildcardFilter(vReportFilterDto.wildcardFilter());
        eReportFilterDao.setOptions(vReportFilterDto.options());
        eReportFilterDao.setDefaults(vReportFilterDto.defaults());
        eReportFilterDao.setParent(vReportFilterDto.parent());
        eReportFilterDao.setParentField(vReportFilterDto.parentField());
        eReportFilterDao.setParentType(vReportFilterDto.parentType());
    }
}