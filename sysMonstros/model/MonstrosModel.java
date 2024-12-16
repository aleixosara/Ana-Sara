package sysMonstros.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MonstrosModel implements Comparable<MonstrosModel> {

    final static Scanner LER = new Scanner(System.in);

    private String especie = null;
    private String fraqueza = null;
    private float altura = 0;
    private int dano = 0;
    private int velocidade = 0;
    private String origem = null;
    private String cla = null;

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public int getDano() {
        return this.dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public static MonstrosModel lerMonstro() {
        MonstrosModel monstro = new MonstrosModel();

        System.out.println("\nEspécie: ");
        String especie = LER.nextLine();
        monstro.setEspecie(especie);

        System.out.println("\nFraqueza: ");
        String fraqueza = LER.nextLine();
        monstro.setFraqueza(fraqueza);

        System.out.println("\nAltura: ");
        float altura = LER.nextFloat();
        monstro.setAltura(altura);

        System.out.println("\nDano: ");
        int dano = LER.nextInt();
        monstro.setAltura(dano);

        System.out.println("\nVelocidade (km/h): ");
        int velocidade = LER.nextInt();
        monstro.setAltura(altura);

        System.out.println("\nOrigem: ");
        String origem = LER.nextLine();
        monstro.setOrigem(origem);

        System.out.println("\nFamília/Clã: ");
        String cla = LER.nextLine();
        monstro.setAltura(altura);

        LER.nextLine();

        return monstro;
    }

    @Override
    public int compareTo(Monstros outro) {
        return this.especie.compareToIgnoreCase(outro.getEspecie());
    }
}
