package com.devSuperior.dsVendas.service;

import java.util.List;
import java.util.stream.Collectors;

import com.devSuperior.dsVendas.dto.SellerDTO;
import com.devSuperior.dsVendas.entities.Seller;
import com.devSuperior.dsVendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();

        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
