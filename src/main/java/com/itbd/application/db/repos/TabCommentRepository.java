package com.itbd.application.db.repos;


import com.itbd.application.db.dao.cummunication.CommentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCommentRepository extends JpaRepository<CommentDao, String>, JpaSpecificationExecutor<CommentDao> {
}
