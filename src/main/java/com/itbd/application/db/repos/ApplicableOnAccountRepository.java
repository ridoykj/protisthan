package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.ApplicableOnAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ApplicableOnAccountRepository extends JpaRepository<ApplicableOnAccountDao, String>, JpaSpecificationExecutor<ApplicableOnAccountDao> {
}
