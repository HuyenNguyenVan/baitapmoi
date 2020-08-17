package com.example.demo.service.impl;

import com.example.demo.dao.IProductRepository;
import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.IProductService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImp implements IProductService {

    @Value("${myApplication.recordNum}")
    private int limitnumber;

    @Autowired
    IProductRepository iProductRepository;




    @Override
    public Product findOneC(long id) {
        return iProductRepository.findOneC(id);
    }

    @Override
    public ProductDTO addProduct(ProductDTO  productDTO) {
//        if(productDTO.getCategoryDTO().getId_categoryDTO() == 0 || productDTO.getWarehouseDTO().getWareHouse_idDTO() == 0 || productDTO.getName_productDTO() == null || productDTO.getProduct_DescriptionDTO() == null || productDTO.getName_productDTO() == null || productDTO.getNumber_buyDTO() == 0 || productDTO.getProduct_DescriptionDTO() == null || productDTO.ge  == 0 )
//            {
//                return  null;
//            }
        Product product;
        try {
         product = ProductMapper.mapProductToProductMapper(productDTO);
         iProductRepository.save(product);
        // System.out.println("có chạy vào hàm này không");
         return productDTO;
    }catch (Exception e)
    {
        return  null;
    }

    }

    @Override
    public Product updateProduct(ProductDTO productDTO) {
        try {
            Product product = ProductMapper.mapProductToProductMapper(productDTO);
            iProductRepository.save(product);
            return product;
        }catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public List<Product> getProductbyName(String name,int pageNumber) {
        return iProductRepository.getAllProductByName("%"+name+"%",limitnumber,(pageNumber-1)*10);
    }

    @Override
    public boolean deleteById(long id) {
        try {
            iProductRepository.deleteById(id);
            return true;
        }catch (Exception e)
        {
            return  false;
        }
    }

    @Override
    public List<Product> GetProductByIdWarehouse(int id) {
            try {
                     List<Product> getListProduct =  iProductRepository.getProductbyIdWareHouse(id);
                     return getListProduct;
            }catch (Exception e)
            {
                return null;
            }
    }
}
