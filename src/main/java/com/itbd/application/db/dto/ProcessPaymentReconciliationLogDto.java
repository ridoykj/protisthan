package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProcessPaymentReconciliationLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ProcessPaymentReconciliationLogDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String processPr,
        String status,
        Boolean allocated,
        Boolean reconciled,
        Integer totalAllocations,
        Integer reconciledEntries,
        String errorLog,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProcessPaymentReconciliationLogDto fromEntity(ProcessPaymentReconciliationLogDao eProcessPaymentReconciliationLogDao) {
        return new ProcessPaymentReconciliationLogDto(
                eProcessPaymentReconciliationLogDao.getName(),
                eProcessPaymentReconciliationLogDao.getCreation(),
                eProcessPaymentReconciliationLogDao.getModified(),
                eProcessPaymentReconciliationLogDao.getModifiedBy(),
                eProcessPaymentReconciliationLogDao.getOwner(),
                eProcessPaymentReconciliationLogDao.getIsDocStatus(),
                eProcessPaymentReconciliationLogDao.getIdx(),
                eProcessPaymentReconciliationLogDao.getProcessPr(),
                eProcessPaymentReconciliationLogDao.getStatus(),
                eProcessPaymentReconciliationLogDao.getAllocated(),
                eProcessPaymentReconciliationLogDao.getReconciled(),
                eProcessPaymentReconciliationLogDao.getTotalAllocations(),
                eProcessPaymentReconciliationLogDao.getReconciledEntries(),
                eProcessPaymentReconciliationLogDao.getErrorLog(),
                eProcessPaymentReconciliationLogDao.getUserTags(),
                eProcessPaymentReconciliationLogDao.getComments(),
                eProcessPaymentReconciliationLogDao.getAssign(),
                eProcessPaymentReconciliationLogDao.getLikedBy());
    }

    public static void fromDTO(ProcessPaymentReconciliationLogDto vProcessPaymentReconciliationLogDto, ProcessPaymentReconciliationLogDao eProcessPaymentReconciliationLogDao) {
        eProcessPaymentReconciliationLogDao.setName(vProcessPaymentReconciliationLogDto.name());
        eProcessPaymentReconciliationLogDao.setCreation(vProcessPaymentReconciliationLogDto.creation());
        eProcessPaymentReconciliationLogDao.setModified(vProcessPaymentReconciliationLogDto.modified());
        eProcessPaymentReconciliationLogDao.setModifiedBy(vProcessPaymentReconciliationLogDto.modifiedBy());
        eProcessPaymentReconciliationLogDao.setOwner(vProcessPaymentReconciliationLogDto.owner());
        eProcessPaymentReconciliationLogDao.setIsDocStatus(vProcessPaymentReconciliationLogDto.isDocStatus());
        eProcessPaymentReconciliationLogDao.setIdx(vProcessPaymentReconciliationLogDto.idx());
        eProcessPaymentReconciliationLogDao.setProcessPr(vProcessPaymentReconciliationLogDto.processPr());
        eProcessPaymentReconciliationLogDao.setStatus(vProcessPaymentReconciliationLogDto.status());
        eProcessPaymentReconciliationLogDao.setAllocated(vProcessPaymentReconciliationLogDto.allocated());
        eProcessPaymentReconciliationLogDao.setReconciled(vProcessPaymentReconciliationLogDto.reconciled());
        eProcessPaymentReconciliationLogDao.setTotalAllocations(vProcessPaymentReconciliationLogDto.totalAllocations());
        eProcessPaymentReconciliationLogDao.setReconciledEntries(vProcessPaymentReconciliationLogDto.reconciledEntries());
        eProcessPaymentReconciliationLogDao.setErrorLog(vProcessPaymentReconciliationLogDto.errorLog());
        eProcessPaymentReconciliationLogDao.setUserTags(vProcessPaymentReconciliationLogDto.userTags());
        eProcessPaymentReconciliationLogDao.setComments(vProcessPaymentReconciliationLogDto.comments());
        eProcessPaymentReconciliationLogDao.setAssign(vProcessPaymentReconciliationLogDto.assign());
        eProcessPaymentReconciliationLogDao.setLikedBy(vProcessPaymentReconciliationLogDto.likedBy());
    }
}