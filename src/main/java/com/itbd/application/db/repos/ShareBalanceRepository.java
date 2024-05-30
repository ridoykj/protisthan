package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.ShareBalanceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShareBalanceRepository extends JpaRepository<ShareBalanceDao, String>, JpaSpecificationExecutor<ShareBalanceDao> {
}
