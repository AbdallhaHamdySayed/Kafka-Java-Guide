package net.javaguides.springboot.kafka;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.utils.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumer.class);

    // String Message
//    @KafkaListener(topics = AppConstants.TOPIC_NAME,
//            groupId = AppConstants.GROUP_ID)
//    public void consume(String message){
//        LOGGER.info(String.format("Message received -> %s", message));
//    }

    // Json Message
    @KafkaListener(topics = AppConstants.TOPIC_NAME,
            groupId = AppConstants.GROUP_ID)
    public void consume(User data){
        LOGGER.info(String.format("Message received -> %s", data.toString()));
    }
}