package usecases;

import entities.ClienteEntity;
import entities.ReservaEntity;
import entities.RestauranteEntity;
import java.time.LocalDateTime;

public class ReservaUseCases {

    private static final int QUANTIDADE_MESAS = 1;
    private final LocalDateTime dataReserva;

    //Construtor
    public ReservaUseCases (LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }

    public static ReservaEntity RegistrarReserva (ClienteEntity cliente, RestauranteEntity restaurante, LocalDateTime dataReserva){


        ValidarDadosDaReserva(cliente, restaurante, dataReserva);
        ReservaEntity reserva = new ReservaEntity(dataReserva, restaurante, cliente);
        return reserva;
    }

    private static void ValidarDadosDaReserva(ClienteEntity cliente, RestauranteEntity restaurante, LocalDateTime dataReserva){
        if (cliente == null){
            throw new IllegalArgumentException("Cliente não pode ser nulo");
        }
        if (restaurante == null){
            throw new IllegalArgumentException("Restaurante não pode ser nulo");
        }
        if (dataReserva.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Reserva não pode ser no passado");
        }

        //incluir na validação
        // se já foi está reservada
        // se a data está dentro do horário de funcionamento do restaurante
    }
}
