package dev.dnaranjo.eOkami.repository;
import dev.dnaranjo.eOkami.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long>{
    
}
