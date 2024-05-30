package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.CustomerGroupItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomerGroupItemRepository extends JpaRepository<CustomerGroupItemDao, String>, JpaSpecificationExecutor<CustomerGroupItemDao> {
}
