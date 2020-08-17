package com.example.demo.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class CategoryDTO {

    @NotNull
    @Min(0)
    int id_categoryDTO;

    String code_categoryDTO;
    String name_categoryDTO;
    String category_addressDTO;
    Date date_createdDTO;
    Date date_fixDTO;

    public void showInforCategory()
    {
        System.out.println(toString());
    }

    public int getId_categoryDTO() {
        return id_categoryDTO;
    }

    public void setId_categoryDTO(int id_categoryDTO) {
        this.id_categoryDTO = id_categoryDTO;
    }

    public String getCode_categoryDTO() {
        return code_categoryDTO;
    }

    public void setCode_categoryDTO(String code_categoryDTO) {
        this.code_categoryDTO = code_categoryDTO;
    }

    public String getName_categoryDTO() {
        return name_categoryDTO;
    }

    public void setName_categoryDTO(String name_categoryDTO) {
        this.name_categoryDTO = name_categoryDTO;
    }

    public String getCategory_addressDTO() {
        return category_addressDTO;
    }

    public void setCategory_addressDTO(String category_addressDTO) {
        this.category_addressDTO = category_addressDTO;
    }

    public Date getDate_createdDTO() {
        return date_createdDTO;
    }

    public void setDate_createdDTO(Date date_createdDTO) {
        this.date_createdDTO = date_createdDTO;
    }

    public Date getDate_fixDTO() {
        return date_fixDTO;
    }

    public void setDate_fixDTO(Date date_fixDTO) {
        this.date_fixDTO = date_fixDTO;
    }
}
