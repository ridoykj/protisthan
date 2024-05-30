package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.ShareholderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShareholderRepository extends JpaRepository<ShareholderDao, String>, JpaSpecificationExecutor<ShareholderDao> {
}
