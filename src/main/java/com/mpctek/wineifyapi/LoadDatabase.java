//package com.mpctek.wineifyapi;
//
//import lombok.extern.slf4j.Slf4j;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@Slf4j
//class LoadDatabase {
//
//    @Bean
//    CommandLineRunner initDatabase(WineRepository repository) {
//        return args -> {
//            log.info("Preloading " + repository.save(new Wine("Bilbo Baggins", "burglar", 2017)));
//            log.info("Preloading " + repository.save(new Wine("Frodo Baggins", "thief", 2016)));
//        };
//    }
//}