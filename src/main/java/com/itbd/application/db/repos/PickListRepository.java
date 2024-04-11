package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PickListDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PickListRepository extends JpaRepository<PickListDao, String>, JpaSpecificationExecutor<PickListDao> {
}
