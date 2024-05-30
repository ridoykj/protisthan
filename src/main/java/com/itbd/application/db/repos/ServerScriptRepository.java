package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.ServerScriptDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ServerScriptRepository extends JpaRepository<ServerScriptDao, String>, JpaSpecificationExecutor<ServerScriptDao> {
}
