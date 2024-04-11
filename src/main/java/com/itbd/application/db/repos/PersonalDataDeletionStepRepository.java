package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PersonalDataDeletionStepDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PersonalDataDeletionStepRepository extends JpaRepository<PersonalDataDeletionStepDao, String>, JpaSpecificationExecutor<PersonalDataDeletionStepDao> {
}
