package com.itbd.application.db.repos;


import com.itbd.application.db.dao.items.ItemDefaultDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemDefaultRepository extends JpaRepository<ItemDefaultDao, String>, JpaSpecificationExecutor<ItemDefaultDao> {
}
