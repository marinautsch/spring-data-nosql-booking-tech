package br.com.fiap.bookingtech.gateway;

import br.com.fiap.bookingtech.entities.AvaliacaoEntity;
import br.com.fiap.bookingtech.interfaces.IAvaliacaoGateway;
import br.com.fiap.bookingtech.interfaces.IDatabaseClient;

public class AvaliacaoGateway implements IAvaliacaoGateway {

    private final IDatabaseClient databaseClient;

    public AvaliacaoGateway(IDatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    @Override
    public AvaliacaoEntity GravarAvaliacao(AvaliacaoEntity avaliacao) {
        return this.databaseClient.GravarAvaliacao(avaliacao);
    }
}
