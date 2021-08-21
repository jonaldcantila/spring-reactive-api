package com.spring.reactive.service;

import java.time.Duration;

import org.springframework.stereotype.Component;

import com.spring.reactive.model.Foo;

import reactor.core.publisher.Flux;

@Component
public class FooService {

    public Flux<Foo> getAllFoo() {
        return Flux.range(1, 20).delayElements(Duration.ofSeconds(1)).map(i -> new Foo(i, "foo " + i));
    }
}
