package com.example.demo.service;

import com.example.demo.dto.CategoryDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface ICategoryService {

    public boolean deleteCatagoryById(int id);
    public Boolean inserCategory(CategoryDTO categoryDTO);
    public Boolean UpdateCategorybyId(CategoryDTO categoryDTO);
}
