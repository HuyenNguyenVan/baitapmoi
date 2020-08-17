package com.sapo.edu.demo.Repository.AccessJPA;

import com.sapo.edu.demo.Entity.warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WareHouseRepository extends JpaRepository<warehouse,Integer> {

}
