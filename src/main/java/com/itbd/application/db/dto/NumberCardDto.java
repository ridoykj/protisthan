package com.itbd.application.db.dto;

import com.itbd.application.db.dao.NumberCardDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NumberCardDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean isStandard,
        String module,
        String label,
        String type,
        String reportName,
        String method,
        String function,
        String aggregateFunctionBasedOn,
        String documentType,
        String parentDocumentType,
        String reportField,
        String reportFunction,
        Boolean isPublic,
        String filtersConfig,
        Boolean showPercentageStats,
        String statsTimeInterval,
        String filtersJson,
        String dynamicFiltersJson,
        String color,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static NumberCardDto fromEntity(NumberCardDao eNumberCardDao) {
        return new NumberCardDto(
                eNumberCardDao.getName(),
                eNumberCardDao.getCreation(),
                eNumberCardDao.getModified(),
                eNumberCardDao.getModifiedBy(),
                eNumberCardDao.getOwner(),
                eNumberCardDao.getIsDocStatus(),
                eNumberCardDao.getIdx(),
                eNumberCardDao.getIsStandard(),
                eNumberCardDao.getModule(),
                eNumberCardDao.getLabel(),
                eNumberCardDao.getType(),
                eNumberCardDao.getReportName(),
                eNumberCardDao.getMethod(),
                eNumberCardDao.getFunction(),
                eNumberCardDao.getAggregateFunctionBasedOn(),
                eNumberCardDao.getDocumentType(),
                eNumberCardDao.getParentDocumentType(),
                eNumberCardDao.getReportField(),
                eNumberCardDao.getReportFunction(),
                eNumberCardDao.getIsPublic(),
                eNumberCardDao.getFiltersConfig(),
                eNumberCardDao.getShowPercentageStats(),
                eNumberCardDao.getStatsTimeInterval(),
                eNumberCardDao.getFiltersJson(),
                eNumberCardDao.getDynamicFiltersJson(),
                eNumberCardDao.getColor(),
                eNumberCardDao.getUserTags(),
                eNumberCardDao.getComments(),
                eNumberCardDao.getAssign(),
                eNumberCardDao.getLikedBy());
    }

    public static void fromDTO(NumberCardDto vNumberCardDto, NumberCardDao eNumberCardDao) {
        eNumberCardDao.setName(vNumberCardDto.name());
        eNumberCardDao.setCreation(vNumberCardDto.creation());
        eNumberCardDao.setModified(vNumberCardDto.modified());
        eNumberCardDao.setModifiedBy(vNumberCardDto.modifiedBy());
        eNumberCardDao.setOwner(vNumberCardDto.owner());
        eNumberCardDao.setIsDocStatus(vNumberCardDto.isDocStatus());
        eNumberCardDao.setIdx(vNumberCardDto.idx());
        eNumberCardDao.setIsStandard(vNumberCardDto.isStandard());
        eNumberCardDao.setModule(vNumberCardDto.module());
        eNumberCardDao.setLabel(vNumberCardDto.label());
        eNumberCardDao.setType(vNumberCardDto.type());
        eNumberCardDao.setReportName(vNumberCardDto.reportName());
        eNumberCardDao.setMethod(vNumberCardDto.method());
        eNumberCardDao.setFunction(vNumberCardDto.function());
        eNumberCardDao.setAggregateFunctionBasedOn(vNumberCardDto.aggregateFunctionBasedOn());
        eNumberCardDao.setDocumentType(vNumberCardDto.documentType());
        eNumberCardDao.setParentDocumentType(vNumberCardDto.parentDocumentType());
        eNumberCardDao.setReportField(vNumberCardDto.reportField());
        eNumberCardDao.setReportFunction(vNumberCardDto.reportFunction());
        eNumberCardDao.setIsPublic(vNumberCardDto.isPublic());
        eNumberCardDao.setFiltersConfig(vNumberCardDto.filtersConfig());
        eNumberCardDao.setShowPercentageStats(vNumberCardDto.showPercentageStats());
        eNumberCardDao.setStatsTimeInterval(vNumberCardDto.statsTimeInterval());
        eNumberCardDao.setFiltersJson(vNumberCardDto.filtersJson());
        eNumberCardDao.setDynamicFiltersJson(vNumberCardDto.dynamicFiltersJson());
        eNumberCardDao.setColor(vNumberCardDto.color());
        eNumberCardDao.setUserTags(vNumberCardDto.userTags());
        eNumberCardDao.setComments(vNumberCardDto.comments());
        eNumberCardDao.setAssign(vNumberCardDto.assign());
        eNumberCardDao.setLikedBy(vNumberCardDto.likedBy());
    }
}