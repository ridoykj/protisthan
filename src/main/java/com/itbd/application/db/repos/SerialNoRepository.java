package com.itbd.application.db.repos;


import com.itbd.application.db.dao.SerialNoDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SerialNoRepository extends JpaRepository<SerialNoDao, String>, JpaSpecificationExecutor<SerialNoDao> {
}
