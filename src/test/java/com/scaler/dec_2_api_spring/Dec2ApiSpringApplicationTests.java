package com.scaler.dec_2_api_spring;

import com.scaler.dec_2_api_spring.model.Categories;
import com.scaler.dec_2_api_spring.model.Products;
import com.scaler.dec_2_api_spring.repository.Categoryrepo;
import com.scaler.dec_2_api_spring.repository.ProductRepo;
import com.scaler.dec_2_api_spring.repository.Projections.productproj;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class Dec2ApiSpringApplicationTests {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private Categoryrepo categoryrepo;

    @Test
    void contextLoads() {
    }

    @Test
    void TestQuery() {
        // Implement the test case to check if the query is implemented correctly

//        List<Products> products = productRepo.findProductsByNativeCategoryId(1L);
//
//        for (Products product : products) {
//            System.out.println(product);
//        }

        List<productproj> products = productRepo.findProductsByCategoryIdusingProject(1L);

        System.out.println(products.get(0).getTitle());
    }

    @Test
    void FetchTesttype(){
        Optional<Categories> cat = categoryrepo.findById(1L);
        System.out.println("this is the id "+cat.get().getId());

        List<Products> products = cat.get().getProducts();
        System.out.println(products.size());

        System.out.println("we got the size baby");

    }



}
