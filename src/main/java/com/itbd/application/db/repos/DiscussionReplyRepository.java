package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DiscussionReplyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DiscussionReplyRepository extends JpaRepository<DiscussionReplyDao, String>, JpaSpecificationExecutor<DiscussionReplyDao> {
}
