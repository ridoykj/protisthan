package com.itbd.application.db.repos;

import com.itbd.application.db.dao.setup.IncotermDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface IncotermRepository extends JpaRepository<IncotermDao, String>, JpaSpecificationExecutor<IncotermDao> {
}
