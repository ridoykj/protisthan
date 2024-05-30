package com.itbd.application.db.dto;

import com.itbd.application.db.dao.website.TopBarItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TopBarItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String label,
        String url,
        Boolean openInNewTab,
        Boolean right,
        String parentLabel,
        String parent,
        String parentField,
        String parentType
) {
    public static TopBarItemDto fromEntity(TopBarItemDao eTopBarItemDao) {
        return new TopBarItemDto(
                eTopBarItemDao.getName(),
                eTopBarItemDao.getCreation(),
                eTopBarItemDao.getModified(),
                eTopBarItemDao.getModifiedBy(),
                eTopBarItemDao.getOwner(),
                eTopBarItemDao.getIsDocStatus(),
                eTopBarItemDao.getIdx(),
                eTopBarItemDao.getLabel(),
                eTopBarItemDao.getUrl(),
                eTopBarItemDao.getOpenInNewTab(),
                eTopBarItemDao.getRight(),
                eTopBarItemDao.getParentLabel(),
                eTopBarItemDao.getParent(),
                eTopBarItemDao.getParentField(),
                eTopBarItemDao.getParentType());
    }

    public static void fromDTO(TopBarItemDto vTopBarItemDto, TopBarItemDao eTopBarItemDao) {
        eTopBarItemDao.setName(vTopBarItemDto.name());
        eTopBarItemDao.setCreation(vTopBarItemDto.creation());
        eTopBarItemDao.setModified(vTopBarItemDto.modified());
        eTopBarItemDao.setModifiedBy(vTopBarItemDto.modifiedBy());
        eTopBarItemDao.setOwner(vTopBarItemDto.owner());
        eTopBarItemDao.setIsDocStatus(vTopBarItemDto.isDocStatus());
        eTopBarItemDao.setIdx(vTopBarItemDto.idx());
        eTopBarItemDao.setLabel(vTopBarItemDto.label());
        eTopBarItemDao.setUrl(vTopBarItemDto.url());
        eTopBarItemDao.setOpenInNewTab(vTopBarItemDto.openInNewTab());
        eTopBarItemDao.setRight(vTopBarItemDto.right());
        eTopBarItemDao.setParentLabel(vTopBarItemDto.parentLabel());
        eTopBarItemDao.setParent(vTopBarItemDto.parent());
        eTopBarItemDao.setParentField(vTopBarItemDto.parentField());
        eTopBarItemDao.setParentType(vTopBarItemDto.parentType());
    }
}