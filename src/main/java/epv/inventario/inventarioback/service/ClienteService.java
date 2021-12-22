package epv.inventario.inventarioback.service;

import epv.inventario.inventarioback.entity.Cliente;
import epv.inventario.inventarioback.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listar(){

        return  clienteRepository.findAll();
    }

}
