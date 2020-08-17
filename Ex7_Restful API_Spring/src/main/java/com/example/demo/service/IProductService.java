package com.example.demo.service;

import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IProductService {
    Product findOneC(long id);
    ProductDTO addProduct(ProductDTO  productDTO);
    Product updateProduct(ProductDTO productDTO);
    List<Product> getProductbyName(String name,int pageNumber);
    boolean deleteById(long id);
    public List<Product> GetProductByIdWarehouse(int id);
}
