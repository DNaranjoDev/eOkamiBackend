package dev.dnaranjo.eOkami.controllers;

import dev.dnaranjo.eOkami.dao.ProductDao;
import dev.dnaranjo.eOkami.models.Product;
import dev.dnaranjo.eOkami.utils.JWTUtil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private JWTUtil jwtUtil;

    private boolean validateToken(String token) {
        String productId = jwtUtil.getKey(token);
        return productId != null;
    }

    // @RequestMapping(value="api/products", method = RequestMethod.GET)
    // public List<Product> getAllProducts(@RequestHeader(value ="Authorization") String token) {
    //     if(!validateToken(token)) { return null; }
    //     return productDao.getAllProducts();
    // }
    @RequestMapping(value="api/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }
}
