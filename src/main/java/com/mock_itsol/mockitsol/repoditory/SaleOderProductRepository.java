package com.mock_itsol.mockitsol.repoditory;

import com.mock_itsol.mockitsol.entity.SaleOderProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface SaleOderProductRepository extends JpaRepository<SaleOderProductEntity, Long>{
}
