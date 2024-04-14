package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemGroupDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemGroupName,
        String parentItemGroup,
        Boolean isGroup,
        String image,
        Integer lft,
        String oldParent,
        Integer rgt,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ItemGroupDto fromEntity(ItemGroupDao eItemGroupDao) {
        return new ItemGroupDto(
                eItemGroupDao.getName(),
                eItemGroupDao.getCreation(),
                eItemGroupDao.getModified(),
                eItemGroupDao.getModifiedBy(),
                eItemGroupDao.getOwner(),
                eItemGroupDao.getIsDocStatus(),
                eItemGroupDao.getIdx(),
                eItemGroupDao.getItemGroupName(),
                eItemGroupDao.getParentItemGroup(),
                eItemGroupDao.getIsGroup(),
                eItemGroupDao.getImage(),
                eItemGroupDao.getLft(),
                eItemGroupDao.getOldParent(),
                eItemGroupDao.getRgt(),
                eItemGroupDao.getUserTags(),
                eItemGroupDao.getComments(),
                eItemGroupDao.getAssign(),
                eItemGroupDao.getLikedBy());
    }

    public static void fromDTO(ItemGroupDto vItemGroupDto, ItemGroupDao eItemGroupDao) {
        eItemGroupDao.setName(vItemGroupDto.name());
        eItemGroupDao.setCreation(vItemGroupDto.creation());
        eItemGroupDao.setModified(vItemGroupDto.modified());
        eItemGroupDao.setModifiedBy(vItemGroupDto.modifiedBy());
        eItemGroupDao.setOwner(vItemGroupDto.owner());
        eItemGroupDao.setIsDocStatus(vItemGroupDto.isDocStatus());
        eItemGroupDao.setIdx(vItemGroupDto.idx());
        eItemGroupDao.setItemGroupName(vItemGroupDto.itemGroupName());
        eItemGroupDao.setParentItemGroup(vItemGroupDto.parentItemGroup());
        eItemGroupDao.setIsGroup(vItemGroupDto.isGroup());
        eItemGroupDao.setImage(vItemGroupDto.image());
        eItemGroupDao.setLft(vItemGroupDto.lft());
        eItemGroupDao.setOldParent(vItemGroupDto.oldParent());
        eItemGroupDao.setRgt(vItemGroupDto.rgt());
        eItemGroupDao.setUserTags(vItemGroupDto.userTags());
        eItemGroupDao.setComments(vItemGroupDto.comments());
        eItemGroupDao.setAssign(vItemGroupDto.assign());
        eItemGroupDao.setLikedBy(vItemGroupDto.likedBy());
    }
}