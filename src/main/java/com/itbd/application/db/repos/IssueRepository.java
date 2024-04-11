package com.itbd.application.db.repos;

import com.itbd.application.db.dao.issues.IssueDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface IssueRepository extends JpaRepository<IssueDao, String>, JpaSpecificationExecutor<IssueDao> {
}
