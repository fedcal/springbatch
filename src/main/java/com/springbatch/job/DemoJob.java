package com.springbatch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoJob {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    //Crea l''istanza all'avvio
    @Bean
    public Job demoJob(){
        return jobBuilderFactory.get("Demo job").start().build();;
    }
}
