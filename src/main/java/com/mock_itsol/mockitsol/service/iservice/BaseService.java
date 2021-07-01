package com.mock_itsol.mockitsol.service.iservice;

import com.mock_itsol.mockitsol.dto.BaseDTO;
import com.mock_itsol.mockitsol.dto.CategoryDTO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface BaseService {
    <T extends BaseDTO> List<T> findAll();

    <T extends BaseDTO> T saveOrUpdate(HttpServletRequest request, Object object);

    <T extends BaseDTO> T findById(HttpServletRequest request, Long id);

    Boolean delete(HttpServletRequest request, Long id);
}
