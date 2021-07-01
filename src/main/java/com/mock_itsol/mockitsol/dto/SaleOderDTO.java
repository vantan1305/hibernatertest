package com.mock_itsol.mockitsol.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
public class SaleOderDTO extends BaseDTO{
    private String code;
    private BigDecimal total;
    private String customer_Name;
    private String customer_Address;
    private String sale;
    private String customer_Email;
    private String customer_Phone;
    private List<SaleOderProductDTO> saleOderProductDTOList;

    public SaleOderDTO() {
    }
}
