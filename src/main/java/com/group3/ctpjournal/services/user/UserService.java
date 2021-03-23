package com.group3.ctpjournal.services.user;

import com.group3.ctpjournal.infrastructure.mysql.repository.UserRepository;
import com.group3.ctpjournal.services.field.Field;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return UserMapper.entityListToModelList(repository.findAll());
    }

    public User createUser(User user) {
        return UserMapper.entityToModel(repository.save(UserMapper.modelToEntity(user)));
    }

    public User readUser(Integer userId) {
        return UserMapper.entityToModel(repository.findById(userId).orElse(null));
    }

    public User updateUser(User user, Integer userId) {
        return UserMapper.entityToModel(repository.save(UserMapper.modelToEntity(user)));
    }

    public void deleteUser(Integer userId) {
        repository.deleteById(userId);
    }
}
