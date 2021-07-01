package com.mock_itsol.mockitsol.repoditory;

import com.mock_itsol.mockitsol.entity.SaleOderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface SaleOderRepository extends JpaRepository<SaleOderEntity, Long> {
}
