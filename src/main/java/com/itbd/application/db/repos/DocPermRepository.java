package com.itbd.application.db.repos;


import com.itbd.application.db.dao.doctypes.DocPermDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface DocPermRepository extends JpaRepository<DocPermDao, String>, JpaSpecificationExecutor<DocPermDao> {
    @Query(value  = "Select distinct dp.role from DocPermDao dp where dp.role like :role order by dp.role")
    Page<String> findRole(@Param("role") String role, Pageable pageable);

    @Query(value  = "Select distinct dp.parent from DocPermDao dp where dp.parent like :parent order by dp.parent")
    Page<String > findParent(@Param("parent") String parent, Pageable pageable);
//    List<String> findDistinctByParentContains(String parent, Pageable pageable);
}
