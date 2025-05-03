package org.example.patterns.creational.factorymethod;

public class BeneficioFactory {

    public static IBeneficio obterBeneficio(String beneficio) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.patterns.creational.factorymethod.Beneficio" + beneficio);
            objeto = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Beneficio inexistente");
        }
        if (!(objeto instanceof IBeneficio)) {
            throw new IllegalArgumentException("Beneficio inválido");
        }
        return (IBeneficio) objeto;
    }
}
