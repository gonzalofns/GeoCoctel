package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

import com.mongodb.MongoClient;



//@Configuration
public class SpringMongoConfig {

    @Value("${spring.data.mongodb.uri}")
    private String uri;
    
    @Value ("${spring.data.mongodb.database}")
    private String database;

    @Autowired
    private MongoDbFactory mongoDbFactory;

    public @Bean MongoDbFactory mongoDBFactory() throws Exception {
    	
        return new SimpleMongoDbFactory(new MongoClient(), database);
    }

    public @Bean MongoTemplate mongoTemplate() throws Exception {

        DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDbFactory);

        // Remove _class
        MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, new MongoMappingContext());
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

        return new MongoTemplate(mongoDBFactory(), converter);

    }

}