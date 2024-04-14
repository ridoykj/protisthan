package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ClientScriptDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ClientScriptRepository extends JpaRepository<ClientScriptDao, String>, JpaSpecificationExecutor<ClientScriptDao> {
}
