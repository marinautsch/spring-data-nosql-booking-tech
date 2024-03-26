package br.com.fiap.bookingtech.entities;

import java.time.LocalDateTime;

public class ReservaEntity {

    private final RestauranteEntity restaurante;
    private final ClienteEntity cliente;
    private final LocalDateTime dataReserva;

    public ReservaEntity (LocalDateTime dataReserva, RestauranteEntity restaurante, ClienteEntity cliente){
        this.dataReserva=dataReserva;
        this.restaurante = restaurante;
        this.cliente = cliente;
    }
}
