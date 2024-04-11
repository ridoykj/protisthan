package com.itbd.application.db.repos;


import com.itbd.application.db.dao.items.ItemTaxTemplateDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemTaxTemplateDetailRepository extends JpaRepository<ItemTaxTemplateDetailDao, String>, JpaSpecificationExecutor<ItemTaxTemplateDetailDao> {
}
