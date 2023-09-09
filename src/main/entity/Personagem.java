package main.entity;

import main.enumerator.FaseVida;
import main.enumerator.Operacao;
import main.enumerator.TipoNecessidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private LocalDate nascimento;
    private String apelido;

    private static final int VALOR_PADRAO_OU_MAXIMO_NECESSIDADES = 10;
    private int disposicao;

    private int higiene;

    private int socializacao;

    private int fome;

    private int diversao;

    private int bexiga;

    private FaseVida faseVida;

    private List<Personagem> amigos;

    public Personagem(String nome, LocalDate nascimento) {
        this();
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Personagem() {
        this.diversao = VALOR_PADRAO_OU_MAXIMO_NECESSIDADES;
        this.socializacao = VALOR_PADRAO_OU_MAXIMO_NECESSIDADES;
        this.fome = VALOR_PADRAO_OU_MAXIMO_NECESSIDADES;
        this.disposicao = VALOR_PADRAO_OU_MAXIMO_NECESSIDADES;
        this.higiene = VALOR_PADRAO_OU_MAXIMO_NECESSIDADES;
        this.bexiga = VALOR_PADRAO_OU_MAXIMO_NECESSIDADES;
        this.amigos = new ArrayList<>();
    }

    public void mudaNecessidade(TipoNecessidade necessidade, Operacao operacao){
        switch (necessidade){
            case FOME -> {
                if (operacao.equals(Operacao.AUMENTA)) {
                    fome++;
                } else {
                    fome--;
                }
            }
            case BEXIGA -> {
                if (operacao.equals(Operacao.AUMENTA)) {
                    bexiga++;
                } else {
                    bexiga--;
                }
            }
            case HIGIENE -> {
                if (operacao.equals(Operacao.AUMENTA)) {
                    higiene++;
                } else {
                    higiene--;
                }
            }
            case DIVERSAO -> {
                if (operacao.equals(Operacao.AUMENTA)) {
                    diversao++;
                } else {
                    diversao--;
                }
            }
            case DISPOSICAO -> {
                if (operacao.equals(Operacao.AUMENTA)) {
                    disposicao++;
                } else {
                    disposicao--;
                }
            }
            case SOCIALIZACAO -> {
                if (operacao.equals(Operacao.AUMENTA)) {
                    socializacao++;
                } else {
                    socializacao--;
                }
            }
        }
    }

    public void adicionaAmigo(Personagem personagem){
        amigos.add(personagem);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }




    @Override
    public String toString() {
        return "Personagem{" +
                "disposicao=" + disposicao +
                ", higiene=" + higiene +
                ", socializacao=" + socializacao +
                ", fome=" + fome +
                ", diversao=" + diversao +
                ", bexiga=" + bexiga +
                '}';
    }

    public int getDisposicao() {
        return disposicao;
    }

    public void setDisposicao(int disposicao) {
        this.disposicao = disposicao;
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }

    public int getSocializacao() {
        return socializacao;
    }

    public void setSocializacao(int socializacao) {
        this.socializacao = socializacao;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getDiversao() {
        return diversao;
    }

    public void setDiversao(int diversao) {
        this.diversao = diversao;
    }

    public int getBexiga() {
        return bexiga;
    }

    public void setBexiga(int bexiga) {
        this.bexiga = bexiga;
    }

    public FaseVida getFaseVida() {
        return faseVida;
    }

    public void setFaseVida(FaseVida faseVida) {
        this.faseVida = faseVida;
    }

    public List<Personagem> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Personagem> amigos) {
        this.amigos = amigos;
    }
}
