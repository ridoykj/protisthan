package com.itbd.application.db.repos;


import com.itbd.application.db.dao.LetterHeadDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LetterHeadRepository extends JpaRepository<LetterHeadDao, String>, JpaSpecificationExecutor<LetterHeadDao> {
}
