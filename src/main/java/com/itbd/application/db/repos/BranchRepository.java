package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.BranchDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BranchRepository extends JpaRepository<BranchDao, String>, JpaSpecificationExecutor<BranchDao> {
}
