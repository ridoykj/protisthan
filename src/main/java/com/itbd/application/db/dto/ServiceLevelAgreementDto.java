package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ServiceLevelAgreementDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ServiceLevelAgreementDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String defaultPriority,
        String serviceLevel,
        Boolean enabled,
        Boolean defaultServiceLevelAgreement,
        String entityType,
        String entity,
        String condition,
        LocalDate startDate,
        LocalDate endDate,
        Boolean applySlaForResolution,
        String holidayList,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ServiceLevelAgreementDto fromEntity(ServiceLevelAgreementDao eServiceLevelAgreementDao) {
        return new ServiceLevelAgreementDto(
                eServiceLevelAgreementDao.getName(),
                eServiceLevelAgreementDao.getCreation(),
                eServiceLevelAgreementDao.getModified(),
                eServiceLevelAgreementDao.getModifiedBy(),
                eServiceLevelAgreementDao.getOwner(),
                eServiceLevelAgreementDao.getIsDocStatus(),
                eServiceLevelAgreementDao.getIdx(),
                eServiceLevelAgreementDao.getDocumentType(),
                eServiceLevelAgreementDao.getDefaultPriority(),
                eServiceLevelAgreementDao.getServiceLevel(),
                eServiceLevelAgreementDao.getEnabled(),
                eServiceLevelAgreementDao.getDefaultServiceLevelAgreement(),
                eServiceLevelAgreementDao.getEntityType(),
                eServiceLevelAgreementDao.getEntity(),
                eServiceLevelAgreementDao.getCondition(),
                eServiceLevelAgreementDao.getStartDate(),
                eServiceLevelAgreementDao.getEndDate(),
                eServiceLevelAgreementDao.getApplySlaForResolution(),
                eServiceLevelAgreementDao.getHolidayList(),
                eServiceLevelAgreementDao.getUserTags(),
                eServiceLevelAgreementDao.getComments(),
                eServiceLevelAgreementDao.getAssign(),
                eServiceLevelAgreementDao.getLikedBy());
    }

    public static void fromDTO(ServiceLevelAgreementDto vServiceLevelAgreementDto, ServiceLevelAgreementDao eServiceLevelAgreementDao) {
        eServiceLevelAgreementDao.setName(vServiceLevelAgreementDto.name());
        eServiceLevelAgreementDao.setCreation(vServiceLevelAgreementDto.creation());
        eServiceLevelAgreementDao.setModified(vServiceLevelAgreementDto.modified());
        eServiceLevelAgreementDao.setModifiedBy(vServiceLevelAgreementDto.modifiedBy());
        eServiceLevelAgreementDao.setOwner(vServiceLevelAgreementDto.owner());
        eServiceLevelAgreementDao.setIsDocStatus(vServiceLevelAgreementDto.isDocStatus());
        eServiceLevelAgreementDao.setIdx(vServiceLevelAgreementDto.idx());
        eServiceLevelAgreementDao.setDocumentType(vServiceLevelAgreementDto.documentType());
        eServiceLevelAgreementDao.setDefaultPriority(vServiceLevelAgreementDto.defaultPriority());
        eServiceLevelAgreementDao.setServiceLevel(vServiceLevelAgreementDto.serviceLevel());
        eServiceLevelAgreementDao.setEnabled(vServiceLevelAgreementDto.enabled());
        eServiceLevelAgreementDao.setDefaultServiceLevelAgreement(vServiceLevelAgreementDto.defaultServiceLevelAgreement());
        eServiceLevelAgreementDao.setEntityType(vServiceLevelAgreementDto.entityType());
        eServiceLevelAgreementDao.setEntity(vServiceLevelAgreementDto.entity());
        eServiceLevelAgreementDao.setCondition(vServiceLevelAgreementDto.condition());
        eServiceLevelAgreementDao.setStartDate(vServiceLevelAgreementDto.startDate());
        eServiceLevelAgreementDao.setEndDate(vServiceLevelAgreementDto.endDate());
        eServiceLevelAgreementDao.setApplySlaForResolution(vServiceLevelAgreementDto.applySlaForResolution());
        eServiceLevelAgreementDao.setHolidayList(vServiceLevelAgreementDto.holidayList());
        eServiceLevelAgreementDao.setUserTags(vServiceLevelAgreementDto.userTags());
        eServiceLevelAgreementDao.setComments(vServiceLevelAgreementDto.comments());
        eServiceLevelAgreementDao.setAssign(vServiceLevelAgreementDto.assign());
        eServiceLevelAgreementDao.setLikedBy(vServiceLevelAgreementDto.likedBy());
    }
}