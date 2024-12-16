package sys.controller;

import sys.model.MonstrosModel;
import sys.view.*;
import sys.model.Monstros;

public class MonstrosController {
    private void cadastrarMonstro(){
        monstros.add(monstro);
        view.mostrarMensagem("Monstro cadastrado com sucesso!");

    }

    private void exibirMonstro(){
        view.mostrarLista(monstros);
    }

    private void buscarMonstro(){
        String nome = view.adicionarNome();
        MonstrosModel monstroEncontrado = null;
        for (MonstrosModel monstro : monstros) {
            if(monstro.getNome().equalsIgnoreCase(nome)){
                monstroEncontrado = monstro;
                break;
            }
            
        }
    }
    
}