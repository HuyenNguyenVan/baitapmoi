package com.example.demo.dto;

public class ProductDTO {


    Long product_idDTO;
    String product_codeDTO;

    private WareHouseDTO warehouseDTO;

    private CategoryDTO  categoryDTO;

    String Product_DescriptionDTO;
    String number_productDTO;
    int number_buyDTO;
    String name_productDTO;

    public Long getProduct_idDTO() {
        return product_idDTO;
    }

    public void setProduct_idDTO(Long product_idDTO) {
        this.product_idDTO = product_idDTO;
    }

    public String getProduct_codeDTO() {
        return product_codeDTO;
    }

    public void setProduct_codeDTO(String product_codeDTO) {
        this.product_codeDTO = product_codeDTO;
    }

    //    public Long getProduct_id() {
//        return product_id;
//    }
//
//    public void setProduct_id(Long product_id) {
//        this.product_id = product_id;
//    }
//
//    public String getProduct_code() {
//        return product_code;
//    }
//
//    public void setProduct_code(String product_code) {
//        this.product_code = product_code;
//    }


    public WareHouseDTO getWarehouseDTO() {
        return warehouseDTO;
    }

    public void setWarehouseDTO(WareHouseDTO warehouseDTO) {
        this.warehouseDTO = warehouseDTO;
    }

    public CategoryDTO getCategoryDTO() {
        return categoryDTO;
    }

    public void setCategoryDTO(CategoryDTO categoryDTO) {
        this.categoryDTO = categoryDTO;
    }

    public String getProduct_DescriptionDTO() {
        return Product_DescriptionDTO;
    }

    public void setProduct_DescriptionDTO(String product_DescriptionDTO) {
        Product_DescriptionDTO = product_DescriptionDTO;
    }

    public String getNumber_productDTO() {
        return number_productDTO;
    }

    public void setNumber_productDTO(String number_productDTO) {
        this.number_productDTO = number_productDTO;
    }

    public int getNumber_buyDTO() {
        return number_buyDTO;
    }

    public void setNumber_buyDTO(int number_buyDTO) {
        this.number_buyDTO = number_buyDTO;
    }

    public String getName_productDTO() {
        return name_productDTO;
    }

    public void setName_productDTO(String name_productDTO) {
        this.name_productDTO = name_productDTO;
    }
}
