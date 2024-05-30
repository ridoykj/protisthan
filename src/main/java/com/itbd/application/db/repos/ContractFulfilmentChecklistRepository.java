package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.contract.ContractFulfilmentChecklistDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ContractFulfilmentChecklistRepository extends JpaRepository<ContractFulfilmentChecklistDao, String>, JpaSpecificationExecutor<ContractFulfilmentChecklistDao> {
}
