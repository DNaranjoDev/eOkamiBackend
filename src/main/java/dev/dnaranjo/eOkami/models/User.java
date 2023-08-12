package dev.dnaranjo.eOkami.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    private Long id;

    // Name
    @Getter @Setter @Column(name="name")
    private String name;

    // LastName
    @Getter @Setter @Column(name="lastname")
    private String lastName;

    // NickName
    @Getter @Setter @Column(name="nickname")
    private String nickName;

    // Email
    @Getter @Setter @Column(name="email")
    private String email;

    // Password
    @Getter @Setter @Column(name="password")
    private String password;
}
