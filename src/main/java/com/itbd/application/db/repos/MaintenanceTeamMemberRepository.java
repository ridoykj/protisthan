package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.MaintenanceTeamMemberDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MaintenanceTeamMemberRepository extends JpaRepository<MaintenanceTeamMemberDao, String>, JpaSpecificationExecutor<MaintenanceTeamMemberDao> {
}
