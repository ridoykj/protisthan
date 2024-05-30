package com.itbd.application.db.repos;


import com.itbd.application.db.dao.integrations.ConnectedAppDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ConnectedAppRepository extends JpaRepository<ConnectedAppDao, String>, JpaSpecificationExecutor<ConnectedAppDao> {
}
