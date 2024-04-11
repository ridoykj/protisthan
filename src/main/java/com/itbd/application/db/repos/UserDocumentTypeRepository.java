package com.itbd.application.db.repos;


import com.itbd.application.db.dao.users.UserDocumentTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserDocumentTypeRepository extends JpaRepository<UserDocumentTypeDao, String>, JpaSpecificationExecutor<UserDocumentTypeDao> {
}
