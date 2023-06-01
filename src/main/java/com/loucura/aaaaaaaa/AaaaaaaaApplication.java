package com.loucura.aaaaaaaa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.loucura.aaaaaaaa.banco.DataClientBanco;
import com.loucura.aaaaaaaa.model.DataClient;

@SpringBootApplication
public class AaaaaaaaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AaaaaaaaApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(DataClientBanco dataClientBanco){
		return args->{
			dataClientBanco.deleteAll();

			DataClient a = new DataClient();
			a.setName("Teste");
			a.setCpfClient("212212122");
			
			dataClientBanco.save(a);
		};
	}

}
