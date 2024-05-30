package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.DiscussionTopicDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DiscussionTopicRepository extends JpaRepository<DiscussionTopicDao, String>, JpaSpecificationExecutor<DiscussionTopicDao> {
}
