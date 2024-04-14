package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProspectLeadDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ProspectLeadDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String lead,
        String leadName,
        String email,
        String mobileNo,
        String leadOwner,
        String status,
        String parent,
        String parentField,
        String parentType
) {
    public static ProspectLeadDto fromEntity(ProspectLeadDao eProspectLeadDao) {
        return new ProspectLeadDto(
                eProspectLeadDao.getName(),
                eProspectLeadDao.getCreation(),
                eProspectLeadDao.getModified(),
                eProspectLeadDao.getModifiedBy(),
                eProspectLeadDao.getOwner(),
                eProspectLeadDao.getIsDocStatus(),
                eProspectLeadDao.getIdx(),
                eProspectLeadDao.getLead(),
                eProspectLeadDao.getLeadName(),
                eProspectLeadDao.getEmail(),
                eProspectLeadDao.getMobileNo(),
                eProspectLeadDao.getLeadOwner(),
                eProspectLeadDao.getStatus(),
                eProspectLeadDao.getParent(),
                eProspectLeadDao.getParentField(),
                eProspectLeadDao.getParentType());
    }

    public static void fromDTO(ProspectLeadDto vProspectLeadDto, ProspectLeadDao eProspectLeadDao) {
        eProspectLeadDao.setName(vProspectLeadDto.name());
        eProspectLeadDao.setCreation(vProspectLeadDto.creation());
        eProspectLeadDao.setModified(vProspectLeadDto.modified());
        eProspectLeadDao.setModifiedBy(vProspectLeadDto.modifiedBy());
        eProspectLeadDao.setOwner(vProspectLeadDto.owner());
        eProspectLeadDao.setIsDocStatus(vProspectLeadDto.isDocStatus());
        eProspectLeadDao.setIdx(vProspectLeadDto.idx());
        eProspectLeadDao.setLead(vProspectLeadDto.lead());
        eProspectLeadDao.setLeadName(vProspectLeadDto.leadName());
        eProspectLeadDao.setEmail(vProspectLeadDto.email());
        eProspectLeadDao.setMobileNo(vProspectLeadDto.mobileNo());
        eProspectLeadDao.setLeadOwner(vProspectLeadDto.leadOwner());
        eProspectLeadDao.setStatus(vProspectLeadDto.status());
        eProspectLeadDao.setParent(vProspectLeadDto.parent());
        eProspectLeadDao.setParentField(vProspectLeadDto.parentField());
        eProspectLeadDao.setParentType(vProspectLeadDto.parentType());
    }
}