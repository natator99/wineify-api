package com.mpctek.wineifyapi;

import com.mpctek.wineifyapi.model.Wine;
import com.mpctek.wineifyapi.repository.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class WineifyApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WineifyApiApplication.class, args);
    }

}

@Component
class WineCommandLineRunner implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        for(Wine w : this.wineRepository.findAll()){
            System.out.println("Here: " + w.toString());
        }
    }
    @Autowired
    WineRepository wineRepository;
}