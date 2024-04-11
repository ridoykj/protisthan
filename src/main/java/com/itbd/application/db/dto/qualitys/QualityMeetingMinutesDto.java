package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityMeetingMinutesDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityMeetingMinutesDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String documentName,
        String minute,
        String parent,
        String parentField,
        String parentType
) {
    public static QualityMeetingMinutesDto fromEntity(QualityMeetingMinutesDao eQualityMeetingMinutesDao) {
        return new QualityMeetingMinutesDto(
                eQualityMeetingMinutesDao.getName(),
                eQualityMeetingMinutesDao.getCreation(),
                eQualityMeetingMinutesDao.getModified(),
                eQualityMeetingMinutesDao.getModifiedBy(),
                eQualityMeetingMinutesDao.getOwner(),
                eQualityMeetingMinutesDao.getIsDocStatus(),
                eQualityMeetingMinutesDao.getIdx(),
                eQualityMeetingMinutesDao.getDocumentType(),
                eQualityMeetingMinutesDao.getDocumentName(),
                eQualityMeetingMinutesDao.getMinute(),
                eQualityMeetingMinutesDao.getParent(),
                eQualityMeetingMinutesDao.getParentField(),
                eQualityMeetingMinutesDao.getParentType());
    }

    public static void fromDTO(QualityMeetingMinutesDto vQualityMeetingMinutesDto, QualityMeetingMinutesDao eQualityMeetingMinutesDao) {
        eQualityMeetingMinutesDao.setName(vQualityMeetingMinutesDto.name());
        eQualityMeetingMinutesDao.setCreation(vQualityMeetingMinutesDto.creation());
        eQualityMeetingMinutesDao.setModified(vQualityMeetingMinutesDto.modified());
        eQualityMeetingMinutesDao.setModifiedBy(vQualityMeetingMinutesDto.modifiedBy());
        eQualityMeetingMinutesDao.setOwner(vQualityMeetingMinutesDto.owner());
        eQualityMeetingMinutesDao.setIsDocStatus(vQualityMeetingMinutesDto.isDocStatus());
        eQualityMeetingMinutesDao.setIdx(vQualityMeetingMinutesDto.idx());
        eQualityMeetingMinutesDao.setDocumentType(vQualityMeetingMinutesDto.documentType());
        eQualityMeetingMinutesDao.setDocumentName(vQualityMeetingMinutesDto.documentName());
        eQualityMeetingMinutesDao.setMinute(vQualityMeetingMinutesDto.minute());
        eQualityMeetingMinutesDao.setParent(vQualityMeetingMinutesDto.parent());
        eQualityMeetingMinutesDao.setParentField(vQualityMeetingMinutesDto.parentField());
        eQualityMeetingMinutesDao.setParentType(vQualityMeetingMinutesDto.parentType());
    }
}