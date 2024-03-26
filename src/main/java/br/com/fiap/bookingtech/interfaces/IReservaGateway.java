package br.com.fiap.bookingtech.interfaces;

import br.com.fiap.bookingtech.entities.ReservaEntity;

public interface IReservaGateway {
    public ReservaEntity GravarReserva (ReservaEntity reserva);

    public ReservaEntity ObterTodasAsReservas ();

    public ReservaEntity AtualizarReserva (ReservaEntity reserva);
}
