package arkham.knight.crud.services;

import arkham.knight.crud.models.Client;
import arkham.knight.crud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


    public List<Client> GetAllClients(){

        return clientRepository.findAll();
    }


    public void CreateClient(Client clientToCreate){

        clientRepository.save(clientToCreate);
    }
}
