package com.mock_itsol.mockitsol.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class ProductDTO extends BaseDTO{
    private String title; // tiêu đề
    private BigDecimal price;
    private BigDecimal  price_Sale;
    private String short_Description;//mô tả ngắn
    private String detail_Description;// mô tả dài
    private String avatar;
    private String sale;
    private Boolean is_Host;
    private List<Product_ImageDTO> product_imageDTOList;
    private List<SaleOderDTO> saleOderDTOList;

    public ProductDTO() {
    }
}
