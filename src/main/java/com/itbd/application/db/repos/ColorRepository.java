package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ColorDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabColorRepository extends JpaRepository<ColorDao, String>, JpaSpecificationExecutor<ColorDao> {
}
