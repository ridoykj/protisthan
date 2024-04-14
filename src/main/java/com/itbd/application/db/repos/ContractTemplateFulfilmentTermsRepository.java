package com.itbd.application.db.repos;


import com.itbd.application.db.dao.contracts.ContractTemplateFulfilmentTermsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ContractTemplateFulfilmentTermsRepository extends JpaRepository<ContractTemplateFulfilmentTermsDao, String>, JpaSpecificationExecutor<ContractTemplateFulfilmentTermsDao> {
}
