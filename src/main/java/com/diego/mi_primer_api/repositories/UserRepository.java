package com.diego.mi_primer_api.repositories;

import com.diego.mi_primer_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
