package com.itbd.application.db.dto;

import com.itbd.application.db.dao.support.SupportSearchSourceDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SupportSearchSourceDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String sourceName,
        String sourceType,
        String baseUrl,
        String queryRoute,
        String searchTermParamName,
        String responseResultKeyPath,
        String postRoute,
        String postRouteKeyList,
        String postTitleKey,
        String postDescriptionKey,
        String sourceDocType,
        String resultTitleField,
        String resultPreviewField,
        String resultRouteField,
        String parent,
        String parentField,
        String parentType
) {
    public static SupportSearchSourceDto fromEntity(SupportSearchSourceDao eSupportSearchSourceDao) {
        return new SupportSearchSourceDto(
                eSupportSearchSourceDao.getName(),
                eSupportSearchSourceDao.getCreation(),
                eSupportSearchSourceDao.getModified(),
                eSupportSearchSourceDao.getModifiedBy(),
                eSupportSearchSourceDao.getOwner(),
                eSupportSearchSourceDao.getIsDocStatus(),
                eSupportSearchSourceDao.getIdx(),
                eSupportSearchSourceDao.getSourceName(),
                eSupportSearchSourceDao.getSourceType(),
                eSupportSearchSourceDao.getBaseUrl(),
                eSupportSearchSourceDao.getQueryRoute(),
                eSupportSearchSourceDao.getSearchTermParamName(),
                eSupportSearchSourceDao.getResponseResultKeyPath(),
                eSupportSearchSourceDao.getPostRoute(),
                eSupportSearchSourceDao.getPostRouteKeyList(),
                eSupportSearchSourceDao.getPostTitleKey(),
                eSupportSearchSourceDao.getPostDescriptionKey(),
                eSupportSearchSourceDao.getSourceDocType(),
                eSupportSearchSourceDao.getResultTitleField(),
                eSupportSearchSourceDao.getResultPreviewField(),
                eSupportSearchSourceDao.getResultRouteField(),
                eSupportSearchSourceDao.getParent(),
                eSupportSearchSourceDao.getParentField(),
                eSupportSearchSourceDao.getParentType());
    }

    public static void fromDTO(SupportSearchSourceDto vSupportSearchSourceDto, SupportSearchSourceDao eSupportSearchSourceDao) {
        eSupportSearchSourceDao.setName(vSupportSearchSourceDto.name());
        eSupportSearchSourceDao.setCreation(vSupportSearchSourceDto.creation());
        eSupportSearchSourceDao.setModified(vSupportSearchSourceDto.modified());
        eSupportSearchSourceDao.setModifiedBy(vSupportSearchSourceDto.modifiedBy());
        eSupportSearchSourceDao.setOwner(vSupportSearchSourceDto.owner());
        eSupportSearchSourceDao.setIsDocStatus(vSupportSearchSourceDto.isDocStatus());
        eSupportSearchSourceDao.setIdx(vSupportSearchSourceDto.idx());
        eSupportSearchSourceDao.setSourceName(vSupportSearchSourceDto.sourceName());
        eSupportSearchSourceDao.setSourceType(vSupportSearchSourceDto.sourceType());
        eSupportSearchSourceDao.setBaseUrl(vSupportSearchSourceDto.baseUrl());
        eSupportSearchSourceDao.setQueryRoute(vSupportSearchSourceDto.queryRoute());
        eSupportSearchSourceDao.setSearchTermParamName(vSupportSearchSourceDto.searchTermParamName());
        eSupportSearchSourceDao.setResponseResultKeyPath(vSupportSearchSourceDto.responseResultKeyPath());
        eSupportSearchSourceDao.setPostRoute(vSupportSearchSourceDto.postRoute());
        eSupportSearchSourceDao.setPostRouteKeyList(vSupportSearchSourceDto.postRouteKeyList());
        eSupportSearchSourceDao.setPostTitleKey(vSupportSearchSourceDto.postTitleKey());
        eSupportSearchSourceDao.setPostDescriptionKey(vSupportSearchSourceDto.postDescriptionKey());
        eSupportSearchSourceDao.setSourceDocType(vSupportSearchSourceDto.sourceDocType());
        eSupportSearchSourceDao.setResultTitleField(vSupportSearchSourceDto.resultTitleField());
        eSupportSearchSourceDao.setResultPreviewField(vSupportSearchSourceDto.resultPreviewField());
        eSupportSearchSourceDao.setResultRouteField(vSupportSearchSourceDto.resultRouteField());
        eSupportSearchSourceDao.setParent(vSupportSearchSourceDto.parent());
        eSupportSearchSourceDao.setParentField(vSupportSearchSourceDto.parentField());
        eSupportSearchSourceDao.setParentType(vSupportSearchSourceDto.parentType());
    }
}