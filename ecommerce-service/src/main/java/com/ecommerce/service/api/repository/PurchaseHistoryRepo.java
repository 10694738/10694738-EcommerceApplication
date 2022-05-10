package com.ecommerce.service.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.service.api.entity.PurchesHistory;

@Repository

public interface PurchaseHistoryRepo extends JpaRepository<PurchesHistory, Integer> {

}
