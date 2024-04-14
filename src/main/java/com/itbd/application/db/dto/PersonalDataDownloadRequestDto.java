package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PersonalDataDownloadRequestDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PersonalDataDownloadRequestDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        String userName,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PersonalDataDownloadRequestDto fromEntity(PersonalDataDownloadRequestDao ePersonalDataDownloadRequestDao) {
        return new PersonalDataDownloadRequestDto(
                ePersonalDataDownloadRequestDao.getName(),
                ePersonalDataDownloadRequestDao.getCreation(),
                ePersonalDataDownloadRequestDao.getModified(),
                ePersonalDataDownloadRequestDao.getModifiedBy(),
                ePersonalDataDownloadRequestDao.getOwner(),
                ePersonalDataDownloadRequestDao.getIsDocStatus(),
                ePersonalDataDownloadRequestDao.getIdx(),
                ePersonalDataDownloadRequestDao.getUser(),
                ePersonalDataDownloadRequestDao.getUserName(),
                ePersonalDataDownloadRequestDao.getAmendedFrom(),
                ePersonalDataDownloadRequestDao.getUserTags(),
                ePersonalDataDownloadRequestDao.getComments(),
                ePersonalDataDownloadRequestDao.getAssign(),
                ePersonalDataDownloadRequestDao.getLikedBy());
    }

    public static void fromDTO(PersonalDataDownloadRequestDto vPersonalDataDownloadRequestDto, PersonalDataDownloadRequestDao ePersonalDataDownloadRequestDao) {
        ePersonalDataDownloadRequestDao.setName(vPersonalDataDownloadRequestDto.name());
        ePersonalDataDownloadRequestDao.setCreation(vPersonalDataDownloadRequestDto.creation());
        ePersonalDataDownloadRequestDao.setModified(vPersonalDataDownloadRequestDto.modified());
        ePersonalDataDownloadRequestDao.setModifiedBy(vPersonalDataDownloadRequestDto.modifiedBy());
        ePersonalDataDownloadRequestDao.setOwner(vPersonalDataDownloadRequestDto.owner());
        ePersonalDataDownloadRequestDao.setIsDocStatus(vPersonalDataDownloadRequestDto.isDocStatus());
        ePersonalDataDownloadRequestDao.setIdx(vPersonalDataDownloadRequestDto.idx());
        ePersonalDataDownloadRequestDao.setUser(vPersonalDataDownloadRequestDto.user());
        ePersonalDataDownloadRequestDao.setUserName(vPersonalDataDownloadRequestDto.userName());
        ePersonalDataDownloadRequestDao.setAmendedFrom(vPersonalDataDownloadRequestDto.amendedFrom());
        ePersonalDataDownloadRequestDao.setUserTags(vPersonalDataDownloadRequestDto.userTags());
        ePersonalDataDownloadRequestDao.setComments(vPersonalDataDownloadRequestDto.comments());
        ePersonalDataDownloadRequestDao.setAssign(vPersonalDataDownloadRequestDto.assign());
        ePersonalDataDownloadRequestDao.setLikedBy(vPersonalDataDownloadRequestDto.likedBy());
    }
}