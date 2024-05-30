package com.itbd.application.db.dto;

import com.itbd.application.db.dao.setup.BrandDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BrandDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String brand,
        String image,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BrandDto fromEntity(BrandDao eBrandDao) {
        return new BrandDto(
                eBrandDao.getName(),
                eBrandDao.getCreation(),
                eBrandDao.getModified(),
                eBrandDao.getModifiedBy(),
                eBrandDao.getOwner(),
                eBrandDao.getIsDocStatus(),
                eBrandDao.getIdx(),
                eBrandDao.getBrand(),
                eBrandDao.getImage(),
                eBrandDao.getDescription(),
                eBrandDao.getUserTags(),
                eBrandDao.getComments(),
                eBrandDao.getAssign(),
                eBrandDao.getLikedBy());
    }

    public static void fromDTO(BrandDto vBrandDto, BrandDao eBrandDao) {
        eBrandDao.setName(vBrandDto.name());
        eBrandDao.setCreation(vBrandDto.creation());
        eBrandDao.setModified(vBrandDto.modified());
        eBrandDao.setModifiedBy(vBrandDto.modifiedBy());
        eBrandDao.setOwner(vBrandDto.owner());
        eBrandDao.setIsDocStatus(vBrandDto.isDocStatus());
        eBrandDao.setIdx(vBrandDto.idx());
        eBrandDao.setBrand(vBrandDto.brand());
        eBrandDao.setImage(vBrandDto.image());
        eBrandDao.setDescription(vBrandDto.description());
        eBrandDao.setUserTags(vBrandDto.userTags());
        eBrandDao.setComments(vBrandDto.comments());
        eBrandDao.setAssign(vBrandDto.assign());
        eBrandDao.setLikedBy(vBrandDto.likedBy());
    }
}