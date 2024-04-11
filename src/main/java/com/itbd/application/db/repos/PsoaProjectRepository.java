package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PsoaProjectDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PsoaProjectRepository extends JpaRepository<PsoaProjectDao, String>, JpaSpecificationExecutor<PsoaProjectDao> {
}
