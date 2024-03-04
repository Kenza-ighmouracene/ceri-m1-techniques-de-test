package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IPokemonMetadataProviderTest {

    private IPokemonMetadataProvider metadataProvider;

    @Before
    public void setUp() {
        // Initialisation du mock ou de l'instance réelle selon les besoins
        metadataProvider = mock(IPokemonMetadataProvider.class);
    }

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        // Définition du comportement attendu du mock
        PokemonMetadata expectedMetadata = new PokemonMetadata(1, "Bulbasaur", 118, 118, 90);
        when(metadataProvider.getPokemonMetadata(1)).thenReturn(expectedMetadata);

        // Appel de la méthode à tester
        PokemonMetadata actualMetadata = metadataProvider.getPokemonMetadata(1);

        // Assertion
        assertEquals(expectedMetadata, actualMetadata);
    }
}
