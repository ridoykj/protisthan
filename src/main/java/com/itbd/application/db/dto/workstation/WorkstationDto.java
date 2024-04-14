package com.itbd.application.db.dto.workstation;

import com.itbd.application.db.dao.workstation.WorkstationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record WorkstationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String workstationName,
        String workstationType,
        String plantFloor,
        Integer productionCapacity,
        String warehouse,
        BigDecimal partsPerHour,
        String status,
        String onStatusImage,
        String offStatusImage,
        BigDecimal hourRateElectricity,
        BigDecimal hourRateConsumable,
        BigDecimal hourRateRent,
        BigDecimal hourRateLabour,
        BigDecimal hourRate,
        String description,
        String holidayList,
        BigDecimal totalWorkingHours,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WorkstationDto fromEntity(WorkstationDao eWorkstationDao) {
        return new WorkstationDto(
                eWorkstationDao.getName(),
                eWorkstationDao.getCreation(),
                eWorkstationDao.getModified(),
                eWorkstationDao.getModifiedBy(),
                eWorkstationDao.getOwner(),
                eWorkstationDao.getIsDocStatus(),
                eWorkstationDao.getIdx(),
                eWorkstationDao.getWorkstationName(),
                eWorkstationDao.getWorkstationType(),
                eWorkstationDao.getPlantFloor(),
                eWorkstationDao.getProductionCapacity(),
                eWorkstationDao.getWarehouse(),
                eWorkstationDao.getPartsPerHour(),
                eWorkstationDao.getStatus(),
                eWorkstationDao.getOnStatusImage(),
                eWorkstationDao.getOffStatusImage(),
                eWorkstationDao.getHourRateElectricity(),
                eWorkstationDao.getHourRateConsumable(),
                eWorkstationDao.getHourRateRent(),
                eWorkstationDao.getHourRateLabour(),
                eWorkstationDao.getHourRate(),
                eWorkstationDao.getDescription(),
                eWorkstationDao.getHolidayList(),
                eWorkstationDao.getTotalWorkingHours(),
                eWorkstationDao.getUserTags(),
                eWorkstationDao.getComments(),
                eWorkstationDao.getAssign(),
                eWorkstationDao.getLikedBy());
    }

    public static void fromDTO(WorkstationDto vWorkstationDto, WorkstationDao eWorkstationDao) {
        eWorkstationDao.setName(vWorkstationDto.name());
        eWorkstationDao.setCreation(vWorkstationDto.creation());
        eWorkstationDao.setModified(vWorkstationDto.modified());
        eWorkstationDao.setModifiedBy(vWorkstationDto.modifiedBy());
        eWorkstationDao.setOwner(vWorkstationDto.owner());
        eWorkstationDao.setIsDocStatus(vWorkstationDto.isDocStatus());
        eWorkstationDao.setIdx(vWorkstationDto.idx());
        eWorkstationDao.setWorkstationName(vWorkstationDto.workstationName());
        eWorkstationDao.setWorkstationType(vWorkstationDto.workstationType());
        eWorkstationDao.setPlantFloor(vWorkstationDto.plantFloor());
        eWorkstationDao.setProductionCapacity(vWorkstationDto.productionCapacity());
        eWorkstationDao.setWarehouse(vWorkstationDto.warehouse());
        eWorkstationDao.setPartsPerHour(vWorkstationDto.partsPerHour());
        eWorkstationDao.setStatus(vWorkstationDto.status());
        eWorkstationDao.setOnStatusImage(vWorkstationDto.onStatusImage());
        eWorkstationDao.setOffStatusImage(vWorkstationDto.offStatusImage());
        eWorkstationDao.setHourRateElectricity(vWorkstationDto.hourRateElectricity());
        eWorkstationDao.setHourRateConsumable(vWorkstationDto.hourRateConsumable());
        eWorkstationDao.setHourRateRent(vWorkstationDto.hourRateRent());
        eWorkstationDao.setHourRateLabour(vWorkstationDto.hourRateLabour());
        eWorkstationDao.setHourRate(vWorkstationDto.hourRate());
        eWorkstationDao.setDescription(vWorkstationDto.description());
        eWorkstationDao.setHolidayList(vWorkstationDto.holidayList());
        eWorkstationDao.setTotalWorkingHours(vWorkstationDto.totalWorkingHours());
        eWorkstationDao.setUserTags(vWorkstationDto.userTags());
        eWorkstationDao.setComments(vWorkstationDto.comments());
        eWorkstationDao.setAssign(vWorkstationDto.assign());
        eWorkstationDao.setLikedBy(vWorkstationDto.likedBy());
    }
}