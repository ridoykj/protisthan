package com.itbd.application.db.repos;


import com.itbd.application.db.dao.UaeVatAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UaeVatAccountRepository extends JpaRepository<UaeVatAccountDao, String>, JpaSpecificationExecutor<UaeVatAccountDao> {
}
