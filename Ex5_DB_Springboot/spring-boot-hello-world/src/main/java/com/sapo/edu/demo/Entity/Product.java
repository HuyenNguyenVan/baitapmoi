package com.sapo.edu.demo.Entity;

public class Product {
    String productId;
    String productCode;
    String wareHouseId;
    String id_category;
    String Product_Description;
    String numberProduct;
    int numberBuy;
    String nameProduct;


    public void showInforProduct()
    {
        System.out.println(toString());
    }
 
    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productCode='" + productCode + '\'' +
                ", wareHouseId='" + wareHouseId + '\'' +
                ", id_category='" + id_category + '\'' +
                ", Product_Description='" + Product_Description + '\'' +
                ", numberProduct='" + numberProduct + '\'' +
                ", numberBuy=" + numberBuy +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getWareHouseId() {
        return wareHouseId;
    }

    public void setWareHouseId(String wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public String getId_category() {
        return id_category;
    }

    public void setId_category(String id_category) {
        this.id_category = id_category;
    }

    public String getProduct_Description() {
        return Product_Description;
    }

    public void setProduct_Description(String product_Description) {
        Product_Description = product_Description;
    }

    public String getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(String numberProduct) {
        this.numberProduct = numberProduct;
    }

    public int getNumberBuy() {
        return numberBuy;
    }

    public void setNumberBuy(int numberBuy) {
        this.numberBuy = numberBuy;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
}
