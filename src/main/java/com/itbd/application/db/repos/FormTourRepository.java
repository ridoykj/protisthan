package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.FormTourDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface FormTourRepository extends JpaRepository<FormTourDao, String>, JpaSpecificationExecutor<FormTourDao> {
}
