package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DefaultValueDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDefaultValueRepository extends JpaRepository<DefaultValueDao, String>, JpaSpecificationExecutor<DefaultValueDao> {
}
