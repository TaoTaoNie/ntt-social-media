package com.ntt.nttsocialmedia.service;

import org.springframework.core.io.Resource;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

/**
 * @author leetHuam
 * @version 1.0
 */
@Service
public class BlockingImageService {
    private ImageService imageService;

    public BlockingImageService(ImageService imageService) {
        this.imageService = imageService;
    }

    public Resource findOneImage(String filename) {
        return imageService.findOneImage(filename).block(Duration.ofSeconds(30));
    }

    public void createImage(List<FilePart> fileParts) {
        imageService.createImage(Flux.fromIterable(fileParts)).block(Duration.ofMinutes(1));
    }
}
