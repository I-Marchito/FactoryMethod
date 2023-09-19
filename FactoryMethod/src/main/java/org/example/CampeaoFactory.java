package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CampeaoFactory {
    public static Campeao utilizarCampeao(String champ) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Campeao"+ champ);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Campeão inexistente");
        }
        if (!(objeto instanceof Campeao)) {
            throw new IllegalArgumentException("Campeão inválido");
        }
        return (Campeao) objeto;
    }
}