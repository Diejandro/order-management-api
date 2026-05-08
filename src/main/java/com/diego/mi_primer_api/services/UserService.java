package com.diego.mi_primer_api.services;

import com.diego.mi_primer_api.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User save (User user);

}
