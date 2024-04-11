package com.itbd.application.db.repos;


import com.itbd.application.db.dao.users.UserGroupMemberDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserGroupMemberRepository extends JpaRepository<UserGroupMemberDao, String>, JpaSpecificationExecutor<UserGroupMemberDao> {
}
