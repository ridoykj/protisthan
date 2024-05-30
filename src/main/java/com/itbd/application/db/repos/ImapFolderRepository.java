package com.itbd.application.db.repos;

import com.itbd.application.db.dao.email.ImapFolderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ImapFolderRepository extends JpaRepository<ImapFolderDao, String>, JpaSpecificationExecutor<ImapFolderDao> {
}
