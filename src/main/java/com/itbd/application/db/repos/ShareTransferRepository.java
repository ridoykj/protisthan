package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.ShareTransferDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShareTransferRepository extends JpaRepository<ShareTransferDao, String>, JpaSpecificationExecutor<ShareTransferDao> {
}
