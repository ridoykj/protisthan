package com.itbd.application.db.repos;


import com.itbd.application.db.dao.items.ItemVariantAttributeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemVariantAttributeRepository extends JpaRepository<ItemVariantAttributeDao, String>, JpaSpecificationExecutor<ItemVariantAttributeDao> {
}
