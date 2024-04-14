package com.itbd.application.db.dto;

import com.itbd.application.db.dao.LdapGroupMappingDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record LdapGroupMappingDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String ldapGroup,
        String erpnextRole,
        String parent,
        String parentField,
        String parentType
) {
    public static LdapGroupMappingDto fromEntity(LdapGroupMappingDao eLdapGroupMappingDao) {
        return new LdapGroupMappingDto(
                eLdapGroupMappingDao.getName(),
                eLdapGroupMappingDao.getCreation(),
                eLdapGroupMappingDao.getModified(),
                eLdapGroupMappingDao.getModifiedBy(),
                eLdapGroupMappingDao.getOwner(),
                eLdapGroupMappingDao.getIsDocStatus(),
                eLdapGroupMappingDao.getIdx(),
                eLdapGroupMappingDao.getLdapGroup(),
                eLdapGroupMappingDao.getErpnextRole(),
                eLdapGroupMappingDao.getParent(),
                eLdapGroupMappingDao.getParentField(),
                eLdapGroupMappingDao.getParentType());
    }

    public static void fromDTO(LdapGroupMappingDto vLdapGroupMappingDto, LdapGroupMappingDao eLdapGroupMappingDao) {
        eLdapGroupMappingDao.setName(vLdapGroupMappingDto.name());
        eLdapGroupMappingDao.setCreation(vLdapGroupMappingDto.creation());
        eLdapGroupMappingDao.setModified(vLdapGroupMappingDto.modified());
        eLdapGroupMappingDao.setModifiedBy(vLdapGroupMappingDto.modifiedBy());
        eLdapGroupMappingDao.setOwner(vLdapGroupMappingDto.owner());
        eLdapGroupMappingDao.setIsDocStatus(vLdapGroupMappingDto.isDocStatus());
        eLdapGroupMappingDao.setIdx(vLdapGroupMappingDto.idx());
        eLdapGroupMappingDao.setLdapGroup(vLdapGroupMappingDto.ldapGroup());
        eLdapGroupMappingDao.setErpnextRole(vLdapGroupMappingDto.erpnextRole());
        eLdapGroupMappingDao.setParent(vLdapGroupMappingDto.parent());
        eLdapGroupMappingDao.setParentField(vLdapGroupMappingDto.parentField());
        eLdapGroupMappingDao.setParentType(vLdapGroupMappingDto.parentType());
    }
}