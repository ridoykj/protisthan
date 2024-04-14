package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SmsParameterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SmsParameterDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String parameter,
        String value,
        Boolean header,
        String parent,
        String parentField,
        String parentType
) {
    public static SmsParameterDto fromEntity(SmsParameterDao eSmsParameterDao) {
        return new SmsParameterDto(
                eSmsParameterDao.getName(),
                eSmsParameterDao.getCreation(),
                eSmsParameterDao.getModified(),
                eSmsParameterDao.getModifiedBy(),
                eSmsParameterDao.getOwner(),
                eSmsParameterDao.getIsDocStatus(),
                eSmsParameterDao.getIdx(),
                eSmsParameterDao.getParameter(),
                eSmsParameterDao.getValue(),
                eSmsParameterDao.getHeader(),
                eSmsParameterDao.getParent(),
                eSmsParameterDao.getParentField(),
                eSmsParameterDao.getParentType());
    }

    public static void fromDTO(SmsParameterDto vSmsParameterDto, SmsParameterDao eSmsParameterDao) {
        eSmsParameterDao.setName(vSmsParameterDto.name());
        eSmsParameterDao.setCreation(vSmsParameterDto.creation());
        eSmsParameterDao.setModified(vSmsParameterDto.modified());
        eSmsParameterDao.setModifiedBy(vSmsParameterDto.modifiedBy());
        eSmsParameterDao.setOwner(vSmsParameterDto.owner());
        eSmsParameterDao.setIsDocStatus(vSmsParameterDto.isDocStatus());
        eSmsParameterDao.setIdx(vSmsParameterDto.idx());
        eSmsParameterDao.setParameter(vSmsParameterDto.parameter());
        eSmsParameterDao.setValue(vSmsParameterDto.value());
        eSmsParameterDao.setHeader(vSmsParameterDto.header());
        eSmsParameterDao.setParent(vSmsParameterDto.parent());
        eSmsParameterDao.setParentField(vSmsParameterDto.parentField());
        eSmsParameterDao.setParentType(vSmsParameterDto.parentType());
    }
}