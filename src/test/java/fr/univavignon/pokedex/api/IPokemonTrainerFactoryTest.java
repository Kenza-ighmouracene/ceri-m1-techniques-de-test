package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IPokemonTrainerFactoryTest {

    private IPokemonTrainerFactory trainerFactory;
    private IPokedexFactory pokedexFactory;

    @Before
    public void setUp() {
        // Initialisation des mocks ou des instances réelles selon les besoins
        pokedexFactory = mock(IPokedexFactory.class);

    }

    @Test
    public void testCreateTrainer() {
        // Création d'un nouvel entraîneur avec un Pokédex vide
        PokemonTrainer trainer = trainerFactory.createTrainer("Ash", Team.MYSTIC, pokedexFactory);

        // Vérification des attributs de l'entraîneur
        assertEquals("Ash", trainer.getName());
        assertEquals(Team.MYSTIC, trainer.getTeam());
        assertNotNull(trainer.getPokedex());
        assertEquals(0, trainer.getPokedex().size());
    }
}
