package ru.javabegin.micro.demo.datageneratormicroservice.service;

import ru.javabegin.micro.demo.datageneratormicroservice.model.Data;

public interface KafkaDataService {

    void send(Data data);


}
