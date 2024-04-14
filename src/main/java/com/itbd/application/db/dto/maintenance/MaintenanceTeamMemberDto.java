package com.itbd.application.db.dto.maintenance;

import com.itbd.application.db.dao.maintenance.MaintenanceTeamMemberDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record MaintenanceTeamMemberDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String teamMember,
        String fullName,
        String maintenanceRole,
        String parent,
        String parentField,
        String parentType
) {
    public static MaintenanceTeamMemberDto fromEntity(MaintenanceTeamMemberDao eMaintenanceTeamMemberDao) {
        return new MaintenanceTeamMemberDto(
                eMaintenanceTeamMemberDao.getName(),
                eMaintenanceTeamMemberDao.getCreation(),
                eMaintenanceTeamMemberDao.getModified(),
                eMaintenanceTeamMemberDao.getModifiedBy(),
                eMaintenanceTeamMemberDao.getOwner(),
                eMaintenanceTeamMemberDao.getIsDocStatus(),
                eMaintenanceTeamMemberDao.getIdx(),
                eMaintenanceTeamMemberDao.getTeamMember(),
                eMaintenanceTeamMemberDao.getFullName(),
                eMaintenanceTeamMemberDao.getMaintenanceRole(),
                eMaintenanceTeamMemberDao.getParent(),
                eMaintenanceTeamMemberDao.getParentField(),
                eMaintenanceTeamMemberDao.getParentType());
    }

    public static void fromDTO(MaintenanceTeamMemberDto vMaintenanceTeamMemberDto, MaintenanceTeamMemberDao eMaintenanceTeamMemberDao) {
        eMaintenanceTeamMemberDao.setName(vMaintenanceTeamMemberDto.name());
        eMaintenanceTeamMemberDao.setCreation(vMaintenanceTeamMemberDto.creation());
        eMaintenanceTeamMemberDao.setModified(vMaintenanceTeamMemberDto.modified());
        eMaintenanceTeamMemberDao.setModifiedBy(vMaintenanceTeamMemberDto.modifiedBy());
        eMaintenanceTeamMemberDao.setOwner(vMaintenanceTeamMemberDto.owner());
        eMaintenanceTeamMemberDao.setIsDocStatus(vMaintenanceTeamMemberDto.isDocStatus());
        eMaintenanceTeamMemberDao.setIdx(vMaintenanceTeamMemberDto.idx());
        eMaintenanceTeamMemberDao.setTeamMember(vMaintenanceTeamMemberDto.teamMember());
        eMaintenanceTeamMemberDao.setFullName(vMaintenanceTeamMemberDto.fullName());
        eMaintenanceTeamMemberDao.setMaintenanceRole(vMaintenanceTeamMemberDto.maintenanceRole());
        eMaintenanceTeamMemberDao.setParent(vMaintenanceTeamMemberDto.parent());
        eMaintenanceTeamMemberDao.setParentField(vMaintenanceTeamMemberDto.parentField());
        eMaintenanceTeamMemberDao.setParentType(vMaintenanceTeamMemberDto.parentType());
    }
}