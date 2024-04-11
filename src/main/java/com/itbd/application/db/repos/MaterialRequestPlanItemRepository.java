package com.itbd.application.db.repos;


import com.itbd.application.db.dao.materials.MaterialRequestPlanItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MaterialRequestPlanItemRepository extends JpaRepository<MaterialRequestPlanItemDao, String>, JpaSpecificationExecutor<MaterialRequestPlanItemDao> {
}
