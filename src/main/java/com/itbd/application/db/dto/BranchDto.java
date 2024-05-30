package com.itbd.application.db.dto;

import com.itbd.application.db.dao.setup.BranchDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BranchDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String branch,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BranchDto fromEntity(BranchDao eBranchDao) {
        return new BranchDto(
                eBranchDao.getName(),
                eBranchDao.getCreation(),
                eBranchDao.getModified(),
                eBranchDao.getModifiedBy(),
                eBranchDao.getOwner(),
                eBranchDao.getIsDocStatus(),
                eBranchDao.getIdx(),
                eBranchDao.getBranch(),
                eBranchDao.getUserTags(),
                eBranchDao.getComments(),
                eBranchDao.getAssign(),
                eBranchDao.getLikedBy());
    }

    public static void fromDTO(BranchDto vBranchDto, BranchDao eBranchDao) {
        eBranchDao.setName(vBranchDto.name());
        eBranchDao.setCreation(vBranchDto.creation());
        eBranchDao.setModified(vBranchDto.modified());
        eBranchDao.setModifiedBy(vBranchDto.modifiedBy());
        eBranchDao.setOwner(vBranchDto.owner());
        eBranchDao.setIsDocStatus(vBranchDto.isDocStatus());
        eBranchDao.setIdx(vBranchDto.idx());
        eBranchDao.setBranch(vBranchDto.branch());
        eBranchDao.setUserTags(vBranchDto.userTags());
        eBranchDao.setComments(vBranchDto.comments());
        eBranchDao.setAssign(vBranchDto.assign());
        eBranchDao.setLikedBy(vBranchDto.likedBy());
    }
}