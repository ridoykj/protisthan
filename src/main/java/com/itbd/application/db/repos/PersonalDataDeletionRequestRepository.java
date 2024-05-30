package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.personal_data.PersonalDataDeletionRequestDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PersonalDataDeletionRequestRepository extends JpaRepository<PersonalDataDeletionRequestDao, String>, JpaSpecificationExecutor<PersonalDataDeletionRequestDao> {
}
