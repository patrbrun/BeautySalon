package com.grouptwo.saloon.api;


import com.grouptwo.saloon.dao.ClientDao;
import com.grouptwo.saloon.model.Client;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
@Api(value = "saloon client")
public class ClientController {
    private ClientDao clientDao;

    @Autowired
    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @ApiOperation(value = "List of all appointments", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Clients retrieved successfully"),
            @ApiResponse(code = 401, message = "Authorization to view resource denied."),
            @ApiResponse(code = 403, message = "Access is forbidden"),
            @ApiResponse(code = 404, message = "Client absent")
    })

    @GetMapping("/list")
    public Iterable<Client> getAllClients(Model model) {
        return clientDao.listClient();
    }

    @ApiOperation(value = "Search Client using ID", response = Client.class)
    @GetMapping("/search/{clientId}")
    public Client searchClient(@PathVariable Integer clientId, Model model) {
        return clientDao.getClientById(clientId);
    }

    @ApiOperation(value = "Save client")
    @PostMapping("/save")
    public ResponseEntity<String> saveClient(@RequestBody Client client, Model model) {
        clientDao.save(client);
        return new ResponseEntity<>("Client saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Update client information")
    @PutMapping(value = "/update/{clientId}")
    public ResponseEntity<String> updateClient(@PathVariable Integer clientId, @RequestBody Client client) {
        Client clientDetails = clientDao.getClientById(clientId);
        clientDetails.setClientEmail(client.getClientEmail());
        clientDetails.setClientName(client.getClientName());
        clientDetails.setPhoneNumber(client.getPhoneNumber());
        return new ResponseEntity<>("Client details updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Delete client")
    @DeleteMapping("/delete/{clientId}")
    public ResponseEntity<String> deleteClient(@PathVariable Integer clientId, Model model) {
        clientDao.deleteClient(clientId);
        return new ResponseEntity<>("client deleted successfully", HttpStatus.OK);
    }
}
