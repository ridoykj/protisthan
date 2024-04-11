package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.component.WebFormListColumnDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebFormListColumnRepository extends JpaRepository<WebFormListColumnDao, Long>, JpaSpecificationExecutor<WebFormListColumnDao> {
}
