package com.itbd.application.db.dto.workstation;

import com.itbd.application.db.dao.manufacturing.workstation.WorkstationTypeDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record WorkstationTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String workstationType,
        BigDecimal hourRateElectricity,
        BigDecimal hourRateConsumable,
        BigDecimal hourRateRent,
        BigDecimal hourRateLabour,
        BigDecimal hourRate,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WorkstationTypeDto fromEntity(WorkstationTypeDao eWorkstationTypeDao) {
        return new WorkstationTypeDto(
                eWorkstationTypeDao.getName(),
                eWorkstationTypeDao.getCreation(),
                eWorkstationTypeDao.getModified(),
                eWorkstationTypeDao.getModifiedBy(),
                eWorkstationTypeDao.getOwner(),
                eWorkstationTypeDao.getIsDocStatus(),
                eWorkstationTypeDao.getIdx(),
                eWorkstationTypeDao.getWorkstationType(),
                eWorkstationTypeDao.getHourRateElectricity(),
                eWorkstationTypeDao.getHourRateConsumable(),
                eWorkstationTypeDao.getHourRateRent(),
                eWorkstationTypeDao.getHourRateLabour(),
                eWorkstationTypeDao.getHourRate(),
                eWorkstationTypeDao.getDescription(),
                eWorkstationTypeDao.getUserTags(),
                eWorkstationTypeDao.getComments(),
                eWorkstationTypeDao.getAssign(),
                eWorkstationTypeDao.getLikedBy());
    }

    public static void fromDTO(WorkstationTypeDto vWorkstationTypeDto, WorkstationTypeDao eWorkstationTypeDao) {
        eWorkstationTypeDao.setName(vWorkstationTypeDto.name());
        eWorkstationTypeDao.setCreation(vWorkstationTypeDto.creation());
        eWorkstationTypeDao.setModified(vWorkstationTypeDto.modified());
        eWorkstationTypeDao.setModifiedBy(vWorkstationTypeDto.modifiedBy());
        eWorkstationTypeDao.setOwner(vWorkstationTypeDto.owner());
        eWorkstationTypeDao.setIsDocStatus(vWorkstationTypeDto.isDocStatus());
        eWorkstationTypeDao.setIdx(vWorkstationTypeDto.idx());
        eWorkstationTypeDao.setWorkstationType(vWorkstationTypeDto.workstationType());
        eWorkstationTypeDao.setHourRateElectricity(vWorkstationTypeDto.hourRateElectricity());
        eWorkstationTypeDao.setHourRateConsumable(vWorkstationTypeDto.hourRateConsumable());
        eWorkstationTypeDao.setHourRateRent(vWorkstationTypeDto.hourRateRent());
        eWorkstationTypeDao.setHourRateLabour(vWorkstationTypeDto.hourRateLabour());
        eWorkstationTypeDao.setHourRate(vWorkstationTypeDto.hourRate());
        eWorkstationTypeDao.setDescription(vWorkstationTypeDto.description());
        eWorkstationTypeDao.setUserTags(vWorkstationTypeDto.userTags());
        eWorkstationTypeDao.setComments(vWorkstationTypeDto.comments());
        eWorkstationTypeDao.setAssign(vWorkstationTypeDto.assign());
        eWorkstationTypeDao.setLikedBy(vWorkstationTypeDto.likedBy());
    }
}