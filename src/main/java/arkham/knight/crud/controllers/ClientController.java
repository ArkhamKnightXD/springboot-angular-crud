package arkham.knight.crud.controllers;

import arkham.knight.crud.models.Client;
import arkham.knight.crud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//Aqui definimos la url que tendra nuestro proyecto corriendo el frontend
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping("/clients")
    public List<Client> getAllClients(){

        return clientService.GetAllClients();
    }


    @PostMapping("/save")
    public void saveClient(@RequestBody Client clientToSave){

        clientService.SaveClient(clientToSave);
    }

    //ojo con la funcion update, tengo que analizar como se trabajara junto al frontend
    @PutMapping(path = "/{id}")
    public void updateClient(@PathVariable("id") Long clientId, @RequestBody Client clientToUpdate){

        clientService.SaveClient(clientToUpdate);
    }


    @DeleteMapping(path = "/{id}")
    public void deleteClient(@PathVariable("id") long clientId){

        clientService.DeleteClient(clientId);
    }
}
