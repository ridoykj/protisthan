package com.itbd.application.db.repos;


import com.itbd.application.db.dao.contracts.ContractFulfilmentChecklistDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabContractFulfilmentChecklistRepository extends JpaRepository<ContractFulfilmentChecklistDao, String>, JpaSpecificationExecutor<ContractFulfilmentChecklistDao> {
}
