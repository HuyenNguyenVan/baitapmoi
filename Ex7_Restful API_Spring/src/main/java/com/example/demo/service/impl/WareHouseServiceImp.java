package com.example.demo.service.impl;

import com.example.demo.dao.IWareHouseRepository;
import com.example.demo.dto.WareHouseDTO;
import com.example.demo.entity.WareHouse;
import com.example.demo.mapper.WearHouseMapper;
import com.example.demo.service.IWareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WareHouseServiceImp implements IWareHouseService {


    @Value("${myApplication.recordNum}")
    private int limitnumber;

    @Autowired
    IWareHouseRepository iWareHouseRepository;

    public List<WareHouse> GetAllWareHouse()
    {

            List<WareHouse> wareHouses  = iWareHouseRepository.findAll();
            if(wareHouses == null)
            {
                return null;
            }else {
                return wareHouses;
            }
    }

    @Override
    public boolean addWareHouse(WareHouseDTO wareHouseDTO) {

                WareHouse wareHouse = WearHouseMapper.mapWareHouseDTOToWareHouse(wareHouseDTO);
                try {
                    iWareHouseRepository.save(wareHouse);
                        return true;
                }catch (Exception e)
                {
                    return false;
                }

    }

    @Override
    public boolean updateWareHouse(WareHouseDTO wareHouseDTO) {
        WareHouse wareHouse = WearHouseMapper.mapWareHouseDTOToWareHouse(wareHouseDTO);
        Date date_now = new Date();
        wareHouse.setDate_created(date_now);
        wareHouse.setDate_fix(date_now);
        try {

            iWareHouseRepository.save(wareHouse);
            return true;
        }catch (Exception e)
        {
            return false;
        }
    }

    @Override
    public WareHouse GetWareHouseById(int id)   {
        try {
           WareHouse wareHouse =  iWareHouseRepository.findById(id).get();
           return wareHouse;

        }catch (Exception e)
        {
            return null;
        }

    }

    @Override
    public List<WareHouse> GetWareHouseByName( String name , int limitPage) {
        try {
            List<WareHouse> wareHouseList = iWareHouseRepository.getWareHouseByName("%"+name+"%",limitnumber,(limitPage - 1)*10);
            return wareHouseList;
        }catch (Exception e)
        {
            return  null;
        }

    }

    @Override
    public Boolean DeleteWareHouseById(int id) {
        try {
            iWareHouseRepository.deleteById(id);
        return  true;
        }catch (Exception e)
        {
            return  false;
        }
    }
}
