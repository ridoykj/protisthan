package com.itbd.application.db.dto.contracts;

import com.itbd.application.db.dao.contracts.ContractFulfilmentChecklistDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ContractFulfilmentChecklistDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean fulfilled,
        String requirement,
        String notes,
        String amendedFrom,
        String parent,
        String parentField,
        String parentType
) {
    public static ContractFulfilmentChecklistDto fromEntity(ContractFulfilmentChecklistDao eContractFulfilmentChecklistDao) {
        return new ContractFulfilmentChecklistDto(
                eContractFulfilmentChecklistDao.getName(),
                eContractFulfilmentChecklistDao.getCreation(),
                eContractFulfilmentChecklistDao.getModified(),
                eContractFulfilmentChecklistDao.getModifiedBy(),
                eContractFulfilmentChecklistDao.getOwner(),
                eContractFulfilmentChecklistDao.getIsDocStatus(),
                eContractFulfilmentChecklistDao.getIdx(),
                eContractFulfilmentChecklistDao.getFulfilled(),
                eContractFulfilmentChecklistDao.getRequirement(),
                eContractFulfilmentChecklistDao.getNotes(),
                eContractFulfilmentChecklistDao.getAmendedFrom(),
                eContractFulfilmentChecklistDao.getParent(),
                eContractFulfilmentChecklistDao.getParentField(),
                eContractFulfilmentChecklistDao.getParentType());
    }

    public static void fromDTO(ContractFulfilmentChecklistDto vContractFulfilmentChecklistDto, ContractFulfilmentChecklistDao eContractFulfilmentChecklistDao) {
        eContractFulfilmentChecklistDao.setName(vContractFulfilmentChecklistDto.name());
        eContractFulfilmentChecklistDao.setCreation(vContractFulfilmentChecklistDto.creation());
        eContractFulfilmentChecklistDao.setModified(vContractFulfilmentChecklistDto.modified());
        eContractFulfilmentChecklistDao.setModifiedBy(vContractFulfilmentChecklistDto.modifiedBy());
        eContractFulfilmentChecklistDao.setOwner(vContractFulfilmentChecklistDto.owner());
        eContractFulfilmentChecklistDao.setIsDocStatus(vContractFulfilmentChecklistDto.isDocStatus());
        eContractFulfilmentChecklistDao.setIdx(vContractFulfilmentChecklistDto.idx());
        eContractFulfilmentChecklistDao.setFulfilled(vContractFulfilmentChecklistDto.fulfilled());
        eContractFulfilmentChecklistDao.setRequirement(vContractFulfilmentChecklistDto.requirement());
        eContractFulfilmentChecklistDao.setNotes(vContractFulfilmentChecklistDto.notes());
        eContractFulfilmentChecklistDao.setAmendedFrom(vContractFulfilmentChecklistDto.amendedFrom());
        eContractFulfilmentChecklistDao.setParent(vContractFulfilmentChecklistDto.parent());
        eContractFulfilmentChecklistDao.setParentField(vContractFulfilmentChecklistDto.parentField());
        eContractFulfilmentChecklistDao.setParentType(vContractFulfilmentChecklistDto.parentType());
    }
}