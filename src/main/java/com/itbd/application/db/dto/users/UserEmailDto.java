package com.itbd.application.db.dto.users;

import com.itbd.application.db.dao.users.UserEmailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UserEmailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String emailAccount,
        String emailId,
        Boolean awaitingPassword,
        Boolean usedOauth,
        Boolean enableOutgoing,
        String parent,
        String parentField,
        String parentType
) {
    public static UserEmailDto fromEntity(UserEmailDao eUserEmailDao) {
        return new UserEmailDto(
                eUserEmailDao.getName(),
                eUserEmailDao.getCreation(),
                eUserEmailDao.getModified(),
                eUserEmailDao.getModifiedBy(),
                eUserEmailDao.getOwner(),
                eUserEmailDao.getIsDocStatus(),
                eUserEmailDao.getIdx(),
                eUserEmailDao.getEmailAccount(),
                eUserEmailDao.getEmailId(),
                eUserEmailDao.getAwaitingPassword(),
                eUserEmailDao.getUsedOauth(),
                eUserEmailDao.getEnableOutgoing(),
                eUserEmailDao.getParent(),
                eUserEmailDao.getParentField(),
                eUserEmailDao.getParentType());
    }

    public static void fromDTO(UserEmailDto vUserEmailDto, UserEmailDao eUserEmailDao) {
        eUserEmailDao.setName(vUserEmailDto.name());
        eUserEmailDao.setCreation(vUserEmailDto.creation());
        eUserEmailDao.setModified(vUserEmailDto.modified());
        eUserEmailDao.setModifiedBy(vUserEmailDto.modifiedBy());
        eUserEmailDao.setOwner(vUserEmailDto.owner());
        eUserEmailDao.setIsDocStatus(vUserEmailDto.isDocStatus());
        eUserEmailDao.setIdx(vUserEmailDto.idx());
        eUserEmailDao.setEmailAccount(vUserEmailDto.emailAccount());
        eUserEmailDao.setEmailId(vUserEmailDto.emailId());
        eUserEmailDao.setAwaitingPassword(vUserEmailDto.awaitingPassword());
        eUserEmailDao.setUsedOauth(vUserEmailDto.usedOauth());
        eUserEmailDao.setEnableOutgoing(vUserEmailDto.enableOutgoing());
        eUserEmailDao.setParent(vUserEmailDto.parent());
        eUserEmailDao.setParentField(vUserEmailDto.parentField());
        eUserEmailDao.setParentType(vUserEmailDto.parentType());
    }
}