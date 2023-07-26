package com.example.Backend;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here if needed
}

//UserRepository interface, which extends the JpaRepository interface.
// By extending JpaRepository,UserRepository inherits all the methods provided
// by JpaRepository for performing CRUD operations on the User entity.