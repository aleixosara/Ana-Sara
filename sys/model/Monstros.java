package sys.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Monstros implements Comparable<Monstros> {

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

    public void setHabilidade(String origem) {
        this.origem = origem;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public static Monstros lerCantor() {
        Monstros cantor = new Cantor();

        System.out.println("\nNome do cantor(a): ");
        String nome = LER.nextLine();
        cantor.setNome(nome);

        System.out.println("\nGênero: ");
        String genero = LER.nextLine();
        cantor.setHabilidade(genero);

        System.out.println("\nNome da Música: ");
        String musica = LER.nextLine();
        cantor.setFraqueza(musica);

        System.out.println("\nAdicionar à lista de favoritos? (s/n)");
        char favorito = ' ';

        do {
            favorito = LER.next().charAt(0);

            switch (favorito) {
                case 's':
                    cantor.setFavorito(true);
                    break;

                case 'n':
                    cantor.setFavorito(false);
                    break;

                default:
                    System.out.println("um erro ocorreu, digite novamente");
                    break;
            }
        } while (!(favorito == 's' || favorito == 'n'));

        System.out.println("\nNota (de 0 à 5): ");
        int nota = 0;
        

        do {
            nota = LER.nextInt();
            cantor.setPersonalidade(nota);

            if (nota < 0 || nota > 5) {
                System.out.println("um erro ocorreu, digite novamente");
            }
            
        } while (nota < 0 || nota > 5);

        LER.nextLine();

        return cantor;
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
