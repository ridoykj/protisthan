package com.itbd.application.db.repos;


import com.itbd.application.db.dao.contacts.SalutationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalutationRepository extends JpaRepository<SalutationDao, String>, JpaSpecificationExecutor<SalutationDao> {
}
