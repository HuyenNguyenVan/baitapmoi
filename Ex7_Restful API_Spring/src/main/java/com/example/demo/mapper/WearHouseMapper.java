package com.example.demo.mapper;

import com.example.demo.dto.WareHouseDTO;
import com.example.demo.entity.WareHouse;

public class WearHouseMapper {


    public static WareHouse mapWareHouseDTOToWareHouse(WareHouseDTO wareHouseDTO)
    {
        WareHouse wareHouse = new WareHouse();
        wareHouse.setWareHouse_id(wareHouseDTO.getWareHouse_idDTO());
        wareHouse.setDate_created(wareHouseDTO.getDate_createdDTO());
        wareHouse.setDate_fix(wareHouseDTO.getDate_fixDTO());
        wareHouse.setWarehouse_address(wareHouseDTO.getWarehouse_addressDTO());
        wareHouse.setWarehouse_name(wareHouseDTO.getWarehouse_nameDTO());
        return wareHouse;
    }


}
