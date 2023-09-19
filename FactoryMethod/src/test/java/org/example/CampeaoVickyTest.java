package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampeaoVickyTest {
    @Test
    void deveUsarSkillQ() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Vicky");
        assertEquals("Cântigo Soturno", champ.skillQ());
    }
    @Test
    void deveUsarSkillW() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Vicky");
        assertEquals("Ácido", champ.skillW());
    }
    @Test
    void deveUsarSkillE() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Vicky");
        assertEquals("Raio Lunar", champ.skillE());
    }
    @Test
    void deveUsarSkillUltimate() {
        Campeao champ = CampeaoFactory.utilizarCampeao("Vicky");
        assertEquals("Raio Solar", champ.skillUltimate());
    }
}