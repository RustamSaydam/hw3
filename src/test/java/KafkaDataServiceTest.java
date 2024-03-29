
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ru.javabegin.micro.demo.datageneratormicroservice.model.Data;
import ru.javabegin.micro.demo.datageneratormicroservice.service.KafkaDataService;
import ru.javabegin.micro.demo.datageneratormicroservice.web.controller.DataController;
import ru.javabegin.micro.demo.datageneratormicroservice.web.dto.DataDto;

import static org.mockito.Mockito.*;


public class KafkaDataServiceTest {

    @Mock
    private KafkaDataService kafkaDataService;

    @InjectMocks
    private DataController dataController;
    @Mock
    private Data data;

    @Mock
    private DataDto dataDto;
    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSendMessageToKafka() {
        doNothing().when(kafkaDataService).send(data);
        dataController.send(dataDto);
        verify(dataController).send(dataDto);

    }
}

