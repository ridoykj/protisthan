package com.itbd.application.db.dto.shares;

import com.itbd.application.db.dao.accounts.ShareholderDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ShareholderDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String namingSeries,
        String folioNo,
        String company,
        Boolean isCompany,
        String contactList,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ShareholderDto fromEntity(ShareholderDao eShareholderDao) {
        return new ShareholderDto(
                eShareholderDao.getName(),
                eShareholderDao.getCreation(),
                eShareholderDao.getModified(),
                eShareholderDao.getModifiedBy(),
                eShareholderDao.getOwner(),
                eShareholderDao.getIsDocStatus(),
                eShareholderDao.getIdx(),
                eShareholderDao.getTitle(),
                eShareholderDao.getNamingSeries(),
                eShareholderDao.getFolioNo(),
                eShareholderDao.getCompany(),
                eShareholderDao.getIsCompany(),
                eShareholderDao.getContactList(),
                eShareholderDao.getUserTags(),
                eShareholderDao.getComments(),
                eShareholderDao.getAssign(),
                eShareholderDao.getLikedBy());
    }

    public static void fromDTO(ShareholderDto vShareholderDto, ShareholderDao eShareholderDao) {
        eShareholderDao.setName(vShareholderDto.name());
        eShareholderDao.setCreation(vShareholderDto.creation());
        eShareholderDao.setModified(vShareholderDto.modified());
        eShareholderDao.setModifiedBy(vShareholderDto.modifiedBy());
        eShareholderDao.setOwner(vShareholderDto.owner());
        eShareholderDao.setIsDocStatus(vShareholderDto.isDocStatus());
        eShareholderDao.setIdx(vShareholderDto.idx());
        eShareholderDao.setTitle(vShareholderDto.title());
        eShareholderDao.setNamingSeries(vShareholderDto.namingSeries());
        eShareholderDao.setFolioNo(vShareholderDto.folioNo());
        eShareholderDao.setCompany(vShareholderDto.company());
        eShareholderDao.setIsCompany(vShareholderDto.isCompany());
        eShareholderDao.setContactList(vShareholderDto.contactList());
        eShareholderDao.setUserTags(vShareholderDto.userTags());
        eShareholderDao.setComments(vShareholderDto.comments());
        eShareholderDao.setAssign(vShareholderDto.assign());
        eShareholderDao.setLikedBy(vShareholderDto.likedBy());
    }
}