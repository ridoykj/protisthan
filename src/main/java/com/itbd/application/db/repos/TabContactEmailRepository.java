package com.itbd.application.db.repos;


import com.itbd.application.db.dao.contacts.ContactEmailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabContactEmailRepository extends JpaRepository<ContactEmailDao, String>, JpaSpecificationExecutor<ContactEmailDao> {
}
