package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_category;

    String code_category;
    String name_category;
    String category_address;
    Date date_created;
    Date date_fix;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
   private List<Product> productList;

    public void showInforCategory()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Category{" +
                "id_category=" + id_category +
                ", code_category='" + code_category + '\'' +
                ", name_category='" + name_category + '\'' +
                ", category_address='" + category_address + '\'' +
                ", date_created=" + date_created +
                ", date_fix=" + date_fix +
                '}';
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public String getCode_category() {
        return code_category;
    }

    public void setCode_category(String code_category) {
        this.code_category = code_category;
    }

    public String getName_category() {
        return name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }

    public String getCategory_address() {
        return category_address;
    }

    public void setCategory_address(String category_address) {
        this.category_address = category_address;
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
}
