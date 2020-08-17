package com.sapo.edu.demo.Entity;



import lombok.Getter;


import javax.persistence.*;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


@Entity
@Table(name = "warehouse")
public class warehouse  implements Serializable {

    static  Scanner sc = new Scanner(System.in);

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
           int wareHouse_id ;
           String warehouse_name;
           String warehouse_address;
           Date date_created;
           Date date_fix;

           public void inputInforware() throws ParseException {
              // System.out.println("Please Enter The Your WareHouse Id"); wareHouse_id = sc.nextInt();
               System.out.println("Please Enter The Your WareHouse Name"); warehouse_name = sc.nextLine();
               System.out.println("Please Enter The Your WareHouse Address"); warehouse_address = sc.nextLine();
               System.out.println("Please Enter The Your Date Created(\"dd/MM/yyyy\") "); String date_create = sc.nextLine();

               date_created =  new SimpleDateFormat("dd/MM/yyyy").parse(date_create);
               System.out.println("Please Enter The Your Date Fix(\"dd/MM/yyyy\") "); String fix_date = sc.nextLine();

               date_fix =  new SimpleDateFormat("dd/MM/yyyy").parse(fix_date);

           }

//           public void validateIdWareHouse(String id)
//           {
//               System.out.println("Please Enter The Your WareHouse Id"); id = sc.nextLine();
//
//               while (!StringUtils)
//
//
//
//           }

    public int getWareHouse_id() {
        return wareHouse_id;
    }

    public void setWareHouse_id(int wareHouse_id) {
        this.wareHouse_id = wareHouse_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getWarehouse_address() {
        return warehouse_address;
    }

    public void setWarehouse_address(String warehouse_address) {
        this.warehouse_address = warehouse_address;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDate_fix() {
        return date_fix;
    }

    public void setDate_fix(Date date_fix) {
        this.date_fix = date_fix;
    }

    @Override
    public String toString() {
        return "warehouse{" +
                "wareHouse_id='" + wareHouse_id + '\'' +
                ", warehouse_name='" + warehouse_name + '\'' +
                ", warehouse_address='" + warehouse_address + '\'' +
                ", date_created=" + date_created +
                ", date_fix=" + date_fix +
                '}';
    }
    public void ShowInforwarehouse()
    {
        System.out.println(toString());
    }
}
