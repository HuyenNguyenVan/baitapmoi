package com.example.demo.controller;


import ch.qos.logback.core.joran.event.BodyEvent;
import com.example.demo.dto.WareHouseDTO;
import com.example.demo.entity.Category;
import com.example.demo.entity.WareHouse;
import com.example.demo.service.impl.WareHouseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class WareHouseController {


    @Autowired
    WareHouseServiceImp wareHouseServiceImp;

                @GetMapping("/GetAllWareHouse")
                public List<WareHouse>  getAllWareHouse()
                {
                      List<WareHouse> LisWareHouses  = (List<WareHouse>) wareHouseServiceImp.GetAllWareHouse();
                       return LisWareHouses;
                }

                @PutMapping("/AddWareHouse")
                public Boolean addWareHouse(@RequestBody WareHouseDTO wareHouseDTO)
                {
                    return wareHouseServiceImp.addWareHouse(wareHouseDTO);
                }

                @PutMapping("/UpdateWareHouse")
                public Boolean updateWareHouse(@RequestBody WareHouseDTO wareHouseDTO )
                {
                    return wareHouseServiceImp.updateWareHouse(wareHouseDTO);
                }

                @GetMapping("/GetWareHouseById/{id}")
                public WareHouse GetWareHouseById(@PathVariable int id)
                {

                      return  wareHouseServiceImp.GetWareHouseById(id);
                }

                @GetMapping("/GetWareHouseByName/{name}/{limipage}")
                public List<WareHouse> GetWareHouseByName (@PathVariable String name,@PathVariable int limipage)
                {
                    return wareHouseServiceImp.GetWareHouseByName(name,limipage);
                }

                @DeleteMapping("/DeleteWareHouseById/{id}")
                public Boolean DeleteWareHouseById(@PathVariable int id)
                {
                    return wareHouseServiceImp.DeleteWareHouseById(id);
                }

}
