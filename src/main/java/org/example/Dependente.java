package org.example;

import java.time.LocalDate;

public class Dependente extends Beneficiario implements Cobertura {

    private Titular titular;
    TipoDependente tipoDependente;

    public Dependente(String nome, LocalDate dataNascimento, String cpf, Titular titular,TipoDependente tipoDependente) {
        super(nome, dataNascimento, cpf);
        this.titular = titular;
        this.tipoDependente = tipoDependente;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public double calcularMensalidade() {
        return calcularMensalidadeBase() * 0.7;
    }

    @Override
    public boolean possuiCobertura(TipoCobertura cobertura) {

        switch (cobertura) {

            case CONSULTA:
            case EXAME:
                return true;

            case INTERNACAO:
                return false;

            default:
                return false;
        }
    }
}