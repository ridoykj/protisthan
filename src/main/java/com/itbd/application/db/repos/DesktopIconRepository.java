package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.DesktopIconDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DesktopIconRepository extends JpaRepository<DesktopIconDao, String>, JpaSpecificationExecutor<DesktopIconDao> {
}
