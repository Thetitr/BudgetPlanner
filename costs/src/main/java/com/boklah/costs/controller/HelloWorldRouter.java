package com.boklah.costs.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

/**
 * Simple router for the root path mapped to helloWorldHandler function.
 */
@Configuration
public class HelloWorldRouter {

    @Bean
    public RouterFunction<ServerResponse> route(HelloWorldHandler helloWorldHandler) {

        return RouterFunctions
                .route(GET("/").and(accept(MediaType.TEXT_PLAIN)), helloWorldHandler::hello);
    }
}
