package com.itbd.application.db.dto.uoms;

import com.itbd.application.db.dao.uoms.UomConversionFactorDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record UomConversionFactorDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String category,
        String fromUom,
        String toUom,
        BigDecimal value,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static UomConversionFactorDto fromEntity(UomConversionFactorDao eUomConversionFactorDao) {
        return new UomConversionFactorDto(
                eUomConversionFactorDao.getName(),
                eUomConversionFactorDao.getCreation(),
                eUomConversionFactorDao.getModified(),
                eUomConversionFactorDao.getModifiedBy(),
                eUomConversionFactorDao.getOwner(),
                eUomConversionFactorDao.getIsDocStatus(),
                eUomConversionFactorDao.getIdx(),
                eUomConversionFactorDao.getCategory(),
                eUomConversionFactorDao.getFromUom(),
                eUomConversionFactorDao.getToUom(),
                eUomConversionFactorDao.getValue(),
                eUomConversionFactorDao.getUserTags(),
                eUomConversionFactorDao.getComments(),
                eUomConversionFactorDao.getAssign(),
                eUomConversionFactorDao.getLikedBy());
    }

    public static void fromDTO(UomConversionFactorDto vUomConversionFactorDto, UomConversionFactorDao eUomConversionFactorDao) {
        eUomConversionFactorDao.setName(vUomConversionFactorDto.name());
        eUomConversionFactorDao.setCreation(vUomConversionFactorDto.creation());
        eUomConversionFactorDao.setModified(vUomConversionFactorDto.modified());
        eUomConversionFactorDao.setModifiedBy(vUomConversionFactorDto.modifiedBy());
        eUomConversionFactorDao.setOwner(vUomConversionFactorDto.owner());
        eUomConversionFactorDao.setIsDocStatus(vUomConversionFactorDto.isDocStatus());
        eUomConversionFactorDao.setIdx(vUomConversionFactorDto.idx());
        eUomConversionFactorDao.setCategory(vUomConversionFactorDto.category());
        eUomConversionFactorDao.setFromUom(vUomConversionFactorDto.fromUom());
        eUomConversionFactorDao.setToUom(vUomConversionFactorDto.toUom());
        eUomConversionFactorDao.setValue(vUomConversionFactorDto.value());
        eUomConversionFactorDao.setUserTags(vUomConversionFactorDto.userTags());
        eUomConversionFactorDao.setComments(vUomConversionFactorDto.comments());
        eUomConversionFactorDao.setAssign(vUomConversionFactorDto.assign());
        eUomConversionFactorDao.setLikedBy(vUomConversionFactorDto.likedBy());
    }
}