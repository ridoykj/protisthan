package com.itbd.application.db.repos;


import com.itbd.application.db.dao.contacts.AddressDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AddressRepository extends JpaRepository<AddressDao, String>, JpaSpecificationExecutor<AddressDao> {
}
