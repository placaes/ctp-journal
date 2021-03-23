package com.group3.ctpjournal.services.input;

import com.group3.ctpjournal.infrastructure.mysql.entity.FieldEntity;
import com.group3.ctpjournal.infrastructure.mysql.entity.InputEntity;
import com.group3.ctpjournal.services.field.Field;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

public class InputMapper {

    public static Input entityToModel(InputEntity source) {
        if (source == null) {
            return null;
        }

        Input input = new Input();

        input.setId(source.getId());
        input.setDate(source.getDate());
        input.setValue(source.getValue());


        return input;
    }


    public static InputEntity modelToEntity(Input source) {
        if (source == null) {
            return null;
        }

        InputEntity inputEntity = new InputEntity();

        inputEntity.setId(source.getId());
        inputEntity.setDate(source.getDate());
        inputEntity.setValue(source.getValue());

        return inputEntity;
    }

    public static List<Input> entityListToModelList(List<InputEntity> source) {
        if (source == null) {
            return null;
        }

        List<Input> list = new ArrayList<Input>(source.size());
        for (InputEntity categoryEntity : source) {
            list.add(entityToModel(categoryEntity));
        }

        return list;
    }
}
