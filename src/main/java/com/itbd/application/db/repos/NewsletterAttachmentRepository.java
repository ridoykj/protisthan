package com.itbd.application.db.repos;


import com.itbd.application.db.dao.newsletter.NewsletterAttachmentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NewsletterAttachmentRepository extends JpaRepository<NewsletterAttachmentDao, String>, JpaSpecificationExecutor<NewsletterAttachmentDao> {
}
