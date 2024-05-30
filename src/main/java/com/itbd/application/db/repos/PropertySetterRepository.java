package com.itbd.application.db.repos;


import com.itbd.application.db.dao.custom.PropertySetterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PropertySetterRepository extends JpaRepository<PropertySetterDao, String>, JpaSpecificationExecutor<PropertySetterDao> {
}
