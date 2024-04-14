package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CustomHtmlBlockDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomHtmlBlockRepository extends JpaRepository<CustomHtmlBlockDao, String>, JpaSpecificationExecutor<CustomHtmlBlockDao> {
}
