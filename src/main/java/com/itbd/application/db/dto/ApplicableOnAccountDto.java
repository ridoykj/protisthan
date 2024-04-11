package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ApplicableOnAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ApplicableOnAccountDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String applicableOnAccount,
        Boolean isMandatory,
        String parent,
        String parentField,
        String parentType
) {
    public static ApplicableOnAccountDto fromEntity(ApplicableOnAccountDao eApplicableOnAccountDao) {
        return new ApplicableOnAccountDto(
                eApplicableOnAccountDao.getName(),
                eApplicableOnAccountDao.getCreation(),
                eApplicableOnAccountDao.getModified(),
                eApplicableOnAccountDao.getModifiedBy(),
                eApplicableOnAccountDao.getOwner(),
                eApplicableOnAccountDao.getIsDocStatus(),
                eApplicableOnAccountDao.getIdx(),
                eApplicableOnAccountDao.getApplicableOnAccount(),
                eApplicableOnAccountDao.getIsMandatory(),
                eApplicableOnAccountDao.getParent(),
                eApplicableOnAccountDao.getParentField(),
                eApplicableOnAccountDao.getParentType());
    }

    public static void fromDTO(ApplicableOnAccountDto vApplicableOnAccountDto, ApplicableOnAccountDao eApplicableOnAccountDao) {
        eApplicableOnAccountDao.setName(vApplicableOnAccountDto.name());
        eApplicableOnAccountDao.setCreation(vApplicableOnAccountDto.creation());
        eApplicableOnAccountDao.setModified(vApplicableOnAccountDto.modified());
        eApplicableOnAccountDao.setModifiedBy(vApplicableOnAccountDto.modifiedBy());
        eApplicableOnAccountDao.setOwner(vApplicableOnAccountDto.owner());
        eApplicableOnAccountDao.setIsDocStatus(vApplicableOnAccountDto.isDocStatus());
        eApplicableOnAccountDao.setIdx(vApplicableOnAccountDto.idx());
        eApplicableOnAccountDao.setApplicableOnAccount(vApplicableOnAccountDto.applicableOnAccount());
        eApplicableOnAccountDao.setIsMandatory(vApplicableOnAccountDto.isMandatory());
        eApplicableOnAccountDao.setParent(vApplicableOnAccountDto.parent());
        eApplicableOnAccountDao.setParentField(vApplicableOnAccountDto.parentField());
        eApplicableOnAccountDao.setParentType(vApplicableOnAccountDto.parentType());
    }
}