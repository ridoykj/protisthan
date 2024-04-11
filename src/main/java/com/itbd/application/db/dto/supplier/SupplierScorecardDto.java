package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.supplier.SupplierScorecardDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SupplierScorecardDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String supplier,
        String supplierScore,
        String indicatorColor,
        String status,
        String period,
        String weightingFunction,
        Boolean warnRfqs,
        Boolean warnPos,
        Boolean preventRfqs,
        Boolean preventPos,
        Boolean notifySupplier,
        Boolean notifyEmployee,
        String employee,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SupplierScorecardDto fromEntity(SupplierScorecardDao eSupplierScorecardDao) {
        return new SupplierScorecardDto(
                eSupplierScorecardDao.getName(),
                eSupplierScorecardDao.getCreation(),
                eSupplierScorecardDao.getModified(),
                eSupplierScorecardDao.getModifiedBy(),
                eSupplierScorecardDao.getOwner(),
                eSupplierScorecardDao.getIsDocStatus(),
                eSupplierScorecardDao.getIdx(),
                eSupplierScorecardDao.getSupplier(),
                eSupplierScorecardDao.getSupplierScore(),
                eSupplierScorecardDao.getIndicatorColor(),
                eSupplierScorecardDao.getStatus(),
                eSupplierScorecardDao.getPeriod(),
                eSupplierScorecardDao.getWeightingFunction(),
                eSupplierScorecardDao.getWarnRfqs(),
                eSupplierScorecardDao.getWarnPos(),
                eSupplierScorecardDao.getPreventRfqs(),
                eSupplierScorecardDao.getPreventPos(),
                eSupplierScorecardDao.getNotifySupplier(),
                eSupplierScorecardDao.getNotifyEmployee(),
                eSupplierScorecardDao.getEmployee(),
                eSupplierScorecardDao.getUserTags(),
                eSupplierScorecardDao.getComments(),
                eSupplierScorecardDao.getAssign(),
                eSupplierScorecardDao.getLikedBy());
    }

    public static void fromDTO(SupplierScorecardDto vSupplierScorecardDto, SupplierScorecardDao eSupplierScorecardDao) {
        eSupplierScorecardDao.setName(vSupplierScorecardDto.name());
        eSupplierScorecardDao.setCreation(vSupplierScorecardDto.creation());
        eSupplierScorecardDao.setModified(vSupplierScorecardDto.modified());
        eSupplierScorecardDao.setModifiedBy(vSupplierScorecardDto.modifiedBy());
        eSupplierScorecardDao.setOwner(vSupplierScorecardDto.owner());
        eSupplierScorecardDao.setIsDocStatus(vSupplierScorecardDto.isDocStatus());
        eSupplierScorecardDao.setIdx(vSupplierScorecardDto.idx());
        eSupplierScorecardDao.setSupplier(vSupplierScorecardDto.supplier());
        eSupplierScorecardDao.setSupplierScore(vSupplierScorecardDto.supplierScore());
        eSupplierScorecardDao.setIndicatorColor(vSupplierScorecardDto.indicatorColor());
        eSupplierScorecardDao.setStatus(vSupplierScorecardDto.status());
        eSupplierScorecardDao.setPeriod(vSupplierScorecardDto.period());
        eSupplierScorecardDao.setWeightingFunction(vSupplierScorecardDto.weightingFunction());
        eSupplierScorecardDao.setWarnRfqs(vSupplierScorecardDto.warnRfqs());
        eSupplierScorecardDao.setWarnPos(vSupplierScorecardDto.warnPos());
        eSupplierScorecardDao.setPreventRfqs(vSupplierScorecardDto.preventRfqs());
        eSupplierScorecardDao.setPreventPos(vSupplierScorecardDto.preventPos());
        eSupplierScorecardDao.setNotifySupplier(vSupplierScorecardDto.notifySupplier());
        eSupplierScorecardDao.setNotifyEmployee(vSupplierScorecardDto.notifyEmployee());
        eSupplierScorecardDao.setEmployee(vSupplierScorecardDto.employee());
        eSupplierScorecardDao.setUserTags(vSupplierScorecardDto.userTags());
        eSupplierScorecardDao.setComments(vSupplierScorecardDto.comments());
        eSupplierScorecardDao.setAssign(vSupplierScorecardDto.assign());
        eSupplierScorecardDao.setLikedBy(vSupplierScorecardDto.likedBy());
    }
}