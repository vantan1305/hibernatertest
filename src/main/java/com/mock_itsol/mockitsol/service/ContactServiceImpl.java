package com.mock_itsol.mockitsol.service;

import com.mock_itsol.mockitsol.dto.BaseDTO;
import com.mock_itsol.mockitsol.service.iservice.ContactService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Override
    public <T extends BaseDTO> List<T> findAll() {
        return null;
    }

    @Override
    public <T extends BaseDTO> T saveOrUpdate(HttpServletRequest request, Object object) {
        return null;
    }

    @Override
    public <T extends BaseDTO> T findById(HttpServletRequest request, Long id) {
        return null;
    }

    @Override
    public Boolean delete(HttpServletRequest request, Long id) {
        return null;
    }
}
