package com.atoz_develop.mybatissample.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.atoz_develop.mybatissample.model.Product;

@Mapper
public interface ProductMapper {
	
	Product selectProductById(Long id);
	List<Product> selectAllProducts();
	void insertProduct(Product product);

}
