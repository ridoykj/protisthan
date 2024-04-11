package com.itbd.application.db.repos;


import com.itbd.application.db.dao.subcontracting.SubcontractingBomDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubcontractingBomRepository extends JpaRepository<SubcontractingBomDao, String>, JpaSpecificationExecutor<SubcontractingBomDao> {
}
