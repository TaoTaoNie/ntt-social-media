package com.ntt.nttsocialmedia.configuratrions;

import com.mongodb.async.client.MongoClient;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.ReactiveMongoRepositoryConfigurationExtension;
import org.springframework.data.mongodb.repository.support.ReactiveMongoRepositoryFactoryBean;

/**
 * @author leetHuam
 * @version 1.0
 */
@Configuration
@ConditionalOnClass({ MongoClient.class,
        ReactiveMongoRepository.class })
@ConditionalOnMissingBean({
        ReactiveMongoRepositoryFactoryBean.class,
        ReactiveMongoRepositoryConfigurationExtension.class })
@ConditionalOnProperty(prefix = "spring.data.mongodb.reactiverepositories", name = "enabled",
        havingValue = "true", matchIfMissing = true)
@Import(MongoReactiveRepositoriesAutoConfigureRegistrar.class)
@AutoConfigureAfter(MongoReactiveDataAutoConfiguration.class)
public class MongoReactiveRepositoriesAutoConfiguration {
}
