package com.itbd.application.db.repos;


import com.itbd.application.db.dao.telephony.TelephonyCallTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TelephonyCallTypeRepository extends JpaRepository<TelephonyCallTypeDao, String>, JpaSpecificationExecutor<TelephonyCallTypeDao> {
}
