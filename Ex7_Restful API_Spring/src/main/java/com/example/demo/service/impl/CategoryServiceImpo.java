//package com.example.demo.service.impl;
//
//
//import com.example.demo.entity.Category;
//import com.example.demo.dao.ICategoryRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Repository
//public class CategoryServiceImp implements ICategoryRepository {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public List<Category> getListCategory() {
//        List<Category> categoryList = new ArrayList<>();
//
//            String sql = "select * from category";
//
//            CategoryRowMapper categoryRowMapper = new CategoryRowMapper();
//
//            categoryList = jdbcTemplate.query(sql,categoryRowMapper);
//
//        return categoryList;
//    }
//
//    class CategoryRowMapper implements RowMapper<Category>
//    {
//
//        @Override
//        public Category mapRow(ResultSet resultSet, int i) throws SQLException {
//                Category category = new Category();
//                category.setNameCategory(resultSet.getString("Name_category"));
//                category.setCategoryAddress(resultSet.getNString("Category_address"));
//                category.setCodeCategory(resultSet.getNString("code_category"));
//                category.setIdCategory(resultSet.getString("id_category"));
//                category.setDateCreated(resultSet.getDate("date_created"));
//                category.setDateFix(resultSet.getDate("date_fix"));
//            return category;
//        }
//    }
//
//
//}
