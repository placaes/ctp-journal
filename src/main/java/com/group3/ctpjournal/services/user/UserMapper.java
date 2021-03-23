package com.group3.ctpjournal.services.user;

import com.group3.ctpjournal.infrastructure.mysql.entity.UserEntity;
import com.group3.ctpjournal.services.category.CategoryMapper;

import java.util.ArrayList;
import java.util.List;

public class UserMapper {

    public static User entityToModel(UserEntity source) {
        if (source == null) {
            return null;
        }

        User user = new User();

        user.setId(source.getId());
        user.setLogin(source.getLogin());
        user.setPassword(source.getPassword());
        user.setCategoryList(CategoryMapper.entityListToModelList(source.getCategoryEntityList()));

        return user;
    }

    public static UserEntity modelToEntity(User source) {
        if (source == null) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId(source.getId());
        userEntity.setLogin(source.getLogin());
        userEntity.setPassword(source.getPassword());

        return userEntity;
    }

    public static List<User> entityListToModelList(List<UserEntity> source) {
        if (source == null) {
            return null;
        }

        List<User> list = new ArrayList<User>(source.size());
        for (UserEntity userEntity : source) {
            list.add(entityToModel(userEntity));
        }

        return list;
    }
}
