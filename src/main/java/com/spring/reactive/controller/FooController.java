package com.spring.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.reactive.model.Foo;
import com.spring.reactive.service.FooService;

import reactor.core.publisher.Flux;

@RestController
public class FooController {

    @Autowired
    private FooService fooService;

    @GetMapping(value = "/foos", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Foo> getAllFoos() {
        return fooService.getAllFoo();
    }
}
