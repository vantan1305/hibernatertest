package com.mock_itsol.mockitsol.repoditory;

import com.mock_itsol.mockitsol.entity.Product_ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface Product_ImageRepository extends JpaRepository<Product_ImageEntity, Long>{
}
