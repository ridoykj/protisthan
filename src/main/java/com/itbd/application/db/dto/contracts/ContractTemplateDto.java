package com.itbd.application.db.dto.contracts;

import com.itbd.application.db.dao.contracts.ContractTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ContractTemplateDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String contractTerms,
        Boolean requiresFulfilment,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ContractTemplateDto fromEntity(ContractTemplateDao eContractTemplateDao) {
        return new ContractTemplateDto(
                eContractTemplateDao.getName(),
                eContractTemplateDao.getCreation(),
                eContractTemplateDao.getModified(),
                eContractTemplateDao.getModifiedBy(),
                eContractTemplateDao.getOwner(),
                eContractTemplateDao.getIsDocStatus(),
                eContractTemplateDao.getIdx(),
                eContractTemplateDao.getTitle(),
                eContractTemplateDao.getContractTerms(),
                eContractTemplateDao.getRequiresFulfilment(),
                eContractTemplateDao.getUserTags(),
                eContractTemplateDao.getComments(),
                eContractTemplateDao.getAssign(),
                eContractTemplateDao.getLikedBy());
    }

    public static void fromDTO(ContractTemplateDto vContractTemplateDto, ContractTemplateDao eContractTemplateDao) {
        eContractTemplateDao.setName(vContractTemplateDto.name());
        eContractTemplateDao.setCreation(vContractTemplateDto.creation());
        eContractTemplateDao.setModified(vContractTemplateDto.modified());
        eContractTemplateDao.setModifiedBy(vContractTemplateDto.modifiedBy());
        eContractTemplateDao.setOwner(vContractTemplateDto.owner());
        eContractTemplateDao.setIsDocStatus(vContractTemplateDto.isDocStatus());
        eContractTemplateDao.setIdx(vContractTemplateDto.idx());
        eContractTemplateDao.setTitle(vContractTemplateDto.title());
        eContractTemplateDao.setContractTerms(vContractTemplateDto.contractTerms());
        eContractTemplateDao.setRequiresFulfilment(vContractTemplateDto.requiresFulfilment());
        eContractTemplateDao.setUserTags(vContractTemplateDto.userTags());
        eContractTemplateDao.setComments(vContractTemplateDto.comments());
        eContractTemplateDao.setAssign(vContractTemplateDto.assign());
        eContractTemplateDao.setLikedBy(vContractTemplateDto.likedBy());
    }
}