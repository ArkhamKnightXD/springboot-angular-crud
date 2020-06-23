package arkham.knight.crud.controllers;

import arkham.knight.crud.models.Client;
import arkham.knight.crud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping("/clients")
    public List<Client> getAllClients(){

        return clientService.GetAllClients();
    }
}
