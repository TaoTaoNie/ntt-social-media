package com.ntt.nttsocialmedia;

import com.ntt.nttsocialmedia.repositories.ImageRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author leetHuam
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
public class LiveImageRepositoryTests {
    @Autowired
    ImageRepository repository;
    @Autowired
    MongoOperations operations;
}
