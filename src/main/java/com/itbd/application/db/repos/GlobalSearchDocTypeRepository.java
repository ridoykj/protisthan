package com.itbd.application.db.repos;


import com.itbd.application.db.dao.GlobalSearchDocTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabGlobalSearchDocTypeRepository extends JpaRepository<GlobalSearchDocTypeDao, String>, JpaSpecificationExecutor<GlobalSearchDocTypeDao> {
}
