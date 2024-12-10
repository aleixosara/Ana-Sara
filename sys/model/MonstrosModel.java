package sys.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MonstrosModel implements Comparable<MonstrosModel> {

    final static Scanner LER = new Scanner(System.in);

    private String nome = null;
    private String fraqueza = null;
    private float altura = 0;
    private float peso = 0;
    private int dano = 0;
    private int velocidade = 0;
    private String origem = null;
    private String cla = null;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
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

        System.out.println("\nNome: ");
        String nome = LER.nextLine();
        monstro.setNome(nome);

        System.out.println("\nFraqueza: ");
        String fraqueza = LER.nextLine();
        monstro.setFraqueza(fraqueza);

        System.out.println("\nAltura: ");
        float altura = LER.nextFloat();
        monstro.setAltura(altura);

        System.out.println("\nPeso: ");
        float peso = LER.nextFloat();
        monstro.setAltura(peso);

        System.out.println("\nDano: ");
        int dano = LER.nextInt();
        monstro.setAltura(dano);

        System.out.println("\nVelocidade (km/h): ");
        int velocidade = LER.nextInt();
        monstro.setAltura(altura);

        System.out.println("\nOrigem: ");
        String origem = LER.nextLine();
        monstro.(origem);

        System.out.println("\nFamília/Clã: ");
        float altura = LER.nextFloat();
        monstro.setAltura(altura);

        LER.nextLine();

        return monstro;
    }

    public ArrayList<String> addCantor(ArrayList<String> cantoresList) {
        cantoresList.add(habilidade);
        return cantoresList;
    }

    @Override
    public int compareTo(Cantor outro) {
        return this.nome.compareToIgnoreCase(outro.getNome());
    }

    public void print(Cantor cantor) {
        System.out.println("\n" + cantor.getNome());
        System.out.println("gênero: " + cantor.getHabilidade());
        System.out.println("música: " + cantor.getFraqueza());
        System.out.println("favoritado: " + cantor.getAltura());
        System.out.println("nota: " + cantor.getCla());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((habilidade == null) ? 0 : habilidade.hashCode());
        result = prime * result + ((fraqueza == null) ? 0 : fraqueza.hashCode());
        result = prime * result + (altura ? 1231 : 1237);
        result = prime * result + cla;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cantor other = (Cantor) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (habilidade == null) {
            if (other.genero != null)
                return false;
        } else if (!habilidade.equals(other.genero))
            return false;
        if (fraqueza == null) {
            if (other.musica != null)
                return false;
        } else if (!fraqueza.equals(other.musica))
            return false;
        if (altura != other.favorito)
            return false;
        if (cla != other.nota)
            return false;
        return true;
    }
}
