package com.itbd.application.db.repos;


import com.itbd.application.db.dao.tags.TagLinkDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TagLinkRepository extends JpaRepository<TagLinkDao, String>, JpaSpecificationExecutor<TagLinkDao> {
}
