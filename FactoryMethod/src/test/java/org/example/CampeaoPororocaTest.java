package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampeaoPororocaTest {
    @Test
    void deveUsarSkillQ() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Pororoca");
        assertEquals("Absorver", champ.skillQ());
    }
    @Test
    void deveUsarSkillW() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Pororoca");
        assertEquals("Bolhas", champ.skillW());
    }
    @Test
    void deveUsarSkillE() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Pororoca");
        assertEquals("Proteção", champ.skillE());
    }
    @Test
    void deveUsarSkillUltimate() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Pororoca");
        assertEquals("Pulso Dracônico", champ.skillUltimate());
    }
}