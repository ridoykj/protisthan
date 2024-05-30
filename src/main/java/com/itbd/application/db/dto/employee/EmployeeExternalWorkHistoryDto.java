package com.itbd.application.db.dto.employee;

import com.itbd.application.db.dao.setup.employee.EmployeeExternalWorkHistoryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record EmployeeExternalWorkHistoryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String companyName,
        String designation,
        BigDecimal salary,
        String address,
        String contact,
        String totalExperience,
        String parent,
        String parentField,
        String parentType
) {
    public static EmployeeExternalWorkHistoryDto fromEntity(EmployeeExternalWorkHistoryDao eEmployeeExternalWorkHistoryDao) {
        return new EmployeeExternalWorkHistoryDto(
                eEmployeeExternalWorkHistoryDao.getName(),
                eEmployeeExternalWorkHistoryDao.getCreation(),
                eEmployeeExternalWorkHistoryDao.getModified(),
                eEmployeeExternalWorkHistoryDao.getModifiedBy(),
                eEmployeeExternalWorkHistoryDao.getOwner(),
                eEmployeeExternalWorkHistoryDao.getIsDocStatus(),
                eEmployeeExternalWorkHistoryDao.getIdx(),
                eEmployeeExternalWorkHistoryDao.getCompanyName(),
                eEmployeeExternalWorkHistoryDao.getDesignation(),
                eEmployeeExternalWorkHistoryDao.getSalary(),
                eEmployeeExternalWorkHistoryDao.getAddress(),
                eEmployeeExternalWorkHistoryDao.getContact(),
                eEmployeeExternalWorkHistoryDao.getTotalExperience(),
                eEmployeeExternalWorkHistoryDao.getParent(),
                eEmployeeExternalWorkHistoryDao.getParentField(),
                eEmployeeExternalWorkHistoryDao.getParentType());
    }

    public static void fromDTO(EmployeeExternalWorkHistoryDto vEmployeeExternalWorkHistoryDto, EmployeeExternalWorkHistoryDao eEmployeeExternalWorkHistoryDao) {
        eEmployeeExternalWorkHistoryDao.setName(vEmployeeExternalWorkHistoryDto.name());
        eEmployeeExternalWorkHistoryDao.setCreation(vEmployeeExternalWorkHistoryDto.creation());
        eEmployeeExternalWorkHistoryDao.setModified(vEmployeeExternalWorkHistoryDto.modified());
        eEmployeeExternalWorkHistoryDao.setModifiedBy(vEmployeeExternalWorkHistoryDto.modifiedBy());
        eEmployeeExternalWorkHistoryDao.setOwner(vEmployeeExternalWorkHistoryDto.owner());
        eEmployeeExternalWorkHistoryDao.setIsDocStatus(vEmployeeExternalWorkHistoryDto.isDocStatus());
        eEmployeeExternalWorkHistoryDao.setIdx(vEmployeeExternalWorkHistoryDto.idx());
        eEmployeeExternalWorkHistoryDao.setCompanyName(vEmployeeExternalWorkHistoryDto.companyName());
        eEmployeeExternalWorkHistoryDao.setDesignation(vEmployeeExternalWorkHistoryDto.designation());
        eEmployeeExternalWorkHistoryDao.setSalary(vEmployeeExternalWorkHistoryDto.salary());
        eEmployeeExternalWorkHistoryDao.setAddress(vEmployeeExternalWorkHistoryDto.address());
        eEmployeeExternalWorkHistoryDao.setContact(vEmployeeExternalWorkHistoryDto.contact());
        eEmployeeExternalWorkHistoryDao.setTotalExperience(vEmployeeExternalWorkHistoryDto.totalExperience());
        eEmployeeExternalWorkHistoryDao.setParent(vEmployeeExternalWorkHistoryDto.parent());
        eEmployeeExternalWorkHistoryDao.setParentField(vEmployeeExternalWorkHistoryDto.parentField());
        eEmployeeExternalWorkHistoryDao.setParentType(vEmployeeExternalWorkHistoryDto.parentType());
    }
}