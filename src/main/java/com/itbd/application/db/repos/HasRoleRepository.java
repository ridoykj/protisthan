package com.itbd.application.db.repos;


import com.itbd.application.db.dao.HasRoleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface HasRoleRepository extends JpaRepository<HasRoleDao, String>, JpaSpecificationExecutor<HasRoleDao> {
//    @Modifying
//    @Query("delete from User u where u.id in ?1")
//    void deleteWithIds(List<Integer> ids);

    void deleteByNameIn(List<String> names);
}
