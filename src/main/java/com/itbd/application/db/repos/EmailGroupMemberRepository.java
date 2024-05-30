package com.itbd.application.db.repos;


import com.itbd.application.db.dao.email.EmailGroupMemberDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailGroupMemberRepository extends JpaRepository<EmailGroupMemberDao, String>, JpaSpecificationExecutor<EmailGroupMemberDao> {
}
