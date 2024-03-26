package br.com.fiap.bookingtech.gateway;

import br.com.fiap.bookingtech.entities.ClienteEntity;
import br.com.fiap.bookingtech.interfaces.IClienteGateway;
import br.com.fiap.bookingtech.interfaces.IDatabaseClient;

public class ClienteGateway implements IClienteGateway {

    private final IDatabaseClient databaseClient;

    public ClienteGateway(IDatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    @Override
    public ClienteEntity GravarCliente(ClienteEntity cliente) {
        return this.databaseClient.GravarCliente(cliente);
    }

    @Override
    public ClienteEntity ObterClientePorIdentificacao(ClienteEntity cliente) {
        return this.databaseClient.ObterClientePorIdentificacao(cliente);
    }
}
