package com.loucura.aaaaaaaa.controller;

// Spring
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loucura.aaaaaaaa.banco.DataClientBanco;
import com.loucura.aaaaaaaa.model.DataClient;

import lombok.AllArgsConstructor;

// Java
import java.util.List;

@RestController
@RequestMapping("/api/ListController")

@AllArgsConstructor
public class ListController {
   
    private final DataClientBanco dataClientRepositorio;

    @GetMapping
        public List<DataClient> list(){
            return dataClientRepositorio.findAll();
        }
}
