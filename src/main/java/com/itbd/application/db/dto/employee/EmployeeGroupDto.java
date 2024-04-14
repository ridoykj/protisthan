package com.itbd.application.db.dto.employee;

import com.itbd.application.db.dao.employee.EmployeeGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmployeeGroupDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String employeeGroupName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmployeeGroupDto fromEntity(EmployeeGroupDao eEmployeeGroupDao) {
        return new EmployeeGroupDto(
                eEmployeeGroupDao.getName(),
                eEmployeeGroupDao.getCreation(),
                eEmployeeGroupDao.getModified(),
                eEmployeeGroupDao.getModifiedBy(),
                eEmployeeGroupDao.getOwner(),
                eEmployeeGroupDao.getIsDocStatus(),
                eEmployeeGroupDao.getIdx(),
                eEmployeeGroupDao.getEmployeeGroupName(),
                eEmployeeGroupDao.getUserTags(),
                eEmployeeGroupDao.getComments(),
                eEmployeeGroupDao.getAssign(),
                eEmployeeGroupDao.getLikedBy());
    }

    public static void fromDTO(EmployeeGroupDto vEmployeeGroupDto, EmployeeGroupDao eEmployeeGroupDao) {
        eEmployeeGroupDao.setName(vEmployeeGroupDto.name());
        eEmployeeGroupDao.setCreation(vEmployeeGroupDto.creation());
        eEmployeeGroupDao.setModified(vEmployeeGroupDto.modified());
        eEmployeeGroupDao.setModifiedBy(vEmployeeGroupDto.modifiedBy());
        eEmployeeGroupDao.setOwner(vEmployeeGroupDto.owner());
        eEmployeeGroupDao.setIsDocStatus(vEmployeeGroupDto.isDocStatus());
        eEmployeeGroupDao.setIdx(vEmployeeGroupDto.idx());
        eEmployeeGroupDao.setEmployeeGroupName(vEmployeeGroupDto.employeeGroupName());
        eEmployeeGroupDao.setUserTags(vEmployeeGroupDto.userTags());
        eEmployeeGroupDao.setComments(vEmployeeGroupDto.comments());
        eEmployeeGroupDao.setAssign(vEmployeeGroupDto.assign());
        eEmployeeGroupDao.setLikedBy(vEmployeeGroupDto.likedBy());
    }
}