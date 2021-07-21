package com.test.abc.controller;

import com.test.abc.model.domain.Product;
import com.test.abc.model.domain.Promotion;
import com.test.abc.model.domain.Tax;
import com.test.abc.model.dto.ProductDTO;
import com.test.abc.repository.ProductRepository;
import com.test.abc.repository.PromotionRepository;
import com.test.abc.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private TaxRepository taxRepository;

    @PostMapping("/saveProduct")
    public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO) {
        Product product = new Product();
        Promotion promotion = promotionRepository.getOne(productDTO.getPromotionID());
        Tax tax = taxRepository.getOne(productDTO.getTaxID());

        product.setProductName(productDTO.getProductName());
        product.setPrice(productDTO.getPrice());
        product.setExpDate(productDTO.getExpDate());
        product.setPromotion(promotion);
        product.setTax(tax);

        product = productRepository.saveAndFlush(product);

        return new ResponseEntity<>(new ProductDTO(product), HttpStatus.OK);
    }

    @GetMapping("/getProductByID/{productID}")
    public ResponseEntity<ProductDTO> getProductByID(@PathVariable Integer productID) {
        Product product = productRepository.getOne(productID);
        return new ResponseEntity<>(new ProductDTO(product), HttpStatus.OK);
    }

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDTO> results = new ArrayList<>();

        products.forEach(product -> {
            results.add(new ProductDTO(product));
        });

        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}





