package com.yong.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding({DemoSource.class,DemoSink.class})
@EnableAutoConfiguration
public class StreamSendApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamSendApplication.class, args);
    }


}