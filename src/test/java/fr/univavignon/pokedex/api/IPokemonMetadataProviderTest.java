package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IPokemonMetadataProviderTest {

    private IPokemonMetadataProvider metadataProvider;

    @Before
    public void setUp() {
        metadataProvider = mock(IPokemonMetadataProvider.class);
    }

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        // Création des métadonnées pour l'index 0
        PokemonMetadata expectedMetadata = new PokemonMetadata(0, "Bulbizarre", 118, 118, 90);

        // Définir le comportement du mock pour retourner les métadonnées créées
        when(metadataProvider.getPokemonMetadata(0)).thenReturn(expectedMetadata);

        // Appel de la méthode à tester
        PokemonMetadata actualMetadata = metadataProvider.getPokemonMetadata(0);

        // Vérifier si les métadonnées retournées sont les mêmes que celles créées
        assertEquals(expectedMetadata.getIndex(), actualMetadata.getIndex());
        assertEquals(expectedMetadata.getName(), actualMetadata.getName());
        assertEquals(expectedMetadata.getAttack(), actualMetadata.getAttack());
        assertEquals(expectedMetadata.getDefense(), actualMetadata.getDefense());
        assertEquals(expectedMetadata.getStamina(), actualMetadata.getStamina());
    }

    @Test(expected = PokedexException.class)
    public void testGetPokemonMetadata_InvalidIndex() throws PokedexException {
        // Définir le comportement du mock pour lancer une exception quand un index invalide est passé
        when(metadataProvider.getPokemonMetadata(151)).thenThrow(new PokedexException("Invalid index"));

        // Appel de la méthode avec un index invalide
        metadataProvider.getPokemonMetadata(151);
    }
}
