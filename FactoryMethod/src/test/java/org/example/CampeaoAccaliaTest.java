package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampeaoAccaliaTest {
    @Test
    void deveUsarSkillQ() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Accalia");
        assertEquals("Reverso", champ.skillQ());
    }
    @Test
    void deveUsarSkillW() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Accalia");
        assertEquals("Lança-Chamas", champ.skillW());
    }
    @Test
    void deveUsarSkillE() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Accalia");
        assertEquals("Farejar Odor", champ.skillE());
    }
    @Test
    void deveUsarSkillUltimate() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Accalia");
        assertEquals("Onda de Calor", champ.skillUltimate());
    }
}