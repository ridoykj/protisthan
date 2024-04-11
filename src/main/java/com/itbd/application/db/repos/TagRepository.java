package com.itbd.application.db.repos;


import com.itbd.application.db.dao.tags.TagDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TagRepository extends JpaRepository<TagDao, String>, JpaSpecificationExecutor<TagDao> {
}
