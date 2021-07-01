package com.mock_itsol.mockitsol.repoditory;

import com.mock_itsol.mockitsol.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {
}
