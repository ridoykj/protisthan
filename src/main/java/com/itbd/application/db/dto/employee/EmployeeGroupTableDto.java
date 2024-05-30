package com.itbd.application.db.dto.employee;

import com.itbd.application.db.dao.setup.employee.EmployeeGroupTableDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmployeeGroupTableDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String employee,
        String employeeName,
        String userId,
        String parent,
        String parentField,
        String parentType
) {
    public static EmployeeGroupTableDto fromEntity(EmployeeGroupTableDao eEmployeeGroupTableDao) {
        return new EmployeeGroupTableDto(
                eEmployeeGroupTableDao.getName(),
                eEmployeeGroupTableDao.getCreation(),
                eEmployeeGroupTableDao.getModified(),
                eEmployeeGroupTableDao.getModifiedBy(),
                eEmployeeGroupTableDao.getOwner(),
                eEmployeeGroupTableDao.getIsDocStatus(),
                eEmployeeGroupTableDao.getIdx(),
                eEmployeeGroupTableDao.getEmployee(),
                eEmployeeGroupTableDao.getEmployeeName(),
                eEmployeeGroupTableDao.getUserId(),
                eEmployeeGroupTableDao.getParent(),
                eEmployeeGroupTableDao.getParentField(),
                eEmployeeGroupTableDao.getParentType());
    }

    public static void fromDTO(EmployeeGroupTableDto vEmployeeGroupTableDto, EmployeeGroupTableDao eEmployeeGroupTableDao) {
        eEmployeeGroupTableDao.setName(vEmployeeGroupTableDto.name());
        eEmployeeGroupTableDao.setCreation(vEmployeeGroupTableDto.creation());
        eEmployeeGroupTableDao.setModified(vEmployeeGroupTableDto.modified());
        eEmployeeGroupTableDao.setModifiedBy(vEmployeeGroupTableDto.modifiedBy());
        eEmployeeGroupTableDao.setOwner(vEmployeeGroupTableDto.owner());
        eEmployeeGroupTableDao.setIsDocStatus(vEmployeeGroupTableDto.isDocStatus());
        eEmployeeGroupTableDao.setIdx(vEmployeeGroupTableDto.idx());
        eEmployeeGroupTableDao.setEmployee(vEmployeeGroupTableDto.employee());
        eEmployeeGroupTableDao.setEmployeeName(vEmployeeGroupTableDto.employeeName());
        eEmployeeGroupTableDao.setUserId(vEmployeeGroupTableDto.userId());
        eEmployeeGroupTableDao.setParent(vEmployeeGroupTableDto.parent());
        eEmployeeGroupTableDao.setParentField(vEmployeeGroupTableDto.parentField());
        eEmployeeGroupTableDao.setParentType(vEmployeeGroupTableDto.parentType());
    }
}