package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.buying.supplier.SupplierScorecardScoringStandingDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SupplierScorecardScoringStandingDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String standingName,
        String standingColor,
        BigDecimal minGrade,
        BigDecimal maxGrade,
        Boolean warnRfqs,
        Boolean warnPos,
        Boolean preventRfqs,
        Boolean preventPos,
        Boolean notifySupplier,
        Boolean notifyEmployee,
        String employeeLink,
        String parent,
        String parentField,
        String parentType
) {
    public static SupplierScorecardScoringStandingDto fromEntity(SupplierScorecardScoringStandingDao eSupplierScorecardScoringStandingDao) {
        return new SupplierScorecardScoringStandingDto(
                eSupplierScorecardScoringStandingDao.getName(),
                eSupplierScorecardScoringStandingDao.getCreation(),
                eSupplierScorecardScoringStandingDao.getModified(),
                eSupplierScorecardScoringStandingDao.getModifiedBy(),
                eSupplierScorecardScoringStandingDao.getOwner(),
                eSupplierScorecardScoringStandingDao.getIsDocStatus(),
                eSupplierScorecardScoringStandingDao.getIdx(),
                eSupplierScorecardScoringStandingDao.getStandingName(),
                eSupplierScorecardScoringStandingDao.getStandingColor(),
                eSupplierScorecardScoringStandingDao.getMinGrade(),
                eSupplierScorecardScoringStandingDao.getMaxGrade(),
                eSupplierScorecardScoringStandingDao.getWarnRfqs(),
                eSupplierScorecardScoringStandingDao.getWarnPos(),
                eSupplierScorecardScoringStandingDao.getPreventRfqs(),
                eSupplierScorecardScoringStandingDao.getPreventPos(),
                eSupplierScorecardScoringStandingDao.getNotifySupplier(),
                eSupplierScorecardScoringStandingDao.getNotifyEmployee(),
                eSupplierScorecardScoringStandingDao.getEmployeeLink(),
                eSupplierScorecardScoringStandingDao.getParent(),
                eSupplierScorecardScoringStandingDao.getParentField(),
                eSupplierScorecardScoringStandingDao.getParentType());
    }

    public static void fromDTO(SupplierScorecardScoringStandingDto vSupplierScorecardScoringStandingDto, SupplierScorecardScoringStandingDao eSupplierScorecardScoringStandingDao) {
        eSupplierScorecardScoringStandingDao.setName(vSupplierScorecardScoringStandingDto.name());
        eSupplierScorecardScoringStandingDao.setCreation(vSupplierScorecardScoringStandingDto.creation());
        eSupplierScorecardScoringStandingDao.setModified(vSupplierScorecardScoringStandingDto.modified());
        eSupplierScorecardScoringStandingDao.setModifiedBy(vSupplierScorecardScoringStandingDto.modifiedBy());
        eSupplierScorecardScoringStandingDao.setOwner(vSupplierScorecardScoringStandingDto.owner());
        eSupplierScorecardScoringStandingDao.setIsDocStatus(vSupplierScorecardScoringStandingDto.isDocStatus());
        eSupplierScorecardScoringStandingDao.setIdx(vSupplierScorecardScoringStandingDto.idx());
        eSupplierScorecardScoringStandingDao.setStandingName(vSupplierScorecardScoringStandingDto.standingName());
        eSupplierScorecardScoringStandingDao.setStandingColor(vSupplierScorecardScoringStandingDto.standingColor());
        eSupplierScorecardScoringStandingDao.setMinGrade(vSupplierScorecardScoringStandingDto.minGrade());
        eSupplierScorecardScoringStandingDao.setMaxGrade(vSupplierScorecardScoringStandingDto.maxGrade());
        eSupplierScorecardScoringStandingDao.setWarnRfqs(vSupplierScorecardScoringStandingDto.warnRfqs());
        eSupplierScorecardScoringStandingDao.setWarnPos(vSupplierScorecardScoringStandingDto.warnPos());
        eSupplierScorecardScoringStandingDao.setPreventRfqs(vSupplierScorecardScoringStandingDto.preventRfqs());
        eSupplierScorecardScoringStandingDao.setPreventPos(vSupplierScorecardScoringStandingDto.preventPos());
        eSupplierScorecardScoringStandingDao.setNotifySupplier(vSupplierScorecardScoringStandingDto.notifySupplier());
        eSupplierScorecardScoringStandingDao.setNotifyEmployee(vSupplierScorecardScoringStandingDto.notifyEmployee());
        eSupplierScorecardScoringStandingDao.setEmployeeLink(vSupplierScorecardScoringStandingDto.employeeLink());
        eSupplierScorecardScoringStandingDao.setParent(vSupplierScorecardScoringStandingDto.parent());
        eSupplierScorecardScoringStandingDao.setParentField(vSupplierScorecardScoringStandingDto.parentField());
        eSupplierScorecardScoringStandingDao.setParentType(vSupplierScorecardScoringStandingDto.parentType());
    }
}