package com.devSuperior.dsVendas.service;

import java.util.List;

import com.devSuperior.dsVendas.dto.SaleDTO;
import com.devSuperior.dsVendas.dto.SaleSucessDTO;
import com.devSuperior.dsVendas.dto.SaleSumDTO;
import com.devSuperior.dsVendas.entities.Sale;
import com.devSuperior.dsVendas.repositories.SaleRepository;
import com.devSuperior.dsVendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;
    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);

        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    };

    @Transactional(readOnly = true)
    public List<SaleSucessDTO> sucessGroupedBySeller(){
        return repository.sucessGroupedBySeller();
    };
    
}
