package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DunningLetterTextDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DunningLetterTextRepository extends JpaRepository<DunningLetterTextDao, String>, JpaSpecificationExecutor<DunningLetterTextDao> {
}
