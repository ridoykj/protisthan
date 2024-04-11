package com.itbd.application.db.repos;


import com.itbd.application.db.dao.NumberCardLinkDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NumberCardLinkRepository extends JpaRepository<NumberCardLinkDao, String>, JpaSpecificationExecutor<NumberCardLinkDao> {
}
