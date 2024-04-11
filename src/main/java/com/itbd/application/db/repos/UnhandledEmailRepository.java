package com.itbd.application.db.repos;


import com.itbd.application.db.dao.UnhandledEmailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UnhandledEmailRepository extends JpaRepository<UnhandledEmailDao, String>, JpaSpecificationExecutor<UnhandledEmailDao> {
}
