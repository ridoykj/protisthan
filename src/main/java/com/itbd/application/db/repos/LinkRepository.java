package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.TagLinkDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LinkRepository extends JpaRepository<TagLinkDao, String>, JpaSpecificationExecutor<TagLinkDao> {
}
