package com.group3.ctpjournal.services.field;

import com.group3.ctpjournal.infrastructure.mysql.entity.FieldEntity;
import com.group3.ctpjournal.services.input.InputMapper;

import java.util.ArrayList;
import java.util.List;


public class FieldMapper {
    public static Field entityToModel(FieldEntity source) {
        if (source == null) {
            return null;
        }

        Field field = new Field();

        field.setId(source.getId());
        field.setName(source.getName());
        field.setType(source.getType());
        field.setInputList(InputMapper.entityListToModelList(source.getInputEntityList()));

        return field;
    }


    public static FieldEntity modelToEntity(Field source) {
        if (source == null) {
            return null;
        }

        FieldEntity fieldEntity = new FieldEntity();

        fieldEntity.setId(source.getId());
        fieldEntity.setName(source.getName());
        fieldEntity.setType(source.getType());

        return fieldEntity;
    }

    public static List<Field> entityListToModelList(List<FieldEntity> source) {
        if (source == null) {
            return null;
        }

        List<Field> list = new ArrayList<Field>(source.size());
        for (FieldEntity fieldEntity : source) {
            list.add(entityToModel(fieldEntity));
        }

        return list;
    }
}
