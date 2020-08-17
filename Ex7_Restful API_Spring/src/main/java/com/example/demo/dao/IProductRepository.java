package com.example.demo.dao;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
    @Query("select p from Product p where p.product_id = :id")
  public   Product findOneC(@Param("id") long id);

    //Product addProduct(Product product);

    @Query(value = "SELECT * from Product where name_product like :name Limit :limitProduct offset :pageNumber ",nativeQuery = true)
   public List<Product> getAllProductByName(@Param("name") String name , @Param("limitProduct") int limitProduct, @Param("pageNumber") int pageNumber);


        @Transactional
        @Modifying
       public void deleteById(long id);


        @Query(value = "select product.* from product left join WareHouse on Product.ware_house_id = WareHouse.ware_house_id where WareHouse.ware_house_id = :id ",nativeQuery = true)
        List<Product> getProductbyIdWareHouse(@Param("id") int id);


 //   void deleteById(@Param("id") int id)


//    @Override
//    @Query("select * from  product where name_product like")
//    Page<Product> findAll(Pageable pageable);

}
// "innser into product (product_id,product_description,id_category,name_product,number_buy,number_product,product_code,warehouse_ware_house_id)