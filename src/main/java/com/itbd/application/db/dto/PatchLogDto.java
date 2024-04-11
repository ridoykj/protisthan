package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PatchLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PatchLogDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String patch,
        Boolean skipped,
        String traceback,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PatchLogDto fromEntity(PatchLogDao ePatchLogDao) {
        return new PatchLogDto(
                ePatchLogDao.getName(),
                ePatchLogDao.getCreation(),
                ePatchLogDao.getModified(),
                ePatchLogDao.getModifiedBy(),
                ePatchLogDao.getOwner(),
                ePatchLogDao.getIsDocStatus(),
                ePatchLogDao.getIdx(),
                ePatchLogDao.getPatch(),
                ePatchLogDao.getSkipped(),
                ePatchLogDao.getTraceback(),
                ePatchLogDao.getUserTags(),
                ePatchLogDao.getComments(),
                ePatchLogDao.getAssign(),
                ePatchLogDao.getLikedBy());
    }

    public static void fromDTO(PatchLogDto vPatchLogDto, PatchLogDao ePatchLogDao) {
        ePatchLogDao.setName(vPatchLogDto.name());
        ePatchLogDao.setCreation(vPatchLogDto.creation());
        ePatchLogDao.setModified(vPatchLogDto.modified());
        ePatchLogDao.setModifiedBy(vPatchLogDto.modifiedBy());
        ePatchLogDao.setOwner(vPatchLogDto.owner());
        ePatchLogDao.setIsDocStatus(vPatchLogDto.isDocStatus());
        ePatchLogDao.setIdx(vPatchLogDto.idx());
        ePatchLogDao.setPatch(vPatchLogDto.patch());
        ePatchLogDao.setSkipped(vPatchLogDto.skipped());
        ePatchLogDao.setTraceback(vPatchLogDto.traceback());
        ePatchLogDao.setUserTags(vPatchLogDto.userTags());
        ePatchLogDao.setComments(vPatchLogDto.comments());
        ePatchLogDao.setAssign(vPatchLogDto.assign());
        ePatchLogDao.setLikedBy(vPatchLogDto.likedBy());
    }
}