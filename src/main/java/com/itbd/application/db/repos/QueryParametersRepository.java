package com.itbd.application.db.repos;


import com.itbd.application.db.dao.integrations.QueryParametersDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QueryParametersRepository extends JpaRepository<QueryParametersDao, String>, JpaSpecificationExecutor<QueryParametersDao> {
}
