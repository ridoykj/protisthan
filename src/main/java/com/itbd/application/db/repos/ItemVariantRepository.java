package com.itbd.application.db.repos;


import com.itbd.application.db.dao.items.ItemVariantDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemVariantRepository extends JpaRepository<ItemVariantDao, String>, JpaSpecificationExecutor<ItemVariantDao> {
}
