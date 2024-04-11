package com.itbd.application.db.repos;

import com.itbd.application.db.dao.issues.IssueTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface IssueTypeRepository extends JpaRepository<IssueTypeDao, String>, JpaSpecificationExecutor<IssueTypeDao> {
}
