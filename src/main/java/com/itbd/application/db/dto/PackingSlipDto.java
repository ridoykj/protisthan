package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PackingSlipDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PackingSlipDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String deliveryNote,
        String namingSeries,
        Integer fromCaseNo,
        Integer toCaseNo,
        BigDecimal netWeightPkg,
        String netWeightUom,
        BigDecimal grossWeightPkg,
        String grossWeightUom,
        String letterHead,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PackingSlipDto fromEntity(PackingSlipDao ePackingSlipDao) {
        return new PackingSlipDto(
                ePackingSlipDao.getName(),
                ePackingSlipDao.getCreation(),
                ePackingSlipDao.getModified(),
                ePackingSlipDao.getModifiedBy(),
                ePackingSlipDao.getOwner(),
                ePackingSlipDao.getIsDocStatus(),
                ePackingSlipDao.getIdx(),
                ePackingSlipDao.getDeliveryNote(),
                ePackingSlipDao.getNamingSeries(),
                ePackingSlipDao.getFromCaseNo(),
                ePackingSlipDao.getToCaseNo(),
                ePackingSlipDao.getNetWeightPkg(),
                ePackingSlipDao.getNetWeightUom(),
                ePackingSlipDao.getGrossWeightPkg(),
                ePackingSlipDao.getGrossWeightUom(),
                ePackingSlipDao.getLetterHead(),
                ePackingSlipDao.getAmendedFrom(),
                ePackingSlipDao.getUserTags(),
                ePackingSlipDao.getComments(),
                ePackingSlipDao.getAssign(),
                ePackingSlipDao.getLikedBy());
    }

    public static void fromDTO(PackingSlipDto vPackingSlipDto, PackingSlipDao ePackingSlipDao) {
        ePackingSlipDao.setName(vPackingSlipDto.name());
        ePackingSlipDao.setCreation(vPackingSlipDto.creation());
        ePackingSlipDao.setModified(vPackingSlipDto.modified());
        ePackingSlipDao.setModifiedBy(vPackingSlipDto.modifiedBy());
        ePackingSlipDao.setOwner(vPackingSlipDto.owner());
        ePackingSlipDao.setIsDocStatus(vPackingSlipDto.isDocStatus());
        ePackingSlipDao.setIdx(vPackingSlipDto.idx());
        ePackingSlipDao.setDeliveryNote(vPackingSlipDto.deliveryNote());
        ePackingSlipDao.setNamingSeries(vPackingSlipDto.namingSeries());
        ePackingSlipDao.setFromCaseNo(vPackingSlipDto.fromCaseNo());
        ePackingSlipDao.setToCaseNo(vPackingSlipDto.toCaseNo());
        ePackingSlipDao.setNetWeightPkg(vPackingSlipDto.netWeightPkg());
        ePackingSlipDao.setNetWeightUom(vPackingSlipDto.netWeightUom());
        ePackingSlipDao.setGrossWeightPkg(vPackingSlipDto.grossWeightPkg());
        ePackingSlipDao.setGrossWeightUom(vPackingSlipDto.grossWeightUom());
        ePackingSlipDao.setLetterHead(vPackingSlipDto.letterHead());
        ePackingSlipDao.setAmendedFrom(vPackingSlipDto.amendedFrom());
        ePackingSlipDao.setUserTags(vPackingSlipDto.userTags());
        ePackingSlipDao.setComments(vPackingSlipDto.comments());
        ePackingSlipDao.setAssign(vPackingSlipDto.assign());
        ePackingSlipDao.setLikedBy(vPackingSlipDto.likedBy());
    }
}