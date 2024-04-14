package com.itbd.application.db.dto.system;

import com.itbd.application.db.dao.system.UserSettingsDao;
import jakarta.persistence.Id;

public record UserSettingsDto(
        @Id
        String user,
        String docType,
        String data
) {
    public static UserSettingsDto fromEntity(UserSettingsDao eUserSettingsDao) {
        return new UserSettingsDto(
                eUserSettingsDao.getUser(),
                eUserSettingsDao.getDocType(),
                eUserSettingsDao.getData());
    }

    public static void fromDTO(UserSettingsDto vUserSettingsDto, UserSettingsDao eUserSettingsDao) {
        eUserSettingsDao.setUser(vUserSettingsDto.user());
        eUserSettingsDao.setDocType(vUserSettingsDto.docType());
        eUserSettingsDao.setData(vUserSettingsDto.data());
    }
}