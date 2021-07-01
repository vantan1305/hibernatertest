package com.mock_itsol.mockitsol.repoditory;

import com.mock_itsol.mockitsol.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
