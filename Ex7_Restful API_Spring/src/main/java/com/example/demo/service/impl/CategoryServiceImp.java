package com.example.demo.service.impl;

import com.example.demo.dao.ICategoryRepository;
import com.example.demo.dto.CategoryDTO;
import com.example.demo.entity.Category;
import com.example.demo.mapper.CategoryMapper;
import com.example.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImp implements ICategoryService {

    @Autowired
    ICategoryRepository iCategoryRepository;

    public Boolean inserCategory(CategoryDTO categoryDTO)
    {
        Category category;
        try {
            category = CategoryMapper.mapCategoryDtoTOCategory(categoryDTO);
            iCategoryRepository.save(category);
            return  true;
        }catch (Exception e)
        {
            return  false;
        }
    }

    @Override
    public Boolean UpdateCategorybyId(CategoryDTO categoryDTO) {
        Category category;
        try {
            category = CategoryMapper.mapCategoryDtoTOCategory(categoryDTO);
            iCategoryRepository.save(category);
            return  true;
        }catch (Exception e)
        {
            return false;
        }
    }


    public boolean deleteCatagoryById(int id)
    {
        try {
            iCategoryRepository.deleteById(id);
            return  true;
        }catch (Exception e)
        {
            return false;
        }
    }


}
