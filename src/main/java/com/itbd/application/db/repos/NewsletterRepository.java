package com.itbd.application.db.repos;


import com.itbd.application.db.dao.newsletter.NewsletterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NewsletterRepository extends JpaRepository<NewsletterDao, String>, JpaSpecificationExecutor<NewsletterDao> {
}
