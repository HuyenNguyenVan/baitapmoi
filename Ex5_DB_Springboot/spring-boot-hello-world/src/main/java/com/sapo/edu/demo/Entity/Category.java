package com.sapo.edu.demo.Entity;

import java.util.Date;

public class Category {


    String idCategory;
    String codeCategory;
    String nameCategory;
    String categoryAddress;
    Date dateCreated;
    Date dateFix;


    public void showInforCategory()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Category{" +
                "idCategory='" + idCategory + '\'' +
                ", codeCategory='" + codeCategory + '\'' +
                ", nameCategory='" + nameCategory + '\'' +
                ", categoryAddress='" + categoryAddress + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateFix=" + dateFix +
                '}';
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getCodeCategory() {
        return codeCategory;
    }

    public void setCodeCategory(String codeCategory) {
        this.codeCategory = codeCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getCategoryAddress() {
        return categoryAddress;
    }

    public void setCategoryAddress(String categoryAddress) {
        this.categoryAddress = categoryAddress;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateFix() {
        return dateFix;
    }

    public void setDateFix(Date dateFix) {
        this.dateFix = dateFix;
    }
}
