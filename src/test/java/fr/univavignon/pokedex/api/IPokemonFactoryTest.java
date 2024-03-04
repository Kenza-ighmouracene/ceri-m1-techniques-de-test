package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class IPokemonFactoryTest {

    private IPokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        pokemonFactory = mock(IPokemonFactory.class);
    }

    @Test
    public void testCreatePokemon() {
        // Création d'un nouveau Pokemon
        Pokemon pokemon = pokemonFactory.createPokemon(1, 500, 100, 100, 50);

        // Vérification des attributs du Pokemon
        assertEquals(1, pokemon.getIndex());
        assertEquals(500, pokemon.getCp());
        assertEquals(100, pokemon.getHp());
        assertEquals(100, pokemon.getDust());
        assertEquals(50, pokemon.getCandy());
    }
}
