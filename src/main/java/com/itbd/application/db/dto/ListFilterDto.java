package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ListFilterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ListFilterDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String filterName,
        String referenceDocType,
        String forUser,
        String filters,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ListFilterDto fromEntity(ListFilterDao eListFilterDao) {
        return new ListFilterDto(
                eListFilterDao.getName(),
                eListFilterDao.getCreation(),
                eListFilterDao.getModified(),
                eListFilterDao.getModifiedBy(),
                eListFilterDao.getOwner(),
                eListFilterDao.getIsDocStatus(),
                eListFilterDao.getIdx(),
                eListFilterDao.getFilterName(),
                eListFilterDao.getReferenceDocType(),
                eListFilterDao.getForUser(),
                eListFilterDao.getFilters(),
                eListFilterDao.getUserTags(),
                eListFilterDao.getComments(),
                eListFilterDao.getAssign(),
                eListFilterDao.getLikedBy());
    }

    public static void fromDTO(ListFilterDto vListFilterDto, ListFilterDao eListFilterDao) {
        eListFilterDao.setName(vListFilterDto.name());
        eListFilterDao.setCreation(vListFilterDto.creation());
        eListFilterDao.setModified(vListFilterDto.modified());
        eListFilterDao.setModifiedBy(vListFilterDto.modifiedBy());
        eListFilterDao.setOwner(vListFilterDto.owner());
        eListFilterDao.setIsDocStatus(vListFilterDto.isDocStatus());
        eListFilterDao.setIdx(vListFilterDto.idx());
        eListFilterDao.setFilterName(vListFilterDto.filterName());
        eListFilterDao.setReferenceDocType(vListFilterDto.referenceDocType());
        eListFilterDao.setForUser(vListFilterDto.forUser());
        eListFilterDao.setFilters(vListFilterDto.filters());
        eListFilterDao.setUserTags(vListFilterDto.userTags());
        eListFilterDao.setComments(vListFilterDto.comments());
        eListFilterDao.setAssign(vListFilterDto.assign());
        eListFilterDao.setLikedBy(vListFilterDto.likedBy());
    }
}