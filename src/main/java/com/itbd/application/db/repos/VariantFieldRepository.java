package com.itbd.application.db.repos;


import com.itbd.application.db.dao.VariantFieldDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface VariantFieldRepository extends JpaRepository<VariantFieldDao, String>, JpaSpecificationExecutor<VariantFieldDao> {
}
