package dev.gutuivan.controller;

import dev.gutuivan.model.Phone;
import dev.gutuivan.service.PhoneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phones/")
public class PhoneController {
    private final PhoneService phoneService;

    public PhoneController(PhoneService phoneService){
        super();
        this.phoneService = phoneService;
    }

    @PostMapping
    public ResponseEntity<Phone> create(@RequestBody Phone phone){
        return new ResponseEntity<Phone>(phoneService.save(phone), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Phone> get(){
        return phoneService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Phone> get(@PathVariable("id") long id){
        return new ResponseEntity<Phone>(phoneService.get(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Phone> update(@PathVariable ("id") long id, @RequestBody Phone phone) {
        return new ResponseEntity<Phone>(phoneService.update(id, phone), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Phone> delete(@PathVariable ("id") long id) {
        return new ResponseEntity<Phone>(phoneService.delete(id), HttpStatus.OK);
    }



}
