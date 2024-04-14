package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityInspectionParameterGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityInspectionParameterGroupDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String groupName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityInspectionParameterGroupDto fromEntity(QualityInspectionParameterGroupDao eQualityInspectionParameterGroupDao) {
        return new QualityInspectionParameterGroupDto(
                eQualityInspectionParameterGroupDao.getName(),
                eQualityInspectionParameterGroupDao.getCreation(),
                eQualityInspectionParameterGroupDao.getModified(),
                eQualityInspectionParameterGroupDao.getModifiedBy(),
                eQualityInspectionParameterGroupDao.getOwner(),
                eQualityInspectionParameterGroupDao.getIsDocStatus(),
                eQualityInspectionParameterGroupDao.getIdx(),
                eQualityInspectionParameterGroupDao.getGroupName(),
                eQualityInspectionParameterGroupDao.getUserTags(),
                eQualityInspectionParameterGroupDao.getComments(),
                eQualityInspectionParameterGroupDao.getAssign(),
                eQualityInspectionParameterGroupDao.getLikedBy());
    }

    public static void fromDTO(QualityInspectionParameterGroupDto vQualityInspectionParameterGroupDto, QualityInspectionParameterGroupDao eQualityInspectionParameterGroupDao) {
        eQualityInspectionParameterGroupDao.setName(vQualityInspectionParameterGroupDto.name());
        eQualityInspectionParameterGroupDao.setCreation(vQualityInspectionParameterGroupDto.creation());
        eQualityInspectionParameterGroupDao.setModified(vQualityInspectionParameterGroupDto.modified());
        eQualityInspectionParameterGroupDao.setModifiedBy(vQualityInspectionParameterGroupDto.modifiedBy());
        eQualityInspectionParameterGroupDao.setOwner(vQualityInspectionParameterGroupDto.owner());
        eQualityInspectionParameterGroupDao.setIsDocStatus(vQualityInspectionParameterGroupDto.isDocStatus());
        eQualityInspectionParameterGroupDao.setIdx(vQualityInspectionParameterGroupDto.idx());
        eQualityInspectionParameterGroupDao.setGroupName(vQualityInspectionParameterGroupDto.groupName());
        eQualityInspectionParameterGroupDao.setUserTags(vQualityInspectionParameterGroupDto.userTags());
        eQualityInspectionParameterGroupDao.setComments(vQualityInspectionParameterGroupDto.comments());
        eQualityInspectionParameterGroupDao.setAssign(vQualityInspectionParameterGroupDto.assign());
        eQualityInspectionParameterGroupDao.setLikedBy(vQualityInspectionParameterGroupDto.likedBy());
    }
}