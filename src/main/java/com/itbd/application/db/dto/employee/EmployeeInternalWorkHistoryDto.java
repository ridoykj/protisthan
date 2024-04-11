package com.itbd.application.db.dto.employee;

import com.itbd.application.db.dao.employee.EmployeeInternalWorkHistoryDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record EmployeeInternalWorkHistoryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String branch,
        String department,
        String designation,
        LocalDate fromDate,
        LocalDate toDate,
        String parent,
        String parentField,
        String parentType
) {
    public static EmployeeInternalWorkHistoryDto fromEntity(EmployeeInternalWorkHistoryDao eEmployeeInternalWorkHistoryDao) {
        return new EmployeeInternalWorkHistoryDto(
                eEmployeeInternalWorkHistoryDao.getName(),
                eEmployeeInternalWorkHistoryDao.getCreation(),
                eEmployeeInternalWorkHistoryDao.getModified(),
                eEmployeeInternalWorkHistoryDao.getModifiedBy(),
                eEmployeeInternalWorkHistoryDao.getOwner(),
                eEmployeeInternalWorkHistoryDao.getIsDocStatus(),
                eEmployeeInternalWorkHistoryDao.getIdx(),
                eEmployeeInternalWorkHistoryDao.getBranch(),
                eEmployeeInternalWorkHistoryDao.getDepartment(),
                eEmployeeInternalWorkHistoryDao.getDesignation(),
                eEmployeeInternalWorkHistoryDao.getFromDate(),
                eEmployeeInternalWorkHistoryDao.getToDate(),
                eEmployeeInternalWorkHistoryDao.getParent(),
                eEmployeeInternalWorkHistoryDao.getParentField(),
                eEmployeeInternalWorkHistoryDao.getParentType());
    }

    public static void fromDTO(EmployeeInternalWorkHistoryDto vEmployeeInternalWorkHistoryDto, EmployeeInternalWorkHistoryDao eEmployeeInternalWorkHistoryDao) {
        eEmployeeInternalWorkHistoryDao.setName(vEmployeeInternalWorkHistoryDto.name());
        eEmployeeInternalWorkHistoryDao.setCreation(vEmployeeInternalWorkHistoryDto.creation());
        eEmployeeInternalWorkHistoryDao.setModified(vEmployeeInternalWorkHistoryDto.modified());
        eEmployeeInternalWorkHistoryDao.setModifiedBy(vEmployeeInternalWorkHistoryDto.modifiedBy());
        eEmployeeInternalWorkHistoryDao.setOwner(vEmployeeInternalWorkHistoryDto.owner());
        eEmployeeInternalWorkHistoryDao.setIsDocStatus(vEmployeeInternalWorkHistoryDto.isDocStatus());
        eEmployeeInternalWorkHistoryDao.setIdx(vEmployeeInternalWorkHistoryDto.idx());
        eEmployeeInternalWorkHistoryDao.setBranch(vEmployeeInternalWorkHistoryDto.branch());
        eEmployeeInternalWorkHistoryDao.setDepartment(vEmployeeInternalWorkHistoryDto.department());
        eEmployeeInternalWorkHistoryDao.setDesignation(vEmployeeInternalWorkHistoryDto.designation());
        eEmployeeInternalWorkHistoryDao.setFromDate(vEmployeeInternalWorkHistoryDto.fromDate());
        eEmployeeInternalWorkHistoryDao.setToDate(vEmployeeInternalWorkHistoryDto.toDate());
        eEmployeeInternalWorkHistoryDao.setParent(vEmployeeInternalWorkHistoryDto.parent());
        eEmployeeInternalWorkHistoryDao.setParentField(vEmployeeInternalWorkHistoryDto.parentField());
        eEmployeeInternalWorkHistoryDao.setParentType(vEmployeeInternalWorkHistoryDto.parentType());
    }
}