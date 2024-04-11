package com.itbd.application.db.repos;


import com.itbd.application.db.dao.shares.ShareTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShareTypeRepository extends JpaRepository<ShareTypeDao, String>, JpaSpecificationExecutor<ShareTypeDao> {
}
