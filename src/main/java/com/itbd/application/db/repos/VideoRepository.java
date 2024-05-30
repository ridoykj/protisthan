package com.itbd.application.db.repos;


import com.itbd.application.db.dao.utilities.VideoDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface VideoRepository extends JpaRepository<VideoDao, String>, JpaSpecificationExecutor<VideoDao> {
}
