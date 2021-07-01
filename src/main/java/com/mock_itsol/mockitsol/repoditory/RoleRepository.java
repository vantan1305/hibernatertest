package com.mock_itsol.mockitsol.repoditory;

import com.mock_itsol.mockitsol.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface RoleRepository extends JpaRepository<RoleEntity, Long>{
}
