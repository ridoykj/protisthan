package com.itbd.application.db.dto.oauths;

import com.itbd.application.db.dao.oauths.OauthScopeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record OauthScopeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String scope,
        String parent,
        String parentField,
        String parentType
) {
    public static OauthScopeDto fromEntity(OauthScopeDao eOauthScopeDao) {
        return new OauthScopeDto(
                eOauthScopeDao.getName(),
                eOauthScopeDao.getCreation(),
                eOauthScopeDao.getModified(),
                eOauthScopeDao.getModifiedBy(),
                eOauthScopeDao.getOwner(),
                eOauthScopeDao.getIsDocStatus(),
                eOauthScopeDao.getIdx(),
                eOauthScopeDao.getScope(),
                eOauthScopeDao.getParent(),
                eOauthScopeDao.getParentField(),
                eOauthScopeDao.getParentType());
    }

    public static void fromDTO(OauthScopeDto vOauthScopeDto, OauthScopeDao eOauthScopeDao) {
        eOauthScopeDao.setName(vOauthScopeDto.name());
        eOauthScopeDao.setCreation(vOauthScopeDto.creation());
        eOauthScopeDao.setModified(vOauthScopeDto.modified());
        eOauthScopeDao.setModifiedBy(vOauthScopeDto.modifiedBy());
        eOauthScopeDao.setOwner(vOauthScopeDto.owner());
        eOauthScopeDao.setIsDocStatus(vOauthScopeDto.isDocStatus());
        eOauthScopeDao.setIdx(vOauthScopeDto.idx());
        eOauthScopeDao.setScope(vOauthScopeDto.scope());
        eOauthScopeDao.setParent(vOauthScopeDto.parent());
        eOauthScopeDao.setParentField(vOauthScopeDto.parentField());
        eOauthScopeDao.setParentType(vOauthScopeDto.parentType());
    }
}