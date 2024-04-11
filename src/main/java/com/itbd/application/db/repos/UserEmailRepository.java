package com.itbd.application.db.repos;


import com.itbd.application.db.dao.users.UserEmailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserEmailRepository extends JpaRepository<UserEmailDao, String>, JpaSpecificationExecutor<UserEmailDao> {
}
