package dev.dnaranjo.eOkami.dao;
import dev.dnaranjo.eOkami.models.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAllProducts();
}
