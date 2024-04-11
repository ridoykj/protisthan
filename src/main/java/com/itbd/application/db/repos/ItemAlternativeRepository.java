package com.itbd.application.db.repos;

import com.itbd.application.db.dao.items.ItemAlternativeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemAlternativeRepository extends JpaRepository<ItemAlternativeDao, String>, JpaSpecificationExecutor<ItemAlternativeDao> {
}
