package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.personal_data.PersonalDataDownloadRequestDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PersonalDataDownloadRequestRepository extends JpaRepository<PersonalDataDownloadRequestDao, String>, JpaSpecificationExecutor<PersonalDataDownloadRequestDao> {
}
