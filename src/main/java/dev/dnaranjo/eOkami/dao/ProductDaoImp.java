package dev.dnaranjo.eOkami.dao;
import dev.dnaranjo.eOkami.models.Product;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class ProductDaoImp implements ProductDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        String query = "FROM Product";
        return entityManager.createQuery(query).getResultList();
    }
}
