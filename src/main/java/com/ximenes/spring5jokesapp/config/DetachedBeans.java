package com.ximenes.spring5jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Berkson Ximenes
 * Date: 02/06/2021
 * Time: 23:01
 */
@Configuration
public class DetachedBeans {

    @Bean
    public ChuckNorrisQuotes chuckGen(){
        return new ChuckNorrisQuotes();
    }
}
