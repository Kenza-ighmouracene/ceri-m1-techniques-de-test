package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class IPokemonTrainerFactoryTest {

    private IPokemonTrainerFactory trainerFactory;
    private IPokedexFactory pokedexFactory;

    @Before
    public void setUp() {
        // Initialisation des mocks ou des instances réelles selon vos besoins
        pokedexFactory = mock(IPokedexFactory.class);

    }

    @Test
    public void testCreateTrainer() {
        // Création d'un PokémonTrainer avec les valeurs spécifiées
        PokemonTrainer trainer = trainerFactory.createTrainer("Ash", Team.VALOR, pokedexFactory);

        // Vérification des attributs du PokémonTrainer créé
        assertEquals("Ash", trainer.getName());
        assertEquals(Team.VALOR, trainer.getTeam());
    }
}
