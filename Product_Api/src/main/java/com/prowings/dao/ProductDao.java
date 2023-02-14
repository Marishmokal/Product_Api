package com.prowings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prowings.model.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
