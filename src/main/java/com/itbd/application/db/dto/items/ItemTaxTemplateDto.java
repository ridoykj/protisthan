package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.accounts.ItemTaxTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemTaxTemplateDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String company,
        Boolean disabled,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ItemTaxTemplateDto fromEntity(ItemTaxTemplateDao eItemTaxTemplateDao) {
        return new ItemTaxTemplateDto(
                eItemTaxTemplateDao.getName(),
                eItemTaxTemplateDao.getCreation(),
                eItemTaxTemplateDao.getModified(),
                eItemTaxTemplateDao.getModifiedBy(),
                eItemTaxTemplateDao.getOwner(),
                eItemTaxTemplateDao.getIsDocStatus(),
                eItemTaxTemplateDao.getIdx(),
                eItemTaxTemplateDao.getTitle(),
                eItemTaxTemplateDao.getCompany(),
                eItemTaxTemplateDao.getDisabled(),
                eItemTaxTemplateDao.getUserTags(),
                eItemTaxTemplateDao.getComments(),
                eItemTaxTemplateDao.getAssign(),
                eItemTaxTemplateDao.getLikedBy());
    }

    public static void fromDTO(ItemTaxTemplateDto vItemTaxTemplateDto, ItemTaxTemplateDao eItemTaxTemplateDao) {
        eItemTaxTemplateDao.setName(vItemTaxTemplateDto.name());
        eItemTaxTemplateDao.setCreation(vItemTaxTemplateDto.creation());
        eItemTaxTemplateDao.setModified(vItemTaxTemplateDto.modified());
        eItemTaxTemplateDao.setModifiedBy(vItemTaxTemplateDto.modifiedBy());
        eItemTaxTemplateDao.setOwner(vItemTaxTemplateDto.owner());
        eItemTaxTemplateDao.setIsDocStatus(vItemTaxTemplateDto.isDocStatus());
        eItemTaxTemplateDao.setIdx(vItemTaxTemplateDto.idx());
        eItemTaxTemplateDao.setTitle(vItemTaxTemplateDto.title());
        eItemTaxTemplateDao.setCompany(vItemTaxTemplateDto.company());
        eItemTaxTemplateDao.setDisabled(vItemTaxTemplateDto.disabled());
        eItemTaxTemplateDao.setUserTags(vItemTaxTemplateDto.userTags());
        eItemTaxTemplateDao.setComments(vItemTaxTemplateDto.comments());
        eItemTaxTemplateDao.setAssign(vItemTaxTemplateDto.assign());
        eItemTaxTemplateDao.setLikedBy(vItemTaxTemplateDto.likedBy());
    }
}