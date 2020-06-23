package arkham.knight.crud;

import arkham.knight.crud.models.Client;
import arkham.knight.crud.services.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClientService clientService){
        return args -> {

            Client clientToCreate = new Client();

            clientToCreate.setName("kevin");

            clientToCreate.setLastName("Rodriguez");

            clientService.CreateClient(clientToCreate);

        };
    }
}
