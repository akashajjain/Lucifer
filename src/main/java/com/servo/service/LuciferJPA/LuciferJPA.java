package com.servo.service.LuciferJPA;

import com.servo.service.LuciferPojo.LuciferPojo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LuciferJPA extends JpaRepository<LuciferPojo,Integer> {
}
