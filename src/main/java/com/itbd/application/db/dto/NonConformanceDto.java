package com.itbd.application.db.dto;

import com.itbd.application.db.dao.NonConformanceDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NonConformanceDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String subject,
        String procedure,
        String processOwner,
        String fullName,
        String status,
        String details,
        String correctiveAction,
        String preventiveAction,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static NonConformanceDto fromEntity(NonConformanceDao eNonConformanceDao) {
        return new NonConformanceDto(
                eNonConformanceDao.getName(),
                eNonConformanceDao.getCreation(),
                eNonConformanceDao.getModified(),
                eNonConformanceDao.getModifiedBy(),
                eNonConformanceDao.getOwner(),
                eNonConformanceDao.getIsDocStatus(),
                eNonConformanceDao.getIdx(),
                eNonConformanceDao.getSubject(),
                eNonConformanceDao.getProcedure(),
                eNonConformanceDao.getProcessOwner(),
                eNonConformanceDao.getFullName(),
                eNonConformanceDao.getStatus(),
                eNonConformanceDao.getDetails(),
                eNonConformanceDao.getCorrectiveAction(),
                eNonConformanceDao.getPreventiveAction(),
                eNonConformanceDao.getUserTags(),
                eNonConformanceDao.getComments(),
                eNonConformanceDao.getAssign(),
                eNonConformanceDao.getLikedBy());
    }

    public static void fromDTO(NonConformanceDto vNonConformanceDto, NonConformanceDao eNonConformanceDao) {
        eNonConformanceDao.setName(vNonConformanceDto.name());
        eNonConformanceDao.setCreation(vNonConformanceDto.creation());
        eNonConformanceDao.setModified(vNonConformanceDto.modified());
        eNonConformanceDao.setModifiedBy(vNonConformanceDto.modifiedBy());
        eNonConformanceDao.setOwner(vNonConformanceDto.owner());
        eNonConformanceDao.setIsDocStatus(vNonConformanceDto.isDocStatus());
        eNonConformanceDao.setIdx(vNonConformanceDto.idx());
        eNonConformanceDao.setSubject(vNonConformanceDto.subject());
        eNonConformanceDao.setProcedure(vNonConformanceDto.procedure());
        eNonConformanceDao.setProcessOwner(vNonConformanceDto.processOwner());
        eNonConformanceDao.setFullName(vNonConformanceDto.fullName());
        eNonConformanceDao.setStatus(vNonConformanceDto.status());
        eNonConformanceDao.setDetails(vNonConformanceDto.details());
        eNonConformanceDao.setCorrectiveAction(vNonConformanceDto.correctiveAction());
        eNonConformanceDao.setPreventiveAction(vNonConformanceDto.preventiveAction());
        eNonConformanceDao.setUserTags(vNonConformanceDto.userTags());
        eNonConformanceDao.setComments(vNonConformanceDto.comments());
        eNonConformanceDao.setAssign(vNonConformanceDto.assign());
        eNonConformanceDao.setLikedBy(vNonConformanceDto.likedBy());
    }
}