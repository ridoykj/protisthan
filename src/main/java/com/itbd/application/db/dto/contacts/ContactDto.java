package com.itbd.application.db.dto.contacts;

import com.itbd.application.db.dao.contacts.ContactDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ContactDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String firstName,
        String middleName,
        String lastName,
        String fullName,
        String emailId,
        String user,
        String address,
        Boolean syncWithGoogleContacts,
        String status,
        String salutation,
        String designation,
        String gender,
        String phone,
        String mobileNo,
        String companyName,
        String image,
        String googleContacts,
        String googleContactsId,
        Boolean pulledFromGoogleContacts,
        Boolean isPrimaryContact,
        String department,
        Boolean unsubscribed,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        Boolean isBillingContact
) {
    public static ContactDto fromEntity(ContactDao eContactDao) {
        return new ContactDto(
                eContactDao.getName(),
                eContactDao.getCreation(),
                eContactDao.getModified(),
                eContactDao.getModifiedBy(),
                eContactDao.getOwner(),
                eContactDao.getIsDocStatus(),
                eContactDao.getIdx(),
                eContactDao.getFirstName(),
                eContactDao.getMiddleName(),
                eContactDao.getLastName(),
                eContactDao.getFullName(),
                eContactDao.getEmailId(),
                eContactDao.getUser(),
                eContactDao.getAddress(),
                eContactDao.getSyncWithGoogleContacts(),
                eContactDao.getStatus(),
                eContactDao.getSalutation(),
                eContactDao.getDesignation(),
                eContactDao.getGender(),
                eContactDao.getPhone(),
                eContactDao.getMobileNo(),
                eContactDao.getCompanyName(),
                eContactDao.getImage(),
                eContactDao.getGoogleContacts(),
                eContactDao.getGoogleContactsId(),
                eContactDao.getPulledFromGoogleContacts(),
                eContactDao.getIsPrimaryContact(),
                eContactDao.getDepartment(),
                eContactDao.getUnsubscribed(),
                eContactDao.getUserTags(),
                eContactDao.getComments(),
                eContactDao.getAssign(),
                eContactDao.getLikedBy(),
                eContactDao.getIsBillingContact());
    }

    public static void fromDTO(ContactDto vContactDto, ContactDao eContactDao) {
        eContactDao.setName(vContactDto.name());
        eContactDao.setCreation(vContactDto.creation());
        eContactDao.setModified(vContactDto.modified());
        eContactDao.setModifiedBy(vContactDto.modifiedBy());
        eContactDao.setOwner(vContactDto.owner());
        eContactDao.setIsDocStatus(vContactDto.isDocStatus());
        eContactDao.setIdx(vContactDto.idx());
        eContactDao.setFirstName(vContactDto.firstName());
        eContactDao.setMiddleName(vContactDto.middleName());
        eContactDao.setLastName(vContactDto.lastName());
        eContactDao.setFullName(vContactDto.fullName());
        eContactDao.setEmailId(vContactDto.emailId());
        eContactDao.setUser(vContactDto.user());
        eContactDao.setAddress(vContactDto.address());
        eContactDao.setSyncWithGoogleContacts(vContactDto.syncWithGoogleContacts());
        eContactDao.setStatus(vContactDto.status());
        eContactDao.setSalutation(vContactDto.salutation());
        eContactDao.setDesignation(vContactDto.designation());
        eContactDao.setGender(vContactDto.gender());
        eContactDao.setPhone(vContactDto.phone());
        eContactDao.setMobileNo(vContactDto.mobileNo());
        eContactDao.setCompanyName(vContactDto.companyName());
        eContactDao.setImage(vContactDto.image());
        eContactDao.setGoogleContacts(vContactDto.googleContacts());
        eContactDao.setGoogleContactsId(vContactDto.googleContactsId());
        eContactDao.setPulledFromGoogleContacts(vContactDto.pulledFromGoogleContacts());
        eContactDao.setIsPrimaryContact(vContactDto.isPrimaryContact());
        eContactDao.setDepartment(vContactDto.department());
        eContactDao.setUnsubscribed(vContactDto.unsubscribed());
        eContactDao.setUserTags(vContactDto.userTags());
        eContactDao.setComments(vContactDto.comments());
        eContactDao.setAssign(vContactDto.assign());
        eContactDao.setLikedBy(vContactDto.likedBy());
        eContactDao.setIsBillingContact(vContactDto.isBillingContact());
    }
}