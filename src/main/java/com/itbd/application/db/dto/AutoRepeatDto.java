package com.itbd.application.db.dto;

import com.itbd.application.db.dao.AutoRepeatDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AutoRepeatDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean disabled,
        String referenceDocType,
        String referenceDocument,
        Boolean submitOnCreation,
        LocalDate startDate,
        LocalDate endDate,
        String frequency,
        Integer repeatOnDay,
        Boolean repeatOnLastDay,
        LocalDate nextScheduleDate,
        Boolean notifyByEmail,
        String recipients,
        String template,
        String subject,
        String message,
        String printFormat,
        String status,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AutoRepeatDto fromEntity(AutoRepeatDao eAutoRepeatDao) {
        return new AutoRepeatDto(
                eAutoRepeatDao.getName(),
                eAutoRepeatDao.getCreation(),
                eAutoRepeatDao.getModified(),
                eAutoRepeatDao.getModifiedBy(),
                eAutoRepeatDao.getOwner(),
                eAutoRepeatDao.getIsDocStatus(),
                eAutoRepeatDao.getIdx(),
                eAutoRepeatDao.getDisabled(),
                eAutoRepeatDao.getReferenceDocType(),
                eAutoRepeatDao.getReferenceDocument(),
                eAutoRepeatDao.getSubmitOnCreation(),
                eAutoRepeatDao.getStartDate(),
                eAutoRepeatDao.getEndDate(),
                eAutoRepeatDao.getFrequency(),
                eAutoRepeatDao.getRepeatOnDay(),
                eAutoRepeatDao.getRepeatOnLastDay(),
                eAutoRepeatDao.getNextScheduleDate(),
                eAutoRepeatDao.getNotifyByEmail(),
                eAutoRepeatDao.getRecipients(),
                eAutoRepeatDao.getTemplate(),
                eAutoRepeatDao.getSubject(),
                eAutoRepeatDao.getMessage(),
                eAutoRepeatDao.getPrintFormat(),
                eAutoRepeatDao.getStatus(),
                eAutoRepeatDao.getUserTags(),
                eAutoRepeatDao.getComments(),
                eAutoRepeatDao.getAssign(),
                eAutoRepeatDao.getLikedBy());
    }

    public static void fromDTO(AutoRepeatDto vAutoRepeatDto, AutoRepeatDao eAutoRepeatDao) {
        eAutoRepeatDao.setName(vAutoRepeatDto.name());
        eAutoRepeatDao.setCreation(vAutoRepeatDto.creation());
        eAutoRepeatDao.setModified(vAutoRepeatDto.modified());
        eAutoRepeatDao.setModifiedBy(vAutoRepeatDto.modifiedBy());
        eAutoRepeatDao.setOwner(vAutoRepeatDto.owner());
        eAutoRepeatDao.setIsDocStatus(vAutoRepeatDto.isDocStatus());
        eAutoRepeatDao.setIdx(vAutoRepeatDto.idx());
        eAutoRepeatDao.setDisabled(vAutoRepeatDto.disabled());
        eAutoRepeatDao.setReferenceDocType(vAutoRepeatDto.referenceDocType());
        eAutoRepeatDao.setReferenceDocument(vAutoRepeatDto.referenceDocument());
        eAutoRepeatDao.setSubmitOnCreation(vAutoRepeatDto.submitOnCreation());
        eAutoRepeatDao.setStartDate(vAutoRepeatDto.startDate());
        eAutoRepeatDao.setEndDate(vAutoRepeatDto.endDate());
        eAutoRepeatDao.setFrequency(vAutoRepeatDto.frequency());
        eAutoRepeatDao.setRepeatOnDay(vAutoRepeatDto.repeatOnDay());
        eAutoRepeatDao.setRepeatOnLastDay(vAutoRepeatDto.repeatOnLastDay());
        eAutoRepeatDao.setNextScheduleDate(vAutoRepeatDto.nextScheduleDate());
        eAutoRepeatDao.setNotifyByEmail(vAutoRepeatDto.notifyByEmail());
        eAutoRepeatDao.setRecipients(vAutoRepeatDto.recipients());
        eAutoRepeatDao.setTemplate(vAutoRepeatDto.template());
        eAutoRepeatDao.setSubject(vAutoRepeatDto.subject());
        eAutoRepeatDao.setMessage(vAutoRepeatDto.message());
        eAutoRepeatDao.setPrintFormat(vAutoRepeatDto.printFormat());
        eAutoRepeatDao.setStatus(vAutoRepeatDto.status());
        eAutoRepeatDao.setUserTags(vAutoRepeatDto.userTags());
        eAutoRepeatDao.setComments(vAutoRepeatDto.comments());
        eAutoRepeatDao.setAssign(vAutoRepeatDto.assign());
        eAutoRepeatDao.setLikedBy(vAutoRepeatDto.likedBy());
    }
}