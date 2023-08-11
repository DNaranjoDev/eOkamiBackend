package dev.dnaranjo.eOkami.models;

import java.io.Serial;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    private Serial id;

    // Name
    @Getter @Setter @Column(name="name")
    private String name;

    // Description
    @Getter @Setter @Column(name="description")
    private String description;

    // Price
    @Getter @Setter @Column(name="price")
    private Double price;
}
