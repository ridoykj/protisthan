package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.DefaultValueDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DefaultValueRepository extends JpaRepository<DefaultValueDao, String>, JpaSpecificationExecutor<DefaultValueDao> {
}
