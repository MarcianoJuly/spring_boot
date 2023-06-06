package com.loucura.aaaaaaaa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
// Spring
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loucura.aaaaaaaa.banco.DataClientBanco;
import com.loucura.aaaaaaaa.model.DataClient;

import lombok.AllArgsConstructor;

// Java
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/ListController")

@AllArgsConstructor
public class ListController {
   
    private final DataClientBanco dataClientRepositorio;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public @ResponseBody List<DataClient> list(){
        return dataClientRepositorio.findAll();
    }

    @GetMapping("/{CPF}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<DataClient>> listData(@PathVariable("CPF") String CPF){
        List<DataClient> result = dataClientRepositorio.findByCpfClientOrName(CPF, CPF);
        if (!result.isEmpty()) {
            return ResponseEntity.ok().body(result);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/edit/{CPF}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Optional<DataClient> pegaDado(@PathVariable("CPF") String CPF){
        return dataClientRepositorio.findById(CPF);
    }

    @DeleteMapping("/{CPF}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Void> delete(@PathVariable("CPF") String CPF) {
        dataClientRepositorio.deleteById(CPF);
        return ResponseEntity.noContent().<Void>build();    
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @CrossOrigin(origins = "http://localhost:4200")
    public DataClient create(@RequestBody DataClient data){
        return dataClientRepositorio.save(data); 
    }
}
