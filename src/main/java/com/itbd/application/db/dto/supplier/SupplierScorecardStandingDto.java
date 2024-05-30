package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.buying.supplier.SupplierScorecardStandingDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SupplierScorecardStandingDto(
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
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SupplierScorecardStandingDto fromEntity(SupplierScorecardStandingDao eSupplierScorecardStandingDao) {
        return new SupplierScorecardStandingDto(
                eSupplierScorecardStandingDao.getName(),
                eSupplierScorecardStandingDao.getCreation(),
                eSupplierScorecardStandingDao.getModified(),
                eSupplierScorecardStandingDao.getModifiedBy(),
                eSupplierScorecardStandingDao.getOwner(),
                eSupplierScorecardStandingDao.getIsDocStatus(),
                eSupplierScorecardStandingDao.getIdx(),
                eSupplierScorecardStandingDao.getStandingName(),
                eSupplierScorecardStandingDao.getStandingColor(),
                eSupplierScorecardStandingDao.getMinGrade(),
                eSupplierScorecardStandingDao.getMaxGrade(),
                eSupplierScorecardStandingDao.getWarnRfqs(),
                eSupplierScorecardStandingDao.getWarnPos(),
                eSupplierScorecardStandingDao.getPreventRfqs(),
                eSupplierScorecardStandingDao.getPreventPos(),
                eSupplierScorecardStandingDao.getNotifySupplier(),
                eSupplierScorecardStandingDao.getNotifyEmployee(),
                eSupplierScorecardStandingDao.getEmployeeLink(),
                eSupplierScorecardStandingDao.getUserTags(),
                eSupplierScorecardStandingDao.getComments(),
                eSupplierScorecardStandingDao.getAssign(),
                eSupplierScorecardStandingDao.getLikedBy());
    }

    public static void fromDTO(SupplierScorecardStandingDto vSupplierScorecardStandingDto, SupplierScorecardStandingDao eSupplierScorecardStandingDao) {
        eSupplierScorecardStandingDao.setName(vSupplierScorecardStandingDto.name());
        eSupplierScorecardStandingDao.setCreation(vSupplierScorecardStandingDto.creation());
        eSupplierScorecardStandingDao.setModified(vSupplierScorecardStandingDto.modified());
        eSupplierScorecardStandingDao.setModifiedBy(vSupplierScorecardStandingDto.modifiedBy());
        eSupplierScorecardStandingDao.setOwner(vSupplierScorecardStandingDto.owner());
        eSupplierScorecardStandingDao.setIsDocStatus(vSupplierScorecardStandingDto.isDocStatus());
        eSupplierScorecardStandingDao.setIdx(vSupplierScorecardStandingDto.idx());
        eSupplierScorecardStandingDao.setStandingName(vSupplierScorecardStandingDto.standingName());
        eSupplierScorecardStandingDao.setStandingColor(vSupplierScorecardStandingDto.standingColor());
        eSupplierScorecardStandingDao.setMinGrade(vSupplierScorecardStandingDto.minGrade());
        eSupplierScorecardStandingDao.setMaxGrade(vSupplierScorecardStandingDto.maxGrade());
        eSupplierScorecardStandingDao.setWarnRfqs(vSupplierScorecardStandingDto.warnRfqs());
        eSupplierScorecardStandingDao.setWarnPos(vSupplierScorecardStandingDto.warnPos());
        eSupplierScorecardStandingDao.setPreventRfqs(vSupplierScorecardStandingDto.preventRfqs());
        eSupplierScorecardStandingDao.setPreventPos(vSupplierScorecardStandingDto.preventPos());
        eSupplierScorecardStandingDao.setNotifySupplier(vSupplierScorecardStandingDto.notifySupplier());
        eSupplierScorecardStandingDao.setNotifyEmployee(vSupplierScorecardStandingDto.notifyEmployee());
        eSupplierScorecardStandingDao.setEmployeeLink(vSupplierScorecardStandingDto.employeeLink());
        eSupplierScorecardStandingDao.setUserTags(vSupplierScorecardStandingDto.userTags());
        eSupplierScorecardStandingDao.setComments(vSupplierScorecardStandingDto.comments());
        eSupplierScorecardStandingDao.setAssign(vSupplierScorecardStandingDto.assign());
        eSupplierScorecardStandingDao.setLikedBy(vSupplierScorecardStandingDto.likedBy());
    }
}