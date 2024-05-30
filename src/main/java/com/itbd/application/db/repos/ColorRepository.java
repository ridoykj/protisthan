package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.ColorDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ColorRepository extends JpaRepository<ColorDao, String>, JpaSpecificationExecutor<ColorDao> {
}
