package com.itbd.application.db.dto;

import com.itbd.application.db.dao.website.personal_data.PersonalDataDeletionStepDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PersonalDataDeletionStepDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String status,
        Boolean partial,
        String fields,
        String filteredBy,
        String parent,
        String parentField,
        String parentType
) {
    public static PersonalDataDeletionStepDto fromEntity(PersonalDataDeletionStepDao ePersonalDataDeletionStepDao) {
        return new PersonalDataDeletionStepDto(
                ePersonalDataDeletionStepDao.getName(),
                ePersonalDataDeletionStepDao.getCreation(),
                ePersonalDataDeletionStepDao.getModified(),
                ePersonalDataDeletionStepDao.getModifiedBy(),
                ePersonalDataDeletionStepDao.getOwner(),
                ePersonalDataDeletionStepDao.getIsDocStatus(),
                ePersonalDataDeletionStepDao.getIdx(),
                ePersonalDataDeletionStepDao.getDocumentType(),
                ePersonalDataDeletionStepDao.getStatus(),
                ePersonalDataDeletionStepDao.getPartial(),
                ePersonalDataDeletionStepDao.getFields(),
                ePersonalDataDeletionStepDao.getFilteredBy(),
                ePersonalDataDeletionStepDao.getParent(),
                ePersonalDataDeletionStepDao.getParentField(),
                ePersonalDataDeletionStepDao.getParentType());
    }

    public static void fromDTO(PersonalDataDeletionStepDto vPersonalDataDeletionStepDto, PersonalDataDeletionStepDao ePersonalDataDeletionStepDao) {
        ePersonalDataDeletionStepDao.setName(vPersonalDataDeletionStepDto.name());
        ePersonalDataDeletionStepDao.setCreation(vPersonalDataDeletionStepDto.creation());
        ePersonalDataDeletionStepDao.setModified(vPersonalDataDeletionStepDto.modified());
        ePersonalDataDeletionStepDao.setModifiedBy(vPersonalDataDeletionStepDto.modifiedBy());
        ePersonalDataDeletionStepDao.setOwner(vPersonalDataDeletionStepDto.owner());
        ePersonalDataDeletionStepDao.setIsDocStatus(vPersonalDataDeletionStepDto.isDocStatus());
        ePersonalDataDeletionStepDao.setIdx(vPersonalDataDeletionStepDto.idx());
        ePersonalDataDeletionStepDao.setDocumentType(vPersonalDataDeletionStepDto.documentType());
        ePersonalDataDeletionStepDao.setStatus(vPersonalDataDeletionStepDto.status());
        ePersonalDataDeletionStepDao.setPartial(vPersonalDataDeletionStepDto.partial());
        ePersonalDataDeletionStepDao.setFields(vPersonalDataDeletionStepDto.fields());
        ePersonalDataDeletionStepDao.setFilteredBy(vPersonalDataDeletionStepDto.filteredBy());
        ePersonalDataDeletionStepDao.setParent(vPersonalDataDeletionStepDto.parent());
        ePersonalDataDeletionStepDao.setParentField(vPersonalDataDeletionStepDto.parentField());
        ePersonalDataDeletionStepDao.setParentType(vPersonalDataDeletionStepDto.parentType());
    }
}