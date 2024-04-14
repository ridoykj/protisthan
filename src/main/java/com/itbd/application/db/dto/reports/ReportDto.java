package com.itbd.application.db.dto.reports;

import com.itbd.application.db.dao.reports.ReportDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ReportDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String reportName,
        String refDocType,
        String referenceReport,
        String isStandard,
        String module,
        String reportType,
        String letterHead,
        Boolean addTotalRow,
        Boolean disabled,
        Boolean preparedReport,
        String query,
        String reportScript,
        String javascript,
        String json,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ReportDto fromEntity(ReportDao eReportDao) {
        return new ReportDto(
                eReportDao.getName(),
                eReportDao.getCreation(),
                eReportDao.getModified(),
                eReportDao.getModifiedBy(),
                eReportDao.getOwner(),
                eReportDao.getIsDocStatus(),
                eReportDao.getIdx(),
                eReportDao.getReportName(),
                eReportDao.getRefDocType(),
                eReportDao.getReferenceReport(),
                eReportDao.getIsStandard(),
                eReportDao.getModule(),
                eReportDao.getReportType(),
                eReportDao.getLetterHead(),
                eReportDao.getAddTotalRow(),
                eReportDao.getDisabled(),
                eReportDao.getPreparedReport(),
                eReportDao.getQuery(),
                eReportDao.getReportScript(),
                eReportDao.getJavascript(),
                eReportDao.getJson(),
                eReportDao.getUserTags(),
                eReportDao.getComments(),
                eReportDao.getAssign(),
                eReportDao.getLikedBy());
    }

    public static void fromDTO(ReportDto vReportDto, ReportDao eReportDao) {
        eReportDao.setName(vReportDto.name());
        eReportDao.setCreation(vReportDto.creation());
        eReportDao.setModified(vReportDto.modified());
        eReportDao.setModifiedBy(vReportDto.modifiedBy());
        eReportDao.setOwner(vReportDto.owner());
        eReportDao.setIsDocStatus(vReportDto.isDocStatus());
        eReportDao.setIdx(vReportDto.idx());
        eReportDao.setReportName(vReportDto.reportName());
        eReportDao.setRefDocType(vReportDto.refDocType());
        eReportDao.setReferenceReport(vReportDto.referenceReport());
        eReportDao.setIsStandard(vReportDto.isStandard());
        eReportDao.setModule(vReportDto.module());
        eReportDao.setReportType(vReportDto.reportType());
        eReportDao.setLetterHead(vReportDto.letterHead());
        eReportDao.setAddTotalRow(vReportDto.addTotalRow());
        eReportDao.setDisabled(vReportDto.disabled());
        eReportDao.setPreparedReport(vReportDto.preparedReport());
        eReportDao.setQuery(vReportDto.query());
        eReportDao.setReportScript(vReportDto.reportScript());
        eReportDao.setJavascript(vReportDto.javascript());
        eReportDao.setJson(vReportDto.json());
        eReportDao.setUserTags(vReportDto.userTags());
        eReportDao.setComments(vReportDto.comments());
        eReportDao.setAssign(vReportDto.assign());
        eReportDao.setLikedBy(vReportDto.likedBy());
    }
}