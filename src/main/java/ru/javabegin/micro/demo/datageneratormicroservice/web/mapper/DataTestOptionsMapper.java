package ru.javabegin.micro.demo.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.javabegin.micro.demo.datageneratormicroservice.model.test.DataTestOptions;
import ru.javabegin.micro.demo.datageneratormicroservice.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDto> {

}
