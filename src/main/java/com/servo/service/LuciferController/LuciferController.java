package com.servo.service.LuciferController;

import com.servo.service.LuciferJPA.LuciferJPA;
import com.servo.service.LuciferPojo.LuciferPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LuciferController {

    @Autowired
    private LuciferJPA luciferJPA;

    @GetMapping("/Lucifer")
    public ResponseEntity<List<LuciferPojo>> getLuciferPojoList(){
        List<LuciferPojo> luciferPojoList = luciferJPA.findAll();

        return new ResponseEntity<>(luciferPojoList,HttpStatus.CREATED);
    }

    @GetMapping("/Lucifer1/{HellId}")
    public ResponseEntity<Optional<LuciferPojo>> getLuciferPojoListById(@PathVariable int HellId){
        Optional<LuciferPojo> luciferPojoList = luciferJPA.findById(HellId);

        return new ResponseEntity<>(luciferPojoList,HttpStatus.CREATED);
    }

    @PostMapping("/addLucifer/{HellId}/{name}/{version}")
    public void addLucifer(@PathVariable int HellId,@PathVariable String name,@PathVariable String version){
        LuciferPojo lf = new LuciferPojo();
        lf.setHellId(HellId);
        lf.setHellName(name);
        lf.setHellVersion(version);
        luciferJPA.save(lf);
    }

    @DeleteMapping("/deleteLucifer/{id}")
    public void deleteLucifer(@PathVariable int id){
        luciferJPA.deleteById(id);
    }


}
