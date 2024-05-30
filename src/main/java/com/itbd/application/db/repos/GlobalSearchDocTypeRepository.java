package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.GlobalSearchDocTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface GlobalSearchDocTypeRepository extends JpaRepository<GlobalSearchDocTypeDao, String>, JpaSpecificationExecutor<GlobalSearchDocTypeDao> {
}
