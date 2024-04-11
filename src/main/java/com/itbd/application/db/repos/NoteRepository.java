package com.itbd.application.db.repos;


import com.itbd.application.db.dao.NoteDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NoteRepository extends JpaRepository<NoteDao, String>, JpaSpecificationExecutor<NoteDao> {
}
