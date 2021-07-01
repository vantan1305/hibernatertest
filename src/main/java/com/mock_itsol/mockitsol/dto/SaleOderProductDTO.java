package com.mock_itsol.mockitsol.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SaleOderProductDTO extends BaseDTO{
    private Integer quantity;
    private List<SaleOderDTO> saleOderDTOList;

    public SaleOderProductDTO() {
    }
}
