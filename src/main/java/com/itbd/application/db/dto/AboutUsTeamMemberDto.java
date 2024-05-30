package com.itbd.application.db.dto;

import com.itbd.application.db.dao.website.AboutUsTeamMemberDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AboutUsTeamMemberDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String fullName,
        String imageLink,
        String bio,
        String parent,
        String parentField,
        String parentType
) {
    public static AboutUsTeamMemberDto fromEntity(AboutUsTeamMemberDao eAboutUsTeamMemberDao) {
        return new AboutUsTeamMemberDto(
                eAboutUsTeamMemberDao.getName(),
                eAboutUsTeamMemberDao.getCreation(),
                eAboutUsTeamMemberDao.getModified(),
                eAboutUsTeamMemberDao.getModifiedBy(),
                eAboutUsTeamMemberDao.getOwner(),
                eAboutUsTeamMemberDao.getIsDocStatus(),
                eAboutUsTeamMemberDao.getIdx(),
                eAboutUsTeamMemberDao.getFullName(),
                eAboutUsTeamMemberDao.getImageLink(),
                eAboutUsTeamMemberDao.getBio(),
                eAboutUsTeamMemberDao.getParent(),
                eAboutUsTeamMemberDao.getParentField(),
                eAboutUsTeamMemberDao.getParentType());
    }

    public static void fromDTO(AboutUsTeamMemberDto vAboutUsTeamMemberDto, AboutUsTeamMemberDao eAboutUsTeamMemberDao) {
        eAboutUsTeamMemberDao.setName(vAboutUsTeamMemberDto.name());
        eAboutUsTeamMemberDao.setCreation(vAboutUsTeamMemberDto.creation());
        eAboutUsTeamMemberDao.setModified(vAboutUsTeamMemberDto.modified());
        eAboutUsTeamMemberDao.setModifiedBy(vAboutUsTeamMemberDto.modifiedBy());
        eAboutUsTeamMemberDao.setOwner(vAboutUsTeamMemberDto.owner());
        eAboutUsTeamMemberDao.setIsDocStatus(vAboutUsTeamMemberDto.isDocStatus());
        eAboutUsTeamMemberDao.setIdx(vAboutUsTeamMemberDto.idx());
        eAboutUsTeamMemberDao.setFullName(vAboutUsTeamMemberDto.fullName());
        eAboutUsTeamMemberDao.setImageLink(vAboutUsTeamMemberDto.imageLink());
        eAboutUsTeamMemberDao.setBio(vAboutUsTeamMemberDto.bio());
        eAboutUsTeamMemberDao.setParent(vAboutUsTeamMemberDto.parent());
        eAboutUsTeamMemberDao.setParentField(vAboutUsTeamMemberDto.parentField());
        eAboutUsTeamMemberDao.setParentType(vAboutUsTeamMemberDto.parentType());
    }
}