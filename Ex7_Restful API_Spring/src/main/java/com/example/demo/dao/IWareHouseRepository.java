package com.example.demo.dao;


import com.example.demo.entity.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.security.PublicKey;
import java.util.List;

@Repository
public interface IWareHouseRepository extends JpaRepository<WareHouse,Integer> {

    @Query(value = "Select * from WareHouse where warehouse_name like :name Limit :numberPage Offset :limitPage ",nativeQuery = true)
    public List<WareHouse> getWareHouseByName(@Param("name") String name , @Param("numberPage") int numberPage , @Param("limitPage") int limitPage);

    @Transactional
    @Modifying
     Void deleteById(int id);
}
//@Query(value = "SELECT * from Product where name_product like :name Limit :limitProduct offset :pageNumber ",nativeQuery = true)
