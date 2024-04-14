package com.itbd.application.db.repos;


import com.itbd.application.db.dao.contacts.ContactPhoneDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ContactPhoneRepository extends JpaRepository<ContactPhoneDao, String>, JpaSpecificationExecutor<ContactPhoneDao> {
}
