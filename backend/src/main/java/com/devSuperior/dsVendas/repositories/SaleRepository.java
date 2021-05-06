package com.devSuperior.dsVendas.repositories;

import java.util.List;

import com.devSuperior.dsVendas.dto.SaleSucessDTO;
import com.devSuperior.dsVendas.dto.SaleSumDTO;
import com.devSuperior.dsVendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    @Query("SELECT new com.devSuperior.dsVendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))" 
        + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.devSuperior.dsVendas.dto.SaleSucessDTO(obj.seller," 
        + " SUM(obj.visited), SUM(obj.deals)) FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSucessDTO> sucessGroupedBySeller();
}
