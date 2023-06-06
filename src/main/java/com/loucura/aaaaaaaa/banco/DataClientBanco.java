package com.loucura.aaaaaaaa.banco;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loucura.aaaaaaaa.model.DataClient;

@Repository
public interface DataClientBanco extends JpaRepository<DataClient, String> {

    List<DataClient> findByCpfClientOrName(String cpfClient, String name);
    
}
