package com.ohgiraffers.mvc.Product.model.service;

import com.ohgiraffers.mvc.Product.model.dao.ProductMapper;
import com.ohgiraffers.mvc.Product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.mvc.common.mybatis.Template.getSqlSession;

public class ProductService {

    private ProductMapper ProductMapper;
    public ProductDTO selectOneProductByCode(int productCode) {

        SqlSession sqlSession = getSqlSession();
        System.out.println("sqlSession : " + sqlSession);

        ProductMapper = sqlSession.getMapper(ProductMapper.class);

        ProductDTO selectedProduct = ProductMapper.selectOneProductByCode(String.valueOf(productCode));


        sqlSession.close();

        return selectedProduct;
    }

    public List<ProductDTO> selectAllProduct() {
        SqlSession sqlSession = getSqlSession();
        ProductMapper = sqlSession.getMapper(ProductMapper.class);
        List<ProductDTO> productList = ProductMapper.selectAllProduct();
        sqlSession.close();
        return productList;
    }

    public int insertProduct(ProductDTO product) {
        SqlSession sqlSession = getSqlSession();

        ProductMapper = sqlSession.getMapper(ProductMapper.class);

        int result = ProductMapper.insertProduct(product);
        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int updateProduct(ProductDTO product) {
        SqlSession sqlSession = getSqlSession();

        ProductMapper = sqlSession.getMapper(ProductMapper.class);

        int result = ProductMapper.updateProduct(product);
        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int deleteProduct(int productCode) {
        SqlSession sqlSession = getSqlSession();

        ProductMapper = sqlSession.getMapper(ProductMapper.class);

        int result = ProductMapper.deleteProduct(String.valueOf(productCode));
        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }
}
