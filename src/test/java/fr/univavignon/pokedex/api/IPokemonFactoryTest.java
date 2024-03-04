package fr.univavignon.pokedex.api;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonFactoryTest {

    private IPokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        pokemonFactory = mock(IPokemonFactory.class);
    }

    @Test
    public void testCreatePokemon() {
        // Définition des métadonnées pour les deux exemples
        PokemonMetadata metadata1 = new PokemonMetadata(0, "Bulbizarre", 126, 126, 90);
        PokemonMetadata metadata2 = new PokemonMetadata(133, "Aquali", 186, 168, 260);

        // Création des Pokémons avec les métadonnées spécifiées
        Pokemon pokemon1 = new Pokemon(0, "Bulbizarre", 613, 64, 4000, 4,5,22,2,22);
        Pokemon pokemon2 = new Pokemon(133, "Aquali", 2729, 202, 5000, 4,3,4,2,1);

        // Définir le comportement attendu de la méthode createPokemon sur le mock
        when(pokemonFactory.createPokemon(0, "Bulbizarre", 613, 64, 4000, 4)).thenReturn(pokemon1);
        when(pokemonFactory.createPokemon(133, "Aquali", 2729, 202, 5000, 4)).thenReturn(pokemon2);

        // Appeler la méthode createPokemon sur le mock avec les paramètres correspondants
        Pokemon actualPokemon1 = pokemonFactory.createPokemon(0, "Bulbizarre", 613, 64, 4000, 4);
        Pokemon actualPokemon2 = pokemonFactory.createPokemon(133, "Aquali", 2729, 202, 5000, 4);

        // Vérifier que les Pokémon retournés par la méthode sont ceux attendus
        assertEquals(pokemon1, actualPokemon1);
        assertEquals(pokemon2, actualPokemon2);
    }
}
