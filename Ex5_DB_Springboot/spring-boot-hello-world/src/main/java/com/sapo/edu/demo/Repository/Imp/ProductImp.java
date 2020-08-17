package com.sapo.edu.demo.Repository.Imp;

import com.sapo.edu.demo.Entity.Product;
import com.sapo.edu.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Repository
public class ProductImp  implements ProductRepository {

    private SimpleJdbcCall simpleJdbcCall;

    @Autowired
    public void setDataSource(DataSource dataSource)
    {
        this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getAll_Product").returningResultSet("product", new RowMapper<Product>() {

                    @Override
                    public Product mapRow(ResultSet resultSet, int i) throws SQLException {

                            Product product = new Product();
                            product.setId_category(resultSet.getNString("id_category"));
                            product.setNameProduct(resultSet.getNString("name_product"));
                            product.setNumberBuy(resultSet.getInt("id_category"));
                            product.setNumberProduct(resultSet.getNString("number_product"));
                            product.setWareHouseId(resultSet.getNString("wareHouse_id"));

                            return product;
                    }
                });

    }

    @Override
    public List<Product> getAllProductList() {

        Map<String,Object> objectMap =simpleJdbcCall.execute();

        List<Product> productList = new ArrayList<>();
        productList = (List<Product>) objectMap.get("product");

        productList.forEach(product -> {
            System.out.println(product);
        });
        return null;
    }
}
