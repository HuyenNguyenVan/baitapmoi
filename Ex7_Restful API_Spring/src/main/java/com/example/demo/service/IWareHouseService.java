package com.example.demo.service;

import com.example.demo.dto.WareHouseDTO;
import com.example.demo.entity.WareHouse;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IWareHouseService {
        boolean addWareHouse(WareHouseDTO wareHouseDTO);
        boolean updateWareHouse(WareHouseDTO wareHouseDTO);
        public WareHouse GetWareHouseById(int id);
        public List<WareHouse> GetWareHouseByName ( String name , int limitPage);
        public Boolean DeleteWareHouseById(int id);
}
