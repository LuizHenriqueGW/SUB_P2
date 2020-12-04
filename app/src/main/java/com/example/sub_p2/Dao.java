package com.example.sub_p2;

import java.util.Date;

public class Dao {
    private String Nome;
    private Date DataNascm;
    private int Telefone;
    private String Endereco;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Date getDataNascm() {
        return DataNascm;
    }

    public void setDataNascm(Date dataNascm) {
        DataNascm = dataNascm;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
}
