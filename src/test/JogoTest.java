package test;

import main.entity.Personagem;
import main.service.PersonagemService;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JogoTest {

    @Test
    public void inicioJogo(){
        Personagem thais = new Personagem("Thais", LocalDate.of(2000,06,18));
        PersonagemService thaisService = new PersonagemService(thais);

        thaisService.correr();
        assertEquals(9,thais.getDisposicao());
        assertEquals(9,thais.getHigiene());
        assertEquals(9,thais.getFome());
        assertEquals(11,thais.getDiversao());
    }

    @Test
    public void fazerAmizade(){
        Personagem thais = new Personagem("Thais", LocalDate.of(2000,06,18));
        PersonagemService thaisService = new PersonagemService(thais);
        Personagem gabriel = new Personagem("Gabriel", LocalDate.of(2000,12,13));

        thaisService.fazerAmizade(gabriel);

        assertEquals(thais.getAmigos(), List.of(gabriel));
        assertEquals(gabriel.getAmigos(), List.of(thais));
    }
}
