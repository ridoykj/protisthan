package com.itbd.application.db.dto.maintenance;

import com.itbd.application.db.dao.maintenance.MaintenanceVisitPurposeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record MaintenanceVisitPurposeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String itemName,
        String servicePerson,
        String serialNo,
        String description,
        String workDone,
        String prevDocumentDocType,
        String prevDocumentDocName,
        String maintenanceScheduleDetail,
        String parent,
        String parentField,
        String parentType
) {
    public static MaintenanceVisitPurposeDto fromEntity(MaintenanceVisitPurposeDao eMaintenanceVisitPurposeDao) {
        return new MaintenanceVisitPurposeDto(
                eMaintenanceVisitPurposeDao.getName(),
                eMaintenanceVisitPurposeDao.getCreation(),
                eMaintenanceVisitPurposeDao.getModified(),
                eMaintenanceVisitPurposeDao.getModifiedBy(),
                eMaintenanceVisitPurposeDao.getOwner(),
                eMaintenanceVisitPurposeDao.getIsDocStatus(),
                eMaintenanceVisitPurposeDao.getIdx(),
                eMaintenanceVisitPurposeDao.getItemCode(),
                eMaintenanceVisitPurposeDao.getItemName(),
                eMaintenanceVisitPurposeDao.getServicePerson(),
                eMaintenanceVisitPurposeDao.getSerialNo(),
                eMaintenanceVisitPurposeDao.getDescription(),
                eMaintenanceVisitPurposeDao.getWorkDone(),
                eMaintenanceVisitPurposeDao.getPrevDocumentDocType(),
                eMaintenanceVisitPurposeDao.getPrevDocumentDocName(),
                eMaintenanceVisitPurposeDao.getMaintenanceScheduleDetail(),
                eMaintenanceVisitPurposeDao.getParent(),
                eMaintenanceVisitPurposeDao.getParentField(),
                eMaintenanceVisitPurposeDao.getParentType());
    }

    public static void fromDTO(MaintenanceVisitPurposeDto vMaintenanceVisitPurposeDto, MaintenanceVisitPurposeDao eMaintenanceVisitPurposeDao) {
        eMaintenanceVisitPurposeDao.setName(vMaintenanceVisitPurposeDto.name());
        eMaintenanceVisitPurposeDao.setCreation(vMaintenanceVisitPurposeDto.creation());
        eMaintenanceVisitPurposeDao.setModified(vMaintenanceVisitPurposeDto.modified());
        eMaintenanceVisitPurposeDao.setModifiedBy(vMaintenanceVisitPurposeDto.modifiedBy());
        eMaintenanceVisitPurposeDao.setOwner(vMaintenanceVisitPurposeDto.owner());
        eMaintenanceVisitPurposeDao.setIsDocStatus(vMaintenanceVisitPurposeDto.isDocStatus());
        eMaintenanceVisitPurposeDao.setIdx(vMaintenanceVisitPurposeDto.idx());
        eMaintenanceVisitPurposeDao.setItemCode(vMaintenanceVisitPurposeDto.itemCode());
        eMaintenanceVisitPurposeDao.setItemName(vMaintenanceVisitPurposeDto.itemName());
        eMaintenanceVisitPurposeDao.setServicePerson(vMaintenanceVisitPurposeDto.servicePerson());
        eMaintenanceVisitPurposeDao.setSerialNo(vMaintenanceVisitPurposeDto.serialNo());
        eMaintenanceVisitPurposeDao.setDescription(vMaintenanceVisitPurposeDto.description());
        eMaintenanceVisitPurposeDao.setWorkDone(vMaintenanceVisitPurposeDto.workDone());
        eMaintenanceVisitPurposeDao.setPrevDocumentDocType(vMaintenanceVisitPurposeDto.prevDocumentDocType());
        eMaintenanceVisitPurposeDao.setPrevDocumentDocName(vMaintenanceVisitPurposeDto.prevDocumentDocName());
        eMaintenanceVisitPurposeDao.setMaintenanceScheduleDetail(vMaintenanceVisitPurposeDto.maintenanceScheduleDetail());
        eMaintenanceVisitPurposeDao.setParent(vMaintenanceVisitPurposeDto.parent());
        eMaintenanceVisitPurposeDao.setParentField(vMaintenanceVisitPurposeDto.parentField());
        eMaintenanceVisitPurposeDao.setParentType(vMaintenanceVisitPurposeDto.parentType());
    }
}