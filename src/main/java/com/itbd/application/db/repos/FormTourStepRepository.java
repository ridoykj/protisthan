package com.itbd.application.db.repos;


import com.itbd.application.db.dao.FormTourStepDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface FormTourStepRepository extends JpaRepository<FormTourStepDao, String>, JpaSpecificationExecutor<FormTourStepDao> {
}
