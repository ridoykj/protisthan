package com.itbd.application.db.repos;


import com.itbd.application.db.dao.materials.MaterialRequestItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MaterialRequestItemRepository extends JpaRepository<MaterialRequestItemDao, String>, JpaSpecificationExecutor<MaterialRequestItemDao> {
}
