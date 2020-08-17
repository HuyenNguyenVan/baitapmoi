package com.example.demo.mapper;

import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.entity.WareHouse;

public class ProductMapper {

        public static Product mapProductToProductMapper(ProductDTO productDTO)
        {
                Product product = new Product();
                product.setName_product(productDTO.getName_productDTO());
                product.setNumber_buy(productDTO.getNumber_buyDTO());
                product.setNumber_product(productDTO.getNumber_productDTO());
                product.setProduct_code(productDTO.getProduct_codeDTO());
                product.setProduct_id(productDTO.getProduct_idDTO());
                product.setProduct_Description(productDTO.getProduct_DescriptionDTO());

                Category category = new Category();
                category.setId_category(productDTO.getCategoryDTO().getId_categoryDTO());
                product.setCategory(category);

                WareHouse wareHouse = new WareHouse();
                wareHouse.setWareHouse_id(productDTO.getWarehouseDTO().getWareHouse_idDTO());
                product.setWarehouse(wareHouse);

                return product;
        }

        //public static


}
