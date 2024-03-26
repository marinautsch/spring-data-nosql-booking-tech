package br.com.fiap.bookingtech.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RestauranteEntity {

    private final String nome, endereco, tipoCozinha;
    private final LocalDateTime horarioFuncionamentoInicio;
    private final LocalDateTime horarioFuncionamentoTermino;
    private final int capacidade;

    private final ArrayList<AvaliacaoEntity> avaliacoes;

    public RestauranteEntity (String nome, String endereco, String tipoCozinha, LocalDateTime horarioFuncionamentoInicio, LocalDateTime horarioFuncionamentoTermino, int capacidade){
        if(nome.isEmpty() || endereco.isEmpty() || tipoCozinha.isEmpty()){
            throw new IllegalArgumentException("Nome, endereço e/ou tipo de cozinha não podem estar em branco");
        }
        if (capacidade<0){
            throw new IllegalArgumentException("A capacidade de reserva deve ser maior que 0");
        }

        this.nome=nome;
        this.endereco=endereco;
        this.tipoCozinha=tipoCozinha;
        this.horarioFuncionamentoInicio=horarioFuncionamentoInicio;
        this.horarioFuncionamentoTermino=horarioFuncionamentoTermino;
        this.capacidade=capacidade;
        this.avaliacoes=new ArrayList<AvaliacaoEntity>();
    }

    public void addAvaliacao (AvaliacaoEntity avaliacao){
        this.avaliacoes.add(avaliacao);
    }
    public ArrayList <AvaliacaoEntity> getAvaliacoes(){
        return avaliacoes;
    }

}
