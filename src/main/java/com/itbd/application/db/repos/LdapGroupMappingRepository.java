package com.itbd.application.db.repos;


import com.itbd.application.db.dao.integrations.LdapGroupMappingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LdapGroupMappingRepository extends JpaRepository<LdapGroupMappingDao, String>, JpaSpecificationExecutor<LdapGroupMappingDao> {
}
