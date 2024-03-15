package entities;

import java.time.LocalDateTime;

public class ClienteEntity {

    private final String nome, email, telefone;

    public ClienteEntity (String nome, String email, String telefone){
        if(nome.isEmpty() || email.isEmpty() || telefone.isEmpty()){
            throw new IllegalArgumentException("Nome, email e/ou telefone não podem estar em branco");
        }
        this.nome=nome;
        this.email=email;
        this.telefone=telefone;
    }

}
