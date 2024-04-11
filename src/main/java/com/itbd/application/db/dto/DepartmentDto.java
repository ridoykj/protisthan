package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DepartmentDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DepartmentDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String departmentName,
        String parentDepartment,
        String company,
        Boolean isGroup,
        Boolean disabled,
        Integer lft,
        Integer rgt,
        String oldParent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DepartmentDto fromEntity(DepartmentDao eDepartmentDao) {
        return new DepartmentDto(
                eDepartmentDao.getName(),
                eDepartmentDao.getCreation(),
                eDepartmentDao.getModified(),
                eDepartmentDao.getModifiedBy(),
                eDepartmentDao.getOwner(),
                eDepartmentDao.getIsDocStatus(),
                eDepartmentDao.getIdx(),
                eDepartmentDao.getDepartmentName(),
                eDepartmentDao.getParentDepartment(),
                eDepartmentDao.getCompany(),
                eDepartmentDao.getIsGroup(),
                eDepartmentDao.getDisabled(),
                eDepartmentDao.getLft(),
                eDepartmentDao.getRgt(),
                eDepartmentDao.getOldParent(),
                eDepartmentDao.getUserTags(),
                eDepartmentDao.getComments(),
                eDepartmentDao.getAssign(),
                eDepartmentDao.getLikedBy());
    }

    public static void fromDTO(DepartmentDto vDepartmentDto, DepartmentDao eDepartmentDao) {
        eDepartmentDao.setName(vDepartmentDto.name());
        eDepartmentDao.setCreation(vDepartmentDto.creation());
        eDepartmentDao.setModified(vDepartmentDto.modified());
        eDepartmentDao.setModifiedBy(vDepartmentDto.modifiedBy());
        eDepartmentDao.setOwner(vDepartmentDto.owner());
        eDepartmentDao.setIsDocStatus(vDepartmentDto.isDocStatus());
        eDepartmentDao.setIdx(vDepartmentDto.idx());
        eDepartmentDao.setDepartmentName(vDepartmentDto.departmentName());
        eDepartmentDao.setParentDepartment(vDepartmentDto.parentDepartment());
        eDepartmentDao.setCompany(vDepartmentDto.company());
        eDepartmentDao.setIsGroup(vDepartmentDto.isGroup());
        eDepartmentDao.setDisabled(vDepartmentDto.disabled());
        eDepartmentDao.setLft(vDepartmentDto.lft());
        eDepartmentDao.setRgt(vDepartmentDto.rgt());
        eDepartmentDao.setOldParent(vDepartmentDto.oldParent());
        eDepartmentDao.setUserTags(vDepartmentDto.userTags());
        eDepartmentDao.setComments(vDepartmentDto.comments());
        eDepartmentDao.setAssign(vDepartmentDto.assign());
        eDepartmentDao.setLikedBy(vDepartmentDto.likedBy());
    }
}