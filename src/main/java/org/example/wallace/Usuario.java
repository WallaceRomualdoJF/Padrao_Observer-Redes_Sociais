package org.example.wallace;

// Observadores concretos
public class Usuario implements Observer {
    private String nome;
    private String ultimaAtividadeProcessada;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String atividade) {
        processarAtividade(atividade);
    }

    private void processarAtividade(String atividade) {
        // Lógica de processamento da notificação para o usuário
        if (atividade.startsWith(nome)) {
            // Lógica adicional para processar a atividade relacionada ao usuário
            if (atividade.contains("atualizou seu status")) {
                processarStatus();
            } else if (atividade.contains("postou uma foto")) {
                processarFoto();
            }
        }
    }

    private void processarStatus() {
        // Lógica adicional para processar o status do usuário
        ultimaAtividadeProcessada = "Status atualizado: " + nome;
    }

    private void processarFoto() {
        // Lógica adicional para processar a foto do usuário
        ultimaAtividadeProcessada = "Nova foto postada: " + nome;
    }

    public String getUltimaAtividadeProcessada() {
        return ultimaAtividadeProcessada;
    }
}