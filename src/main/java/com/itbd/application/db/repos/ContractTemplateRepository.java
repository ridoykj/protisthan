package com.itbd.application.db.repos;


import com.itbd.application.db.dao.contracts.ContractTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ContractTemplateRepository extends JpaRepository<ContractTemplateDao, String>, JpaSpecificationExecutor<ContractTemplateDao> {
}
