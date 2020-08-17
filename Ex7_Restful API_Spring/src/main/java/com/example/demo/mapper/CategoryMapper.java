package com.example.demo.mapper;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.entity.Category;

public class CategoryMapper {

        public static Category mapCategoryDtoTOCategory(CategoryDTO categoryDTO)
        {
                Category category = new Category();
                category.setCategory_address(categoryDTO.getCategory_addressDTO());
                category.setCode_category(categoryDTO.getCode_categoryDTO());
                category.setDate_created(categoryDTO.getDate_createdDTO());
                category.setDate_fix(categoryDTO.getDate_fixDTO());
                category.setId_category(categoryDTO.getId_categoryDTO());
                category.setName_category(categoryDTO.getName_categoryDTO());
                return category;
        }

}
