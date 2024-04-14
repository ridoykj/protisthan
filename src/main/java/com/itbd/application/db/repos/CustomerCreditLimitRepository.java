package com.itbd.application.db.repos;


import com.itbd.application.db.dao.customers.CustomerCreditLimitDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomerCreditLimitRepository extends JpaRepository<CustomerCreditLimitDao, String>, JpaSpecificationExecutor<CustomerCreditLimitDao> {
}
