package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.user.UserSelectDocumentTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserSelectDocumentTypeRepository extends JpaRepository<UserSelectDocumentTypeDao, String>, JpaSpecificationExecutor<UserSelectDocumentTypeDao> {
}
