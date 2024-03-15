package entities;

import java.time.LocalDateTime;

public class ReservaEntity {

    private final RestauranteEntity restaurante;
    private final ClienteEntity cliente;
    private final LocalDateTime data, hora;
    private final int quantidadeMesas;

    public ReservaEntity (LocalDateTime data, LocalDateTime hora, int quantidadeMesas, RestauranteEntity restaurante, ClienteEntity cliente){
        if (quantidadeMesas<0){
            throw new IllegalArgumentException("A quantidade de mesas para reservar deve ser maior que 0");
        }
        this.data=data;
        this.hora=hora;
        this.quantidadeMesas=quantidadeMesas;
        this.restaurante = restaurante;
        this.cliente = cliente;
    }


}
