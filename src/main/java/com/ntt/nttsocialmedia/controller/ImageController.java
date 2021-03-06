package com.ntt.nttsocialmedia.controller;

import com.ntt.nttsocialmedia.beans.Image;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * @author leetHuam
 * @version 1.0
 */
@RestController
public class ImageController {
    private static final String API_BASE_PATH = "/api";
    @GetMapping(API_BASE_PATH + "/images")
    Flux<Image> images() {
        return Flux.just(new Image("1", "learning-spring-boot-cover.jpg"),
                new Image("2", "learning-spring-boot-2nd-edition-cover.jpg"),
                new Image("3", "bazinga.png"));
    }

    @PostMapping(API_BASE_PATH + "/images")
    Mono<Void> create(@RequestBody Flux<Image> images) {
        return images.map(image -> {
          LoggerFactory.getLogger(ImageController.class).info("We will save " + image + " to a Reactive database soon!");
            return image;
        }).then();
    }
}
