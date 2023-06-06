package com.loucura.aaaaaaaa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DataClient{
    
    @Column(name = "Nome" , nullable = false)
    private String name;

    @Id
    @Column(name = "CPF" , nullable = false, length = 11)
    private String cpfClient;

    @Column(name = "Nascido em: " , nullable = false)
    private String bornIn;

    @Column(name = "Email" , nullable = false)
    private String emailClient;

    @Column(name = "Telefone" , length = 13)
    private Integer telephones;

    @Column(name = "Cep" , nullable = false, length = 8)
    private Integer cep;

    @Column(name = "Endereço" , nullable = false)
    private String adress;

    @Column(name = "Numero da residencia" , nullable = false)
    private String houseNumber;
    
    @Column(name = "Complemento")
    private String complement;

    @Column(name = "Bairro" , nullable = false)
    private String neighborhood;

    @Column(name = "Cidade" , nullable = false)
    private String city;

    @Column(name = "Estado" , nullable = false)
    private String regionState;
 
}
