package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.buying.supplier.SupplierScorecardVariableDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SupplierScorecardVariableDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String variableLabel,
        Boolean isCustom,
        String paramName,
        String path,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SupplierScorecardVariableDto fromEntity(SupplierScorecardVariableDao eSupplierScorecardVariableDao) {
        return new SupplierScorecardVariableDto(
                eSupplierScorecardVariableDao.getName(),
                eSupplierScorecardVariableDao.getCreation(),
                eSupplierScorecardVariableDao.getModified(),
                eSupplierScorecardVariableDao.getModifiedBy(),
                eSupplierScorecardVariableDao.getOwner(),
                eSupplierScorecardVariableDao.getIsDocStatus(),
                eSupplierScorecardVariableDao.getIdx(),
                eSupplierScorecardVariableDao.getVariableLabel(),
                eSupplierScorecardVariableDao.getIsCustom(),
                eSupplierScorecardVariableDao.getParamName(),
                eSupplierScorecardVariableDao.getPath(),
                eSupplierScorecardVariableDao.getDescription(),
                eSupplierScorecardVariableDao.getUserTags(),
                eSupplierScorecardVariableDao.getComments(),
                eSupplierScorecardVariableDao.getAssign(),
                eSupplierScorecardVariableDao.getLikedBy());
    }

    public static void fromDTO(SupplierScorecardVariableDto vSupplierScorecardVariableDto, SupplierScorecardVariableDao eSupplierScorecardVariableDao) {
        eSupplierScorecardVariableDao.setName(vSupplierScorecardVariableDto.name());
        eSupplierScorecardVariableDao.setCreation(vSupplierScorecardVariableDto.creation());
        eSupplierScorecardVariableDao.setModified(vSupplierScorecardVariableDto.modified());
        eSupplierScorecardVariableDao.setModifiedBy(vSupplierScorecardVariableDto.modifiedBy());
        eSupplierScorecardVariableDao.setOwner(vSupplierScorecardVariableDto.owner());
        eSupplierScorecardVariableDao.setIsDocStatus(vSupplierScorecardVariableDto.isDocStatus());
        eSupplierScorecardVariableDao.setIdx(vSupplierScorecardVariableDto.idx());
        eSupplierScorecardVariableDao.setVariableLabel(vSupplierScorecardVariableDto.variableLabel());
        eSupplierScorecardVariableDao.setIsCustom(vSupplierScorecardVariableDto.isCustom());
        eSupplierScorecardVariableDao.setParamName(vSupplierScorecardVariableDto.paramName());
        eSupplierScorecardVariableDao.setPath(vSupplierScorecardVariableDto.path());
        eSupplierScorecardVariableDao.setDescription(vSupplierScorecardVariableDto.description());
        eSupplierScorecardVariableDao.setUserTags(vSupplierScorecardVariableDto.userTags());
        eSupplierScorecardVariableDao.setComments(vSupplierScorecardVariableDto.comments());
        eSupplierScorecardVariableDao.setAssign(vSupplierScorecardVariableDto.assign());
        eSupplierScorecardVariableDao.setLikedBy(vSupplierScorecardVariableDto.likedBy());
    }
}