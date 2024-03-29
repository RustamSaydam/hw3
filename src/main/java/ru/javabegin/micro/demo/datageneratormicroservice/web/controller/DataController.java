package ru.javabegin.micro.demo.datageneratormicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javabegin.micro.demo.datageneratormicroservice.model.Data;
import ru.javabegin.micro.demo.datageneratormicroservice.model.test.DataTestOptions;
import ru.javabegin.micro.demo.datageneratormicroservice.service.KafkaDataService;
import ru.javabegin.micro.demo.datageneratormicroservice.service.TestDataService;
import ru.javabegin.micro.demo.datageneratormicroservice.web.dto.DataDto;
import ru.javabegin.micro.demo.datageneratormicroservice.web.dto.DataTestOptionsDto;
import ru.javabegin.micro.demo.datageneratormicroservice.web.mapper.DataMapper;
import ru.javabegin.micro.demo.datageneratormicroservice.web.mapper.DataTestOptionsMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }


    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);
    }
}
