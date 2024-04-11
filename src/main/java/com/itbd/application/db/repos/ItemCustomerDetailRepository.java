package com.itbd.application.db.repos;


import com.itbd.application.db.dao.items.ItemCustomerDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemCustomerDetailRepository extends JpaRepository<ItemCustomerDetailDao, String>, JpaSpecificationExecutor<ItemCustomerDetailDao> {
}
