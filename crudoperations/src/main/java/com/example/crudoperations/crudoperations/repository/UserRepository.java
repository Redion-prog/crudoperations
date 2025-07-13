package com.example.crudoperations.crudoperations.repository;

import com.example.crudoperations.crudoperations.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//kjo eshte  shtresa qe  eshte e pergjegjshme per manipulimin e te dhenave
@Repository

public class UserRepository {
    private final List<User> users = new ArrayList<>();
    //zakonisht perdoret nje repository per te  ruajtur userat
    //duke qene se nuk kemi database e stimulojme  vet kete  mekanizem

    private Long nextId = 1L;

    //metode  qe gjen te  gjithe userat

    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    public Optional<User> findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    //kemi ruajtjen e user ű
    public User save(User user) {
        user.setId(nextId++);
        users.add(user);
        return user;

    }

    public void deleteById(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }

    public User update(Long id, User updateUser) {
        Optional<User> existingUser = findById(id);
        if (existingUser.isPresent()) {
            User existingOptUser = existingUser.get();
            existingOptUser.setName(updateUser.getName());
            existingOptUser.setEmail(updateUser.getEmail());
            return existingOptUser;
        }
            return null;


    }


}


