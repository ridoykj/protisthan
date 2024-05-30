package com.itbd.application.db.dto;

import com.itbd.application.db.dao.integrations.IntegrationRequestDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record IntegrationRequestDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String requestId,
        String integrationRequestService,
        Boolean isRemoteRequest,
        String requestDescription,
        String status,
        String url,
        String requestHeaders,
        String data,
        String output,
        String error,
        String referenceDocType,
        String referenceDocName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static IntegrationRequestDto fromEntity(IntegrationRequestDao eIntegrationRequestDao) {
        return new IntegrationRequestDto(
                eIntegrationRequestDao.getName(),
                eIntegrationRequestDao.getCreation(),
                eIntegrationRequestDao.getModified(),
                eIntegrationRequestDao.getModifiedBy(),
                eIntegrationRequestDao.getOwner(),
                eIntegrationRequestDao.getIsDocStatus(),
                eIntegrationRequestDao.getIdx(),
                eIntegrationRequestDao.getRequestId(),
                eIntegrationRequestDao.getIntegrationRequestService(),
                eIntegrationRequestDao.getIsRemoteRequest(),
                eIntegrationRequestDao.getRequestDescription(),
                eIntegrationRequestDao.getStatus(),
                eIntegrationRequestDao.getUrl(),
                eIntegrationRequestDao.getRequestHeaders(),
                eIntegrationRequestDao.getData(),
                eIntegrationRequestDao.getOutput(),
                eIntegrationRequestDao.getError(),
                eIntegrationRequestDao.getReferenceDocType(),
                eIntegrationRequestDao.getReferenceDocName(),
                eIntegrationRequestDao.getUserTags(),
                eIntegrationRequestDao.getComments(),
                eIntegrationRequestDao.getAssign(),
                eIntegrationRequestDao.getLikedBy());
    }

    public static void fromDTO(IntegrationRequestDto vIntegrationRequestDto, IntegrationRequestDao eIntegrationRequestDao) {
        eIntegrationRequestDao.setName(vIntegrationRequestDto.name());
        eIntegrationRequestDao.setCreation(vIntegrationRequestDto.creation());
        eIntegrationRequestDao.setModified(vIntegrationRequestDto.modified());
        eIntegrationRequestDao.setModifiedBy(vIntegrationRequestDto.modifiedBy());
        eIntegrationRequestDao.setOwner(vIntegrationRequestDto.owner());
        eIntegrationRequestDao.setIsDocStatus(vIntegrationRequestDto.isDocStatus());
        eIntegrationRequestDao.setIdx(vIntegrationRequestDto.idx());
        eIntegrationRequestDao.setRequestId(vIntegrationRequestDto.requestId());
        eIntegrationRequestDao.setIntegrationRequestService(vIntegrationRequestDto.integrationRequestService());
        eIntegrationRequestDao.setIsRemoteRequest(vIntegrationRequestDto.isRemoteRequest());
        eIntegrationRequestDao.setRequestDescription(vIntegrationRequestDto.requestDescription());
        eIntegrationRequestDao.setStatus(vIntegrationRequestDto.status());
        eIntegrationRequestDao.setUrl(vIntegrationRequestDto.url());
        eIntegrationRequestDao.setRequestHeaders(vIntegrationRequestDto.requestHeaders());
        eIntegrationRequestDao.setData(vIntegrationRequestDto.data());
        eIntegrationRequestDao.setOutput(vIntegrationRequestDto.output());
        eIntegrationRequestDao.setError(vIntegrationRequestDto.error());
        eIntegrationRequestDao.setReferenceDocType(vIntegrationRequestDto.referenceDocType());
        eIntegrationRequestDao.setReferenceDocName(vIntegrationRequestDto.referenceDocName());
        eIntegrationRequestDao.setUserTags(vIntegrationRequestDto.userTags());
        eIntegrationRequestDao.setComments(vIntegrationRequestDto.comments());
        eIntegrationRequestDao.setAssign(vIntegrationRequestDto.assign());
        eIntegrationRequestDao.setLikedBy(vIntegrationRequestDto.likedBy());
    }
}