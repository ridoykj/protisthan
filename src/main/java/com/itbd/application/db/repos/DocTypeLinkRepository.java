package com.itbd.application.db.repos;


import com.itbd.application.db.dao.doctypes.DocTypeLinkDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DocTypeLinkRepository extends JpaRepository<DocTypeLinkDao, String>, JpaSpecificationExecutor<DocTypeLinkDao> {
}
