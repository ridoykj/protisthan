package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.supplier.SupplierGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SupplierGroupDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String supplierGroupName,
        String parentSupplierGroup,
        Boolean isGroup,
        String paymentTerms,
        Integer lft,
        Integer rgt,
        String oldParent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SupplierGroupDto fromEntity(SupplierGroupDao eSupplierGroupDao) {
        return new SupplierGroupDto(
                eSupplierGroupDao.getName(),
                eSupplierGroupDao.getCreation(),
                eSupplierGroupDao.getModified(),
                eSupplierGroupDao.getModifiedBy(),
                eSupplierGroupDao.getOwner(),
                eSupplierGroupDao.getIsDocStatus(),
                eSupplierGroupDao.getIdx(),
                eSupplierGroupDao.getSupplierGroupName(),
                eSupplierGroupDao.getParentSupplierGroup(),
                eSupplierGroupDao.getIsGroup(),
                eSupplierGroupDao.getPaymentTerms(),
                eSupplierGroupDao.getLft(),
                eSupplierGroupDao.getRgt(),
                eSupplierGroupDao.getOldParent(),
                eSupplierGroupDao.getUserTags(),
                eSupplierGroupDao.getComments(),
                eSupplierGroupDao.getAssign(),
                eSupplierGroupDao.getLikedBy());
    }

    public static void fromDTO(SupplierGroupDto vSupplierGroupDto, SupplierGroupDao eSupplierGroupDao) {
        eSupplierGroupDao.setName(vSupplierGroupDto.name());
        eSupplierGroupDao.setCreation(vSupplierGroupDto.creation());
        eSupplierGroupDao.setModified(vSupplierGroupDto.modified());
        eSupplierGroupDao.setModifiedBy(vSupplierGroupDto.modifiedBy());
        eSupplierGroupDao.setOwner(vSupplierGroupDto.owner());
        eSupplierGroupDao.setIsDocStatus(vSupplierGroupDto.isDocStatus());
        eSupplierGroupDao.setIdx(vSupplierGroupDto.idx());
        eSupplierGroupDao.setSupplierGroupName(vSupplierGroupDto.supplierGroupName());
        eSupplierGroupDao.setParentSupplierGroup(vSupplierGroupDto.parentSupplierGroup());
        eSupplierGroupDao.setIsGroup(vSupplierGroupDto.isGroup());
        eSupplierGroupDao.setPaymentTerms(vSupplierGroupDto.paymentTerms());
        eSupplierGroupDao.setLft(vSupplierGroupDto.lft());
        eSupplierGroupDao.setRgt(vSupplierGroupDto.rgt());
        eSupplierGroupDao.setOldParent(vSupplierGroupDto.oldParent());
        eSupplierGroupDao.setUserTags(vSupplierGroupDto.userTags());
        eSupplierGroupDao.setComments(vSupplierGroupDto.comments());
        eSupplierGroupDao.setAssign(vSupplierGroupDto.assign());
        eSupplierGroupDao.setLikedBy(vSupplierGroupDto.likedBy());
    }
}