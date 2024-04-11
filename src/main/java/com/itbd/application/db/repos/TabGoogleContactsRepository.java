package com.itbd.application.db.repos;


import com.itbd.application.db.dao.GoogleContactsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabGoogleContactsRepository extends JpaRepository<GoogleContactsDao, String>, JpaSpecificationExecutor<GoogleContactsDao> {
}
