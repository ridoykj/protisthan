package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.ItemTaxTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemTaxTemplateRepository extends JpaRepository<ItemTaxTemplateDao, String>, JpaSpecificationExecutor<ItemTaxTemplateDao> {
}
