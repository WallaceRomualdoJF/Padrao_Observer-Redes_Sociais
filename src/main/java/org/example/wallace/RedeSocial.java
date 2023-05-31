package org.example.wallace;

import java.util.ArrayList;
import java.util.List;

// Objeto observado
public class RedeSocial {
    private List<Observer> observadores;

    public RedeSocial() {
        observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String atividade) {
        for (Observer observador : observadores) {
            observador.notificar(atividade);
        }
    }

    // Método para simular uma nova atividade na rede social
    public void novaAtividade(String atividade) {
        notificarObservadores(atividade);
    }
}
