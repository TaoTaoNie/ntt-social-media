package com.ntt.nttsocialmedia.configuratrions;

import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

/**
 * @author leetHuam
 * @version 1.0
 */
public class MongoReactiveRepositoriesAutoConfigureRegistrar {
    @EnableReactiveMongoRepositories
    private static class EnableReactiveMongoRepositoriesConfiguration {
    }
}
