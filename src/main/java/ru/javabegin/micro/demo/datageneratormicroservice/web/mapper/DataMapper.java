package ru.javabegin.micro.demo.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.javabegin.micro.demo.datageneratormicroservice.model.Data;
import ru.javabegin.micro.demo.datageneratormicroservice.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {

}
