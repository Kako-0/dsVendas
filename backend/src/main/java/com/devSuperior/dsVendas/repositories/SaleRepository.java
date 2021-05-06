package com.devSuperior.dsVendas.repositories;

import com.devSuperior.dsVendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}
