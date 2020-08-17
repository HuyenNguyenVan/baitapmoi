package com.example.demo.controller;


import com.example.demo.dao.ICategoryRepository;
import com.example.demo.dto.CategoryDTO;
import com.example.demo.entity.Category;
import com.example.demo.service.impl.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class CategoryController {

    @Autowired
    ICategoryRepository iCategoryRepository;

    @Autowired
    CategoryServiceImp categoryServiceImp;

        @GetMapping("/GetAllCategory")
        public List<Category> categoryList (){

            List<Category> categoryList =  iCategoryRepository.findAll();

            return categoryList;
        }

    @GetMapping("/GetCategoryById/{id}")
    public Optional<Category> getcategoryById (@PathVariable int id){
            HttpStatus status = HttpStatus.OK;
        Optional<Category> category =   iCategoryRepository.findById(id);

        return category;

    }

    @DeleteMapping("DeleteCatagoryById/{id}")
    public Boolean deleteCatagoryById(@PathVariable int id)
    {
        return categoryServiceImp.deleteCatagoryById(id);
    }

    @PostMapping("InserCategory")
    public Boolean InserProduct(@RequestBody CategoryDTO categoryDTO)
    {
            return categoryServiceImp.inserCategory(categoryDTO);
    }

    @PostMapping("UpdateCategorybyId")
    public Boolean UpdateCategorybyId(@RequestBody CategoryDTO categoryDTO)
    {
                return categoryServiceImp.UpdateCategorybyId(categoryDTO);
    }


}
