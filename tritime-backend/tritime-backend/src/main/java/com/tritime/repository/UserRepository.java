package com.tritime.repository;

import com.tritime.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Aqui podemos adicionar consultas personalizadas no futuro
}

