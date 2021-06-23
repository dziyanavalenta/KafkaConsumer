package dvalenta.Consumer.Client;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ClientConsumer {

    @KafkaListener(
            topics = "${topic}",
            containerFactory = "clientKafkaListenerContainerFactory") //I'm going to listen to the topic "jsonClient
    public void consume (Client client){
       // System.out.println("Received Client message: " + client.getClientId()+", "+ client.getEmail()); without
        System.out.println("Received Client message: " + client);
    }
}
