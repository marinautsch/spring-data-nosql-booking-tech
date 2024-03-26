package br.com.fiap.bookingtech.interfaces;

import br.com.fiap.bookingtech.entities.ClienteEntity;
import br.com.fiap.bookingtech.entities.RestauranteEntity;


public interface IClienteGateway {

    public ClienteEntity GravarCliente (ClienteEntity cliente);
    public ClienteEntity ObterClientePorIdentificacao (ClienteEntity cliente);
}
