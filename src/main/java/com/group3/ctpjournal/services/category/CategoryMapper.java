package com.group3.ctpjournal.services.category;

import com.group3.ctpjournal.infrastructure.mysql.entity.CategoryEntity;
import com.group3.ctpjournal.services.field.FieldMapper;

import java.util.ArrayList;
import java.util.List;

public class CategoryMapper {
    public static Category entityToModel(CategoryEntity source) {
        if (source == null) {
            return null;
        }

        Category category = new Category();

        category.setId(source.getId());
        category.setName(source.getName());
        category.setFieldList(FieldMapper.entityListToModelList(source.getFieldEntityList()));

        return category;
    }


    public static CategoryEntity modelToEntity(Category source) {
        if (source == null) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId(source.getId());
        categoryEntity.setName(source.getName());


        return categoryEntity;
    }

    public static List<Category> entityListToModelList(List<CategoryEntity> source) {
        if (source == null) {
            return null;
        }

        List<Category> list = new ArrayList<Category>(source.size());
        for (CategoryEntity categoryEntity : source) {
            list.add(entityToModel(categoryEntity));
        }

        return list;
    }
}
