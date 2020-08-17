package com.example.demo.dao;


import com.example.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {

    @Transactional
    @Modifying
    public  void deleteById(int id);
}
