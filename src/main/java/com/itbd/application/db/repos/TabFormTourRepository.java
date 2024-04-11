package com.itbd.application.db.repos;


import com.itbd.application.db.dao.FormTourDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabFormTourRepository extends JpaRepository<FormTourDao, String>, JpaSpecificationExecutor<FormTourDao> {
}
