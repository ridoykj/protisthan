package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AboutUsTeamMemberDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AboutUsTeamMemberRepository extends JpaRepository<AboutUsTeamMemberDao, String>, JpaSpecificationExecutor<AboutUsTeamMemberDao> {
}
