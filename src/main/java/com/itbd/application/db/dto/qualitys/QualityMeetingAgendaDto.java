package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityMeetingAgendaDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityMeetingAgendaDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String agenda,
        String parent,
        String parentField,
        String parentType
) {
    public static QualityMeetingAgendaDto fromEntity(QualityMeetingAgendaDao eQualityMeetingAgendaDao) {
        return new QualityMeetingAgendaDto(
                eQualityMeetingAgendaDao.getName(),
                eQualityMeetingAgendaDao.getCreation(),
                eQualityMeetingAgendaDao.getModified(),
                eQualityMeetingAgendaDao.getModifiedBy(),
                eQualityMeetingAgendaDao.getOwner(),
                eQualityMeetingAgendaDao.getIsDocStatus(),
                eQualityMeetingAgendaDao.getIdx(),
                eQualityMeetingAgendaDao.getAgenda(),
                eQualityMeetingAgendaDao.getParent(),
                eQualityMeetingAgendaDao.getParentField(),
                eQualityMeetingAgendaDao.getParentType());
    }

    public static void fromDTO(QualityMeetingAgendaDto vQualityMeetingAgendaDto, QualityMeetingAgendaDao eQualityMeetingAgendaDao) {
        eQualityMeetingAgendaDao.setName(vQualityMeetingAgendaDto.name());
        eQualityMeetingAgendaDao.setCreation(vQualityMeetingAgendaDto.creation());
        eQualityMeetingAgendaDao.setModified(vQualityMeetingAgendaDto.modified());
        eQualityMeetingAgendaDao.setModifiedBy(vQualityMeetingAgendaDto.modifiedBy());
        eQualityMeetingAgendaDao.setOwner(vQualityMeetingAgendaDto.owner());
        eQualityMeetingAgendaDao.setIsDocStatus(vQualityMeetingAgendaDto.isDocStatus());
        eQualityMeetingAgendaDao.setIdx(vQualityMeetingAgendaDto.idx());
        eQualityMeetingAgendaDao.setAgenda(vQualityMeetingAgendaDto.agenda());
        eQualityMeetingAgendaDao.setParent(vQualityMeetingAgendaDto.parent());
        eQualityMeetingAgendaDao.setParentField(vQualityMeetingAgendaDto.parentField());
        eQualityMeetingAgendaDao.setParentType(vQualityMeetingAgendaDto.parentType());
    }
}