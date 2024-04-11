package com.itbd.application.db.dto.contracts;

import com.itbd.application.db.dao.contracts.ContractTemplateFulfilmentTermsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ContractTemplateFulfilmentTermsDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String requirement,
        String parent,
        String parentField,
        String parentType
) {
    public static ContractTemplateFulfilmentTermsDto fromEntity(ContractTemplateFulfilmentTermsDao eContractTemplateFulfilmentTermsDao) {
        return new ContractTemplateFulfilmentTermsDto(
                eContractTemplateFulfilmentTermsDao.getName(),
                eContractTemplateFulfilmentTermsDao.getCreation(),
                eContractTemplateFulfilmentTermsDao.getModified(),
                eContractTemplateFulfilmentTermsDao.getModifiedBy(),
                eContractTemplateFulfilmentTermsDao.getOwner(),
                eContractTemplateFulfilmentTermsDao.getIsDocStatus(),
                eContractTemplateFulfilmentTermsDao.getIdx(),
                eContractTemplateFulfilmentTermsDao.getRequirement(),
                eContractTemplateFulfilmentTermsDao.getParent(),
                eContractTemplateFulfilmentTermsDao.getParentField(),
                eContractTemplateFulfilmentTermsDao.getParentType());
    }

    public static void fromDTO(ContractTemplateFulfilmentTermsDto vContractTemplateFulfilmentTermsDto, ContractTemplateFulfilmentTermsDao eContractTemplateFulfilmentTermsDao) {
        eContractTemplateFulfilmentTermsDao.setName(vContractTemplateFulfilmentTermsDto.name());
        eContractTemplateFulfilmentTermsDao.setCreation(vContractTemplateFulfilmentTermsDto.creation());
        eContractTemplateFulfilmentTermsDao.setModified(vContractTemplateFulfilmentTermsDto.modified());
        eContractTemplateFulfilmentTermsDao.setModifiedBy(vContractTemplateFulfilmentTermsDto.modifiedBy());
        eContractTemplateFulfilmentTermsDao.setOwner(vContractTemplateFulfilmentTermsDto.owner());
        eContractTemplateFulfilmentTermsDao.setIsDocStatus(vContractTemplateFulfilmentTermsDto.isDocStatus());
        eContractTemplateFulfilmentTermsDao.setIdx(vContractTemplateFulfilmentTermsDto.idx());
        eContractTemplateFulfilmentTermsDao.setRequirement(vContractTemplateFulfilmentTermsDto.requirement());
        eContractTemplateFulfilmentTermsDao.setParent(vContractTemplateFulfilmentTermsDto.parent());
        eContractTemplateFulfilmentTermsDao.setParentField(vContractTemplateFulfilmentTermsDto.parentField());
        eContractTemplateFulfilmentTermsDao.setParentType(vContractTemplateFulfilmentTermsDto.parentType());
    }
}