package com.itbd.application.db.repos;


import com.itbd.application.db.dao.doctypes.DocTypeActionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DocTypeActionRepository extends JpaRepository<DocTypeActionDao, String>, JpaSpecificationExecutor<DocTypeActionDao> {
}
