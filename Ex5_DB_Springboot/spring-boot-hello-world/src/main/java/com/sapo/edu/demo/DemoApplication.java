package com.sapo.edu.demo;

import com.sapo.edu.demo.Entity.Category;

import com.sapo.edu.demo.Entity.Product;
import com.sapo.edu.demo.Entity.warehouse;
import com.sapo.edu.demo.Repository.AccessJPA.WareHouseRepository;
import com.sapo.edu.demo.Repository.Imp.CategoryImp;
import com.sapo.edu.demo.Repository.Imp.ProductImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication(scanBasePackages = {"com.sapo.edu.demo.Entity"})
public class DemoApplication<ProductRepositoryImpl> implements CommandLineRunner {
	static Scanner sc = new Scanner(System.in);




	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	public static void Menu()
	{
		System.out.println("------Use data access with jdbc to query to database-------- ");
		System.out.println("1.Use  JdbcTemplate for Category");
		System.out.println("2.Use dụng SimpleJdbc for Product");
		System.out.println("3.Use the display function, using the written procedure ");
		System.out.println("Ex3 : ");
		System.out.println("Ex3.Exception, validate data ");


	}




	@Autowired
	WareHouseRepository wareHouseRepositoryl;








	@Autowired
	CategoryImp categoryImp;

	@Autowired
	ProductImp productImp;

	public void getAllCategory()
	{
			ArrayList<Category> categoryArrayList = (ArrayList<Category>) categoryImp.getListCategory();

		for (Category categoryvalue: categoryArrayList) {
			categoryvalue.showInforCategory();
		}
		productImp.getAllProductList();
	}


	@Override
	public void run(String... args) throws Exception {

		warehouse warehouse = new warehouse();
		warehouse.inputInforware();
		//System.out.println(warehouse.toString());
		warehouse = wareHouseRepositoryl.save(warehouse);

		System.out.println("Ta lấy được là " + warehouse.getWareHouse_id());
		System.out.println("Thành Công");

//		List<Product> productList = productImp.getAllProductList();
//
//		for (Product value : productList) {
//			value.showInforProduct();
//		}
//
//	  List<warehouse> Listwarehouse =  wareHouseRepositoryl.findAll();
//
//		for (warehouse value : Listwarehouse) {
//			value.ShowInforwarehouse();
//		}
//
//		while (true)
//		{
//
//			Menu();
//			System.out.println("Please Enter The Your Choice");
//			int n = sc.nextInt();
//
//			switch (n) {
//
//				case 1:
//					getAllCategory();
//					break;
//				case 2:
//
//					break;
//				case 3:
//					break;
//				case 0:
//					return;
//
//		}
//
//
//	}

}}
