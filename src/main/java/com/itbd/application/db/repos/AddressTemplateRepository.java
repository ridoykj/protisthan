package com.itbd.application.db.repos;


import com.itbd.application.db.dao.contacts.AddressTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AddressTemplateRepository extends JpaRepository<AddressTemplateDao, String>, JpaSpecificationExecutor<AddressTemplateDao> {
}
