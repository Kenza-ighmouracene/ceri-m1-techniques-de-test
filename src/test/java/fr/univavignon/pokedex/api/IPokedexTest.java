package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.Comparator;
import java.util.List;

public class IPokedexTest {

    private IPokedex pokedex;

    @Before
    public void setUp() {
        pokedex = mock(IPokedex.class);
    }

    @Test
    public void testSize() {
        // Ajout de quelques Pokémon au Pokédex
        pokedex.addPokemon(new Pokemon(1, "Lhotfii", 118, 118, 90, 500, 100, 100, 50, 80));
        pokedex.addPokemon(new Pokemon(2, "KeeZaa", 151, 151, 120, 800, 150, 150, 100, 85));

        // Vérification de la taille du Pokédex
        assertEquals(2, pokedex.size());
    }

    @Test
    public void testAddPokemon() {
        // Ajout d'un Pokémon au Pokédex
        int index = pokedex.addPokemon(new Pokemon(1, "Lhotfii", 118, 118, 90, 500, 100, 100, 50, 80));

        // Vérification de l'index du Pokémon ajouté
        assertEquals(0, index);
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        // Ajout d'un Pokémon au Pokédex
        pokedex.addPokemon(new Pokemon(1, "Lhotfii", 118, 118, 90, 500, 100, 100, 50, 80));

        // Récupération du Pokémon ajouté
        Pokemon pokemon = pokedex.getPokemon(0);

        // Vérification des attributs du Pokémon
        assertEquals("Lhotfii", pokemon.getName());
        assertEquals(118, pokemon.getAttack());
        assertEquals(118, pokemon.getDefense());
        assertEquals(90, pokemon.getStamina());
    }

    @Test
    public void testGetPokemons() {
        // Ajout de quelques Pokémon au Pokédex
        pokedex.addPokemon(new Pokemon(1, "Lhotfii", 118, 118, 90, 500, 100, 100, 50, 80));
        pokedex.addPokemon(new Pokemon(2, "KeeZaa", 151, 151, 120, 800, 150, 150, 100, 85));

        // Récupération de tous les Pokémon du Pokédex
        List<Pokemon> pokemonList = pokedex.getPokemons();

        // Vérification du nombre de Pokémon récupérés
        assertEquals(2, pokemonList.size());
    }

    @Test
    public void testGetPokemonsSorted() {
        // Ajout de quelques Pokémon au Pokédex
        pokedex.addPokemon(new Pokemon(1, "Lhotfii", 118, 118, 90, 500, 100, 100, 50, 80));
        pokedex.addPokemon(new Pokemon(2, "KeeZaa", 151, 151, 120, 800, 150, 150, 100, 85));

        // Récupération de tous les Pokémon du Pokédex, triés par index
        List<Pokemon> pokemonList = pokedex.getPokemons(Comparator.comparing(Pokemon::getIndex));

        // Vérification de l'ordre des Pokémon récupérés
        assertEquals("Lhotfii", pokemonList.get(0).getName());
        assertEquals("KeeZaa", pokemonList.get(1).getName());
    }
}
