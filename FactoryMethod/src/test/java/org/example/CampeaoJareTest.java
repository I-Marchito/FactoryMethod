package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampeaoJareTest {
    @Test
    void deveUsarSkillQ() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Jare");
        assertEquals("Presa Gélida", champ.skillQ());
    }
    @Test
    void deveUsarSkillW() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Jare");
        assertEquals("Rabo D'Água", champ.skillW());
    }
    @Test
    void deveUsarSkillE() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Jare");
        assertEquals("Agilidade", champ.skillE());
    }
    @Test
    void deveUsarSkillUltimate() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Jare");
        assertEquals("Bomba Hidráulica", champ.skillUltimate());
    }

}