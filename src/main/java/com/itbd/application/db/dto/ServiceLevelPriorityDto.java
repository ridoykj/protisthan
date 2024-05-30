package com.itbd.application.db.dto;

import com.itbd.application.db.dao.support.service.ServiceLevelPriorityDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ServiceLevelPriorityDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean defaultPriority,
        String priority,
        BigDecimal responseTime,
        BigDecimal resolutionTime,
        String parent,
        String parentField,
        String parentType
) {
    public static ServiceLevelPriorityDto fromEntity(ServiceLevelPriorityDao eServiceLevelPriorityDao) {
        return new ServiceLevelPriorityDto(
                eServiceLevelPriorityDao.getName(),
                eServiceLevelPriorityDao.getCreation(),
                eServiceLevelPriorityDao.getModified(),
                eServiceLevelPriorityDao.getModifiedBy(),
                eServiceLevelPriorityDao.getOwner(),
                eServiceLevelPriorityDao.getIsDocStatus(),
                eServiceLevelPriorityDao.getIdx(),
                eServiceLevelPriorityDao.getDefaultPriority(),
                eServiceLevelPriorityDao.getPriority(),
                eServiceLevelPriorityDao.getResponseTime(),
                eServiceLevelPriorityDao.getResolutionTime(),
                eServiceLevelPriorityDao.getParent(),
                eServiceLevelPriorityDao.getParentField(),
                eServiceLevelPriorityDao.getParentType());
    }

    public static void fromDTO(ServiceLevelPriorityDto vServiceLevelPriorityDto, ServiceLevelPriorityDao eServiceLevelPriorityDao) {
        eServiceLevelPriorityDao.setName(vServiceLevelPriorityDto.name());
        eServiceLevelPriorityDao.setCreation(vServiceLevelPriorityDto.creation());
        eServiceLevelPriorityDao.setModified(vServiceLevelPriorityDto.modified());
        eServiceLevelPriorityDao.setModifiedBy(vServiceLevelPriorityDto.modifiedBy());
        eServiceLevelPriorityDao.setOwner(vServiceLevelPriorityDto.owner());
        eServiceLevelPriorityDao.setIsDocStatus(vServiceLevelPriorityDto.isDocStatus());
        eServiceLevelPriorityDao.setIdx(vServiceLevelPriorityDto.idx());
        eServiceLevelPriorityDao.setDefaultPriority(vServiceLevelPriorityDto.defaultPriority());
        eServiceLevelPriorityDao.setPriority(vServiceLevelPriorityDto.priority());
        eServiceLevelPriorityDao.setResponseTime(vServiceLevelPriorityDto.responseTime());
        eServiceLevelPriorityDao.setResolutionTime(vServiceLevelPriorityDto.resolutionTime());
        eServiceLevelPriorityDao.setParent(vServiceLevelPriorityDto.parent());
        eServiceLevelPriorityDao.setParentField(vServiceLevelPriorityDto.parentField());
        eServiceLevelPriorityDao.setParentType(vServiceLevelPriorityDto.parentType());
    }
}