package sysMonstros.view;

import javax.swing.*;

import sysMonstros.model.MonstrosModel;

import java.util.ArrayList;

public class MonstrosView {

    public int mostrarMenu() {
        String menu = """
                Escolha uma opção:
                1. Adicionar Espécie
                2. Exibir Todos Os Monstros
                3. Buscar Monstro Por Espécie
                4. Ordenar Monstros Por Dano
                5. Sair
                """;

        return Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.QUESTION_MESSAGE));
    }

    public MonstrosModel lerMonstro() {

        String especie = JOptionPane.showInputDialog(null, "Espécie:", "Inserir Espécie", JOptionPane.QUESTION_MESSAGE);
        String fraqueza = JOptionPane.showInputDialog(null, "Fraqueza:", "Inserir Fraqueza", JOptionPane.QUESTION_MESSAGE);
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Altura:", "Inserir Altura", JOptionPane.QUESTION_MESSAGE));
        int dano = Integer.parseInt(JOptionPane.showInputDialog(null, "Dano:", "Inserir Capacidade De Dano", JOptionPane.QUESTION_MESSAGE));
        int velocidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Velocidade:", "Inserir Velocidade", JOptionPane.QUESTION_MESSAGE));
        String origem = JOptionPane.showInputDialog(null, "Origem:", "Inserir Origem", JOptionPane.QUESTION_MESSAGE);
        String cla = JOptionPane.showInputDialog(null, "Família/Clã:", "Inserir Família/Clã", JOptionPane.QUESTION_MESSAGE);

        MonstrosModel monstro = new MonstroModel(especie, fraqueza, altura, dano, velocidade, origem, cla);

        return monstro;
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarLista(ArrayList<MonstrosModel> monstros) {
        if (monstros.isEmpty()) {
            mostrarMensagem("Nenhum Monstro Inserido");
            return;
        }

        StringBuilder sb = new StringBuilder("Lista de Espécies:\n");
        for (MonstrosModel monstro : monstros) {
            sb.append(monstro.toString()).append("\n");
        }

        mostrarMensagem(sb.toString());
    }

    public String buscarEspécie() {
        return JOptionPane.showInputDialog(null, "Digite o Nome da Espécie:", "Buscar Espécie", JOptionPane.QUESTION_MESSAGE);
    }

    public void mostrarJedi(MonstrosModel monstro) {
        if (monstro == null) {
            mostrarMensagem("Monstro Não Encontrado");
        } else {
            mostrarMensagem(monstro.toString());
        }
    }
}