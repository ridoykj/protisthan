package com.itbd.application.db.repos;


import com.itbd.application.db.dao.customers.CustomerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomerRepository extends JpaRepository<CustomerDao, String>, JpaSpecificationExecutor<CustomerDao> {
}
