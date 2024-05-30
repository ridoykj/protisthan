package com.itbd.application.db.dto.address;

import com.itbd.application.db.dao.contacts.AddressTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AddressTemplateDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String country,
        Boolean isDefault,
        String template,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AddressTemplateDto fromEntity(AddressTemplateDao eAddressTemplateDao) {
        return new AddressTemplateDto(
                eAddressTemplateDao.getName(),
                eAddressTemplateDao.getCreation(),
                eAddressTemplateDao.getModified(),
                eAddressTemplateDao.getModifiedBy(),
                eAddressTemplateDao.getOwner(),
                eAddressTemplateDao.getIsDocStatus(),
                eAddressTemplateDao.getIdx(),
                eAddressTemplateDao.getCountry(),
                eAddressTemplateDao.getIsDefault(),
                eAddressTemplateDao.getTemplate(),
                eAddressTemplateDao.getUserTags(),
                eAddressTemplateDao.getComments(),
                eAddressTemplateDao.getAssign(),
                eAddressTemplateDao.getLikedBy());
    }

    public static void fromDTO(AddressTemplateDto vAddressTemplateDto, AddressTemplateDao eAddressTemplateDao) {
        eAddressTemplateDao.setName(vAddressTemplateDto.name());
        eAddressTemplateDao.setCreation(vAddressTemplateDto.creation());
        eAddressTemplateDao.setModified(vAddressTemplateDto.modified());
        eAddressTemplateDao.setModifiedBy(vAddressTemplateDto.modifiedBy());
        eAddressTemplateDao.setOwner(vAddressTemplateDto.owner());
        eAddressTemplateDao.setIsDocStatus(vAddressTemplateDto.isDocStatus());
        eAddressTemplateDao.setIdx(vAddressTemplateDto.idx());
        eAddressTemplateDao.setCountry(vAddressTemplateDto.country());
        eAddressTemplateDao.setIsDefault(vAddressTemplateDto.isDefault());
        eAddressTemplateDao.setTemplate(vAddressTemplateDto.template());
        eAddressTemplateDao.setUserTags(vAddressTemplateDto.userTags());
        eAddressTemplateDao.setComments(vAddressTemplateDto.comments());
        eAddressTemplateDao.setAssign(vAddressTemplateDto.assign());
        eAddressTemplateDao.setLikedBy(vAddressTemplateDto.likedBy());
    }
}