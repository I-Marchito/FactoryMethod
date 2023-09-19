package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampeaoFactoryTest {
    @Test
    void deveRetornarExcecaoParaCampeaoInexistente() {
        try {
            Campeao champ = CampeaoFactory.utilizarCampeao("Calisto");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Campeão inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCampeaoInvalido() {
        try {
            Campeao champ = CampeaoFactory.utilizarCampeao("Celestina");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Campeão inválido", e.getMessage());
        }
    }
}