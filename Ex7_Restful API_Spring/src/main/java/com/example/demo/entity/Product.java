package com.example.demo.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long product_id;
    String product_code;


    @ManyToOne
    @JoinColumn(name = "wareHouse_id")
    private WareHouse warehouse;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    String Product_Description;
    String number_product;
    int number_buy;
    String name_product;

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }


    public WareHouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(WareHouse warehouse) {
        this.warehouse = warehouse;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getProduct_Description() {
        return Product_Description;
    }

    public void setProduct_Description(String product_Description) {
        Product_Description = product_Description;
    }

    public String getNumber_product() {
        return number_product;
    }

    public void setNumber_product(String number_product) {
        this.number_product = number_product;
    }

    public int getNumber_buy() {
        return number_buy;
    }

    public void setNumber_buy(int number_buy) {
        this.number_buy = number_buy;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public void showInforProduct()
    {
        System.out.println(toString());
    }
 

}
