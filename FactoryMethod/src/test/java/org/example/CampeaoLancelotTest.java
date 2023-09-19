package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampeaoLancelotTest {
    @Test
    void deveUsarSkillQ() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Lancelot");
        assertEquals("Mordida", champ.skillQ());
    }
    @Test
    void deveUsarSkillW() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Lancelot");
        assertEquals("Cabeçada", champ.skillW());
    }
    @Test
    void deveUsarSkillE() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Lancelot");
        assertEquals("Charme", champ.skillE());
    }
    @Test
    void deveUsarSkillUltimate() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Lancelot");
        assertEquals("Guarda de Algodão", champ.skillUltimate());
    }
}