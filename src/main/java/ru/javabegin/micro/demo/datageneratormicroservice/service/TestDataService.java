package ru.javabegin.micro.demo.datageneratormicroservice.service;

import ru.javabegin.micro.demo.datageneratormicroservice.model.test.DataTestOptions;

public interface TestDataService {
    void sendMessages(DataTestOptions testOptions);
}
