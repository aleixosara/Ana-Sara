package sysMonstros.controller;

import java.util.ArrayList;
import java.util.Collections;

import sysMonstros.model.MonstrosModel;
import sysMonstros.view.MonstrosView;

public class MonstrosController {

    private final ArrayList<MonstrosModel> monstros;
    private final MonstrosView view;

    public MonstrosController(MonstrosView view) {
        this.monstros = new ArrayList<>();
        this.view = view;
    }

    public void iniciarMenu() {
        int opcao;

        do {
            opcao = view.mostrarMenu();

            switch (opcao) {
                case 1:
                    adicionarMonstro();
                    break;
                case 2:
                    exibirMonstros();
                    break;
                case 3:
                    buscarEspecie();
                    break;
                case 4:
                    ordenarPorEspecie();
                    break;
                case 5:
                    view.mostrarMensagem("Encerrando o programa");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida!");
                    break;
            }
        } while (opcao != 5);
    }

    private void adicionarMonstro() {
        MonstrosModel monstro = view.lerMonstro();
        monstros.add(monstro);
        view.mostrarMensagem("Espécie Cadastrado Com Sucesso!");
    }

    private void exibirMonstros() {
        view.mostrarLista(monstros);
    }

    private void buscarEspecie() {
        String especie = view.buscarEspecie();
        MonstrosModel monstroEncontrado = null;
        for (MonstrosModel monstro : monstros) {
            if (monstro.getEspecie().equalsIgnoreCase(especie)) {
                monstroEncontrado = monstro;
                break;
            }
        }
        view.mostrarMonstro(monstroEncontrado);
    }

    private void ordenarPorEspecie() {
        Collections.sort(monstros);
        view.mostrarLista(monstros);
    }
}
