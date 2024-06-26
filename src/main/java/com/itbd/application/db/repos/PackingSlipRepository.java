package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.PackingSlipDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PackingSlipRepository extends JpaRepository<PackingSlipDao, String>, JpaSpecificationExecutor<PackingSlipDao> {
}
