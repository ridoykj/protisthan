package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ListFilterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ListFilterRepository extends JpaRepository<ListFilterDao, String>, JpaSpecificationExecutor<ListFilterDao> {
}
