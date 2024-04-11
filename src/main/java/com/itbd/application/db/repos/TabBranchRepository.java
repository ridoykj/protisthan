package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BranchDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBranchRepository extends JpaRepository<BranchDao, String>, JpaSpecificationExecutor<BranchDao> {
}
