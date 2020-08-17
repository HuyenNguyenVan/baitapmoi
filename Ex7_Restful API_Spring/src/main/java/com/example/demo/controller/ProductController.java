package com.example.demo.controller;

import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import com.example.demo.dao.IProductRepository;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.impl.ProductServiceImp;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class ProductController {
    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private ProductServiceImp productServiceImp;



    @GetMapping("/GetProductByIdWarehouse/{id}")
    public List<Product> GetProductByIdWarehouse(@PathVariable int id)
    {
            return productServiceImp.GetProductByIdWarehouse(id);
    }

    @GetMapping("/products")
        public Product getInforProduct(@RequestParam(name = "id") long id)
        {
            Product product = productServiceImp.findOneC(id);
            return product;
        }


        @PostMapping("/products")
        public void  addProduct(@RequestBody ProductDTO productDTO)
        {
                    ProductDTO productDTO1 = productServiceImp.addProduct(productDTO);

//                    HttpStatus status = HttpStatus.OK;
//
//                    if (productDTO1 == null) {
//
//                        status = HttpStatus.METHOD_NOT_ALLOWED;
//                    }
//                    return  new ResponseEntity(productDTO1,status);

        }

        @PutMapping("/products")
        public Product updateProduct(@RequestBody ProductDTO productDTO)
        {
            Product product =  productServiceImp.updateProduct(productDTO);
            return  product;
        }


        @PutMapping("/products/getproductbyname")
        public List<Product> productSearchByNameAndPagination(@RequestParam String name, @RequestParam int pageNumber)
        {
            return productServiceImp.getProductbyName(name,pageNumber);
        }

        @DeleteMapping("/products/{id}")
        public ResponseEntity<? extends Object> deleteById(@PathVariable int id)
        {
            try{
                return new ResponseEntity<>( productServiceImp.deleteById(id), HttpStatus.OK);
            }catch (Exception e)
            {
                    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }


}
