package main.service;

import main.entity.Personagem;
import main.enumerator.Operacao;
import main.enumerator.TipoNecessidade;

public class PersonagemService {
    private static final int VALOR_MINIMO_NECESSIDADE = 1;
    private Personagem personagemPricipal;

    public PersonagemService(Personagem personagemPricipal) {
        this.personagemPricipal = personagemPricipal;
    }

    public boolean validaValorNecessidadeMinimo(){
        if(VALOR_MINIMO_NECESSIDADE >= personagemPricipal.getDisposicao()){
            return false;
        }

        if(VALOR_MINIMO_NECESSIDADE >= personagemPricipal.getBexiga()){
            return false;
        }

        if(VALOR_MINIMO_NECESSIDADE >= personagemPricipal.getDiversao()){
            return false;
        }

        if(VALOR_MINIMO_NECESSIDADE >= personagemPricipal.getFome()){
            return false;
        }

        if(VALOR_MINIMO_NECESSIDADE >= personagemPricipal.getHigiene()){
            return false;
        }

        if(VALOR_MINIMO_NECESSIDADE >= personagemPricipal.getSocializacao()){
            return false;
        }

        return true;
    }

    public boolean correr() {
        if (!validaValorNecessidadeMinimo()){
            return false;
        }
        personagemPricipal.mudaNecessidade(TipoNecessidade.FOME, Operacao.DIMINUI);
        personagemPricipal.mudaNecessidade(TipoNecessidade.HIGIENE, Operacao.DIMINUI);
        personagemPricipal.mudaNecessidade(TipoNecessidade.DISPOSICAO, Operacao.DIMINUI);
        personagemPricipal.mudaNecessidade(TipoNecessidade.DIVERSAO, Operacao.AUMENTA);
        return true;
    }

    public void fazerAmizade(Personagem gabriel) {
        personagemPricipal.adicionaAmigo(gabriel);
        gabriel.adicionaAmigo(personagemPricipal);
    }
}
