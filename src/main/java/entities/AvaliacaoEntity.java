package entities;

import java.time.LocalDateTime;

public class AvaliacaoEntity {

    private final int nota;
    private final String avaliacao;

    public AvaliacaoEntity (int nota, String avaliacao){
        if(avaliacao.isEmpty()){
            throw new IllegalArgumentException("Avaliação não pode estar em branco!");
        }
        if (nota<1 || nota>5){
            throw new IllegalArgumentException("Nota não pode ser menor que 1 ou maior que 5!");
        }

        this.nota=nota;
        this.avaliacao=avaliacao;
    }

}
