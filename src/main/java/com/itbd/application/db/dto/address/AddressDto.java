package com.itbd.application.db.dto.address;

import com.itbd.application.db.dao.address.AddressDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AddressDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String addressTitle,
        String addressType,
        String addressLine1,
        String addressLine2,
        String city,
        String county,
        String state,
        String country,
        String pinCode,
        String emailId,
        String phone,
        String fax,
        Boolean isPrimaryAddress,
        Boolean isShippingAddress,
        Boolean disabled,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String taxCategory,
        Boolean isYourCompanyAddress
) {
    public static AddressDto fromEntity(AddressDao eAddressDao) {
        return new AddressDto(
                eAddressDao.getName(),
                eAddressDao.getCreation(),
                eAddressDao.getModified(),
                eAddressDao.getModifiedBy(),
                eAddressDao.getOwner(),
                eAddressDao.getIsDocStatus(),
                eAddressDao.getIdx(),
                eAddressDao.getAddressTitle(),
                eAddressDao.getAddressType(),
                eAddressDao.getAddressLine1(),
                eAddressDao.getAddressLine2(),
                eAddressDao.getCity(),
                eAddressDao.getCounty(),
                eAddressDao.getState(),
                eAddressDao.getCountry(),
                eAddressDao.getPinCode(),
                eAddressDao.getEmailId(),
                eAddressDao.getPhone(),
                eAddressDao.getFax(),
                eAddressDao.getIsPrimaryAddress(),
                eAddressDao.getIsShippingAddress(),
                eAddressDao.getDisabled(),
                eAddressDao.getUserTags(),
                eAddressDao.getComments(),
                eAddressDao.getAssign(),
                eAddressDao.getLikedBy(),
                eAddressDao.getTaxCategory(),
                eAddressDao.getIsYourCompanyAddress());
    }

    public static void fromDTO(AddressDto vAddressDto, AddressDao eAddressDao) {
        eAddressDao.setName(vAddressDto.name());
        eAddressDao.setCreation(vAddressDto.creation());
        eAddressDao.setModified(vAddressDto.modified());
        eAddressDao.setModifiedBy(vAddressDto.modifiedBy());
        eAddressDao.setOwner(vAddressDto.owner());
        eAddressDao.setIsDocStatus(vAddressDto.isDocStatus());
        eAddressDao.setIdx(vAddressDto.idx());
        eAddressDao.setAddressTitle(vAddressDto.addressTitle());
        eAddressDao.setAddressType(vAddressDto.addressType());
        eAddressDao.setAddressLine1(vAddressDto.addressLine1());
        eAddressDao.setAddressLine2(vAddressDto.addressLine2());
        eAddressDao.setCity(vAddressDto.city());
        eAddressDao.setCounty(vAddressDto.county());
        eAddressDao.setState(vAddressDto.state());
        eAddressDao.setCountry(vAddressDto.country());
        eAddressDao.setPinCode(vAddressDto.pinCode());
        eAddressDao.setEmailId(vAddressDto.emailId());
        eAddressDao.setPhone(vAddressDto.phone());
        eAddressDao.setFax(vAddressDto.fax());
        eAddressDao.setIsPrimaryAddress(vAddressDto.isPrimaryAddress());
        eAddressDao.setIsShippingAddress(vAddressDto.isShippingAddress());
        eAddressDao.setDisabled(vAddressDto.disabled());
        eAddressDao.setUserTags(vAddressDto.userTags());
        eAddressDao.setComments(vAddressDto.comments());
        eAddressDao.setAssign(vAddressDto.assign());
        eAddressDao.setLikedBy(vAddressDto.likedBy());
        eAddressDao.setTaxCategory(vAddressDto.taxCategory());
        eAddressDao.setIsYourCompanyAddress(vAddressDto.isYourCompanyAddress());
    }
}