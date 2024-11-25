package com.demo.spring_json_logging_demo.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MyLogger implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyLogger.class);

    @Override
    public void run(String... args) throws Exception {
        LOGGER.atInfo().setMessage("Hello structured logging!").addKeyValue("userId", "1").log();
    }
}
