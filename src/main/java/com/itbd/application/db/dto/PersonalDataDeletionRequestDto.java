package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PersonalDataDeletionRequestDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PersonalDataDeletionRequestDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String email,
        String status,
        String anonymizationMatrix,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PersonalDataDeletionRequestDto fromEntity(PersonalDataDeletionRequestDao ePersonalDataDeletionRequestDao) {
        return new PersonalDataDeletionRequestDto(
                ePersonalDataDeletionRequestDao.getName(),
                ePersonalDataDeletionRequestDao.getCreation(),
                ePersonalDataDeletionRequestDao.getModified(),
                ePersonalDataDeletionRequestDao.getModifiedBy(),
                ePersonalDataDeletionRequestDao.getOwner(),
                ePersonalDataDeletionRequestDao.getIsDocStatus(),
                ePersonalDataDeletionRequestDao.getIdx(),
                ePersonalDataDeletionRequestDao.getEmail(),
                ePersonalDataDeletionRequestDao.getStatus(),
                ePersonalDataDeletionRequestDao.getAnonymizationMatrix(),
                ePersonalDataDeletionRequestDao.getUserTags(),
                ePersonalDataDeletionRequestDao.getComments(),
                ePersonalDataDeletionRequestDao.getAssign(),
                ePersonalDataDeletionRequestDao.getLikedBy());
    }

    public static void fromDTO(PersonalDataDeletionRequestDto vPersonalDataDeletionRequestDto, PersonalDataDeletionRequestDao ePersonalDataDeletionRequestDao) {
        ePersonalDataDeletionRequestDao.setName(vPersonalDataDeletionRequestDto.name());
        ePersonalDataDeletionRequestDao.setCreation(vPersonalDataDeletionRequestDto.creation());
        ePersonalDataDeletionRequestDao.setModified(vPersonalDataDeletionRequestDto.modified());
        ePersonalDataDeletionRequestDao.setModifiedBy(vPersonalDataDeletionRequestDto.modifiedBy());
        ePersonalDataDeletionRequestDao.setOwner(vPersonalDataDeletionRequestDto.owner());
        ePersonalDataDeletionRequestDao.setIsDocStatus(vPersonalDataDeletionRequestDto.isDocStatus());
        ePersonalDataDeletionRequestDao.setIdx(vPersonalDataDeletionRequestDto.idx());
        ePersonalDataDeletionRequestDao.setEmail(vPersonalDataDeletionRequestDto.email());
        ePersonalDataDeletionRequestDao.setStatus(vPersonalDataDeletionRequestDto.status());
        ePersonalDataDeletionRequestDao.setAnonymizationMatrix(vPersonalDataDeletionRequestDto.anonymizationMatrix());
        ePersonalDataDeletionRequestDao.setUserTags(vPersonalDataDeletionRequestDto.userTags());
        ePersonalDataDeletionRequestDao.setComments(vPersonalDataDeletionRequestDto.comments());
        ePersonalDataDeletionRequestDao.setAssign(vPersonalDataDeletionRequestDto.assign());
        ePersonalDataDeletionRequestDao.setLikedBy(vPersonalDataDeletionRequestDto.likedBy());
    }
}