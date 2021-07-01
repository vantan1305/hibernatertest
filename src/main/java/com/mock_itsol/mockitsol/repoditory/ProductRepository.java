package com.mock_itsol.mockitsol.repoditory;

import com.mock_itsol.mockitsol.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
