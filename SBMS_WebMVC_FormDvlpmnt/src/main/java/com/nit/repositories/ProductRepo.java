package com.nit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity,Integer>
{

}
