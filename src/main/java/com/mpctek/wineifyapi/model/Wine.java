package com.mpctek.wineifyapi.model;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Wine {

    private @Id @GeneratedValue Long id;
    private String brand;
    private String fancifulName;
    private int vintage;
    private String wineType;

    public Wine() {}

    public Wine(String brand, String fancifulName, int vintage) {
        this.brand = brand;
        this.fancifulName = fancifulName;
        this.vintage = vintage;
    }
}
