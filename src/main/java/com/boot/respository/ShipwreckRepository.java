package com.boot.respository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Major on 9/01/2017.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{

}
