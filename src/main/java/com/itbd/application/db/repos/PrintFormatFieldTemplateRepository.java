package com.itbd.application.db.repos;


import com.itbd.application.db.dao.printing.PrintFormatFieldTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PrintFormatFieldTemplateRepository extends JpaRepository<PrintFormatFieldTemplateDao, String>, JpaSpecificationExecutor<PrintFormatFieldTemplateDao> {
}
