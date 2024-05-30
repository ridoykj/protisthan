package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.NoteSeenByDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NoteSeenByRepository extends JpaRepository<NoteSeenByDao, String>, JpaSpecificationExecutor<NoteSeenByDao> {
}
