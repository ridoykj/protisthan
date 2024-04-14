package com.itbd.application.db.repos;


import com.itbd.application.db.dao.FileDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface FileRepository extends JpaRepository<FileDao, String>, JpaSpecificationExecutor<FileDao> {
}
