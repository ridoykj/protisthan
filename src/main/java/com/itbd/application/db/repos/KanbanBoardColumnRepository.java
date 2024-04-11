package com.itbd.application.db.repos;


import com.itbd.application.db.dao.KanbanBoardColumnDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface KanbanBoardColumnRepository extends JpaRepository<KanbanBoardColumnDao, String>, JpaSpecificationExecutor<KanbanBoardColumnDao> {
}
