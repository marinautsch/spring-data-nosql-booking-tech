package br.com.fiap.bookingtech.interfaces;

import br.com.fiap.bookingtech.entities.AvaliacaoEntity;

public interface IAvaliacaoGateway {

    public AvaliacaoEntity GravarAvaliacao (AvaliacaoEntity avaliacao);
}
