package com.product.service.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.service.api.entity.PurchesHistory;


public interface PurchaseHistoryRepo extends JpaRepository<PurchesHistory, Integer> {

}
