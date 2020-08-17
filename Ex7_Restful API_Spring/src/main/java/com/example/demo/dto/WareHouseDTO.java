package com.example.demo.dto;

import java.util.Date;
import java.util.Scanner;

public class WareHouseDTO {

    static Scanner sc = new Scanner(System.in);

    int wareHouse_idDTO;
    String warehouse_nameDTO;
    String warehouse_addressDTO;
    Date date_createdDTO;
    Date date_fixDTO;
//    @OneToMany(mappedBy = "warehouse")
//    private List<Product> products;

//    public void inputInforware() throws ParseException {
//        // System.out.println("Please Enter The Your WareHouse Id"); wareHouse_id = sc.nextInt();
//        System.out.println("Please Enter The Your WareHouse Name");
//        warehouse_name = sc.nextLine();
//        System.out.println("Please Enter The Your WareHouse Address");
//        warehouse_address = sc.nextLine();
//        System.out.println("Please Enter The Your Date Created(\"dd/MM/yyyy\") ");
//        String date_create = sc.nextLine();
//
//        date_created = new SimpleDateFormat("dd/MM/yyyy").parse(date_create);
//        System.out.println("Please Enter The Your Date Fix(\"dd/MM/yyyy\") ");
//        String fix_date = sc.nextLine();
//
//        date_fix = new SimpleDateFormat("dd/MM/yyyy").parse(fix_date);
//
//    }

//           public void validateIdWareHouse(String id)
//           {
//               System.out.println("Please Enter The Your WareHouse Id"); id = sc.nextLine();
//
//               while (!StringUtils)
//
//
//
//           }



    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        WareHouseDTO.sc = sc;
    }

    public int getWareHouse_idDTO() {
        return wareHouse_idDTO;
    }

    public void setWareHouse_idDTO(int wareHouse_idDTO) {
        this.wareHouse_idDTO = wareHouse_idDTO;
    }

    public String getWarehouse_nameDTO() {
        return warehouse_nameDTO;
    }

    public void setWarehouse_nameDTO(String warehouse_nameDTO) {
        this.warehouse_nameDTO = warehouse_nameDTO;
    }

    public String getWarehouse_addressDTO() {
        return warehouse_addressDTO;
    }

    public void setWarehouse_addressDTO(String warehouse_addressDTO) {
        this.warehouse_addressDTO = warehouse_addressDTO;
    }

    public Date getDate_createdDTO() {
        return date_createdDTO;
    }

    public void setDate_createdDTO(Date date_createdDTO) {
        this.date_createdDTO = date_createdDTO;
    }

    public Date getDate_fixDTO() {
        return date_fixDTO;
    }

    public void setDate_fixDTO(Date date_fixDTO) {
        this.date_fixDTO = date_fixDTO;
    }

    public void ShowInforwarehouse() {
        System.out.println(toString());
    }


}
