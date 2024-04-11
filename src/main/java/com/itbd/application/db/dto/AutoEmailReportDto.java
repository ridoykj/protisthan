package com.itbd.application.db.dto;

import com.itbd.application.db.dao.AutoEmailReportDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AutoEmailReportDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String report,
        String user,
        Boolean enabled,
        String reportType,
        String referenceReport,
        Boolean sendIfData,
        Integer dataModifiedTill,
        Integer noOfRows,
        String filters,
        String filterMeta,
        String fromDateField,
        String toDateField,
        String dynamicDatePeriod,
        Boolean useFirstDayOfPeriod,
        String emailTo,
        String dayOfWeek,
        String sender,
        String frequency,
        String format,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AutoEmailReportDto fromEntity(AutoEmailReportDao eAutoEmailReportDao) {
        return new AutoEmailReportDto(
                eAutoEmailReportDao.getName(),
                eAutoEmailReportDao.getCreation(),
                eAutoEmailReportDao.getModified(),
                eAutoEmailReportDao.getModifiedBy(),
                eAutoEmailReportDao.getOwner(),
                eAutoEmailReportDao.getIsDocStatus(),
                eAutoEmailReportDao.getIdx(),
                eAutoEmailReportDao.getReport(),
                eAutoEmailReportDao.getUser(),
                eAutoEmailReportDao.getEnabled(),
                eAutoEmailReportDao.getReportType(),
                eAutoEmailReportDao.getReferenceReport(),
                eAutoEmailReportDao.getSendIfData(),
                eAutoEmailReportDao.getDataModifiedTill(),
                eAutoEmailReportDao.getNoOfRows(),
                eAutoEmailReportDao.getFilters(),
                eAutoEmailReportDao.getFilterMeta(),
                eAutoEmailReportDao.getFromDateField(),
                eAutoEmailReportDao.getToDateField(),
                eAutoEmailReportDao.getDynamicDatePeriod(),
                eAutoEmailReportDao.getUseFirstDayOfPeriod(),
                eAutoEmailReportDao.getEmailTo(),
                eAutoEmailReportDao.getDayOfWeek(),
                eAutoEmailReportDao.getSender(),
                eAutoEmailReportDao.getFrequency(),
                eAutoEmailReportDao.getFormat(),
                eAutoEmailReportDao.getDescription(),
                eAutoEmailReportDao.getUserTags(),
                eAutoEmailReportDao.getComments(),
                eAutoEmailReportDao.getAssign(),
                eAutoEmailReportDao.getLikedBy());
    }

    public static void fromDTO(AutoEmailReportDto vAutoEmailReportDto, AutoEmailReportDao eAutoEmailReportDao) {
        eAutoEmailReportDao.setName(vAutoEmailReportDto.name());
        eAutoEmailReportDao.setCreation(vAutoEmailReportDto.creation());
        eAutoEmailReportDao.setModified(vAutoEmailReportDto.modified());
        eAutoEmailReportDao.setModifiedBy(vAutoEmailReportDto.modifiedBy());
        eAutoEmailReportDao.setOwner(vAutoEmailReportDto.owner());
        eAutoEmailReportDao.setIsDocStatus(vAutoEmailReportDto.isDocStatus());
        eAutoEmailReportDao.setIdx(vAutoEmailReportDto.idx());
        eAutoEmailReportDao.setReport(vAutoEmailReportDto.report());
        eAutoEmailReportDao.setUser(vAutoEmailReportDto.user());
        eAutoEmailReportDao.setEnabled(vAutoEmailReportDto.enabled());
        eAutoEmailReportDao.setReportType(vAutoEmailReportDto.reportType());
        eAutoEmailReportDao.setReferenceReport(vAutoEmailReportDto.referenceReport());
        eAutoEmailReportDao.setSendIfData(vAutoEmailReportDto.sendIfData());
        eAutoEmailReportDao.setDataModifiedTill(vAutoEmailReportDto.dataModifiedTill());
        eAutoEmailReportDao.setNoOfRows(vAutoEmailReportDto.noOfRows());
        eAutoEmailReportDao.setFilters(vAutoEmailReportDto.filters());
        eAutoEmailReportDao.setFilterMeta(vAutoEmailReportDto.filterMeta());
        eAutoEmailReportDao.setFromDateField(vAutoEmailReportDto.fromDateField());
        eAutoEmailReportDao.setToDateField(vAutoEmailReportDto.toDateField());
        eAutoEmailReportDao.setDynamicDatePeriod(vAutoEmailReportDto.dynamicDatePeriod());
        eAutoEmailReportDao.setUseFirstDayOfPeriod(vAutoEmailReportDto.useFirstDayOfPeriod());
        eAutoEmailReportDao.setEmailTo(vAutoEmailReportDto.emailTo());
        eAutoEmailReportDao.setDayOfWeek(vAutoEmailReportDto.dayOfWeek());
        eAutoEmailReportDao.setSender(vAutoEmailReportDto.sender());
        eAutoEmailReportDao.setFrequency(vAutoEmailReportDto.frequency());
        eAutoEmailReportDao.setFormat(vAutoEmailReportDto.format());
        eAutoEmailReportDao.setDescription(vAutoEmailReportDto.description());
        eAutoEmailReportDao.setUserTags(vAutoEmailReportDto.userTags());
        eAutoEmailReportDao.setComments(vAutoEmailReportDto.comments());
        eAutoEmailReportDao.setAssign(vAutoEmailReportDto.assign());
        eAutoEmailReportDao.setLikedBy(vAutoEmailReportDto.likedBy());
    }
}