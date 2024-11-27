package com.ohgiraffers.mvc.Product.model.dao;


import com.ohgiraffers.mvc.Product.model.dto.ProductDTO;

import java.util.List;

public interface ProductMapper {

    ProductDTO selectOneProductByCode(String s);

    List<ProductDTO> selectAllProduct();
    int insertProduct(ProductDTO product);

    int updateProduct(ProductDTO product);

    int deleteProduct(String s);


}
