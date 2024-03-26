package br.com.fiap.bookingtech.gateway;

import br.com.fiap.bookingtech.entities.ReservaEntity;
import br.com.fiap.bookingtech.interfaces.IDatabaseClient;
import br.com.fiap.bookingtech.interfaces.IReservaGateway;

public class ReservaGateway implements IReservaGateway {

    private final IDatabaseClient databaseClient;

    public ReservaGateway(IDatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    @Override
    public ReservaEntity GravarReserva(ReservaEntity reserva) {
        return this.databaseClient.GravarReserva(reserva);
    }

    @Override
    public ReservaEntity ObterTodasAsReservas() {
        return this.databaseClient.ObterTodasAsReservas();
    }

    @Override
    public ReservaEntity AtualizarReserva(ReservaEntity reserva) {
        return this.databaseClient.AtualizarReserva(reserva);
    }
}
