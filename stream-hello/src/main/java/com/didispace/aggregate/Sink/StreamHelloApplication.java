package com.didispace.aggregate.Sink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableBinding(Sink.class)
public class StreamHelloApplication {

    private static Logger logger = LoggerFactory.getLogger(StreamHelloApplication.class);

    //    @ServiceActivator(inputChannel=Sink.INPUT)
//    public void loggerSink(Object payload) {
//        logger.info("Received: " + payload);
//    }
    public static void main(String[] args) {
        SpringApplication.run(StreamHelloApplication.class, args);
    }
}