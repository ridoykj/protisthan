package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.contract.ContractDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ContractRepository extends JpaRepository<ContractDao, String>, JpaSpecificationExecutor<ContractDao> {
}
