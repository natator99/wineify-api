package com.mpctek.wineifyapi.repository;

import com.mpctek.wineifyapi.model.Wine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WineRepository extends JpaRepository<Wine, Long> {

}