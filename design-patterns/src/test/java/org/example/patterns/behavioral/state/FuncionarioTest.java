package org.example.patterns.behavioral.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void SetUp() {
        funcionario = new Funcionario();
    }

    //Funcionario Afastado

    @Test
    void naodeveRetornarAfastarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    void deveRetornarAposentarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertTrue(funcionario.aposentar());
        assertEquals(FuncionarioEstadoAposentado.getInstance(), funcionario.getEstado());
    }

    @Test
    void naodeveRetornarContratarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    void deveRetornarDesligarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioEstadoDesligado.getInstance(), funcionario.getEstado());
    }

    @Test
    void naodeveRetornarEfetivarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.efetivar());
    }

    @Test
    void naodeveRetornarExperienciaFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.experiencia());
    }

    //Funcionario Aposentado

    @Test
    void naodeveRetornarAfastarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    void naodeveRetornarAposentarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    void naodeveRetornarContratarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    void naodeveRetornarDesligarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.desligar());
    }

    @Test
    void naodeveRetornarEfetivarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.efetivar());
    }

    @Test
    void naodeveRetornarExperienciaFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.experiencia());
    }

    //Funcionario Contratado

    @Test
    void naodeveRetornarContratarFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    void deveRetornarAfastarFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertTrue(funcionario.afastar());
        assertEquals(FuncionarioEstadoAfastado.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarAposentarFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertTrue(funcionario.aposentar());
        assertEquals(FuncionarioEstadoAposentado.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarDesligarFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioEstadoDesligado.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarEfetivarFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertTrue(funcionario.efetivar());
        assertEquals(FuncionarioEstadoEfetivo.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarExperienciaFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertTrue(funcionario.experiencia());
        assertEquals(FuncionarioEstadoExperiencia.getInstance(), funcionario.getEstado());
    }

    // Funcionario Desligado

    @Test
    void naodeveRetornarAfastarFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    void naodeveRetornarAposentarFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    void naodeveRetornarContratarFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    void naodeveRetornarDesligarFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.desligar());
    }

    @Test
    void naodeveRetornarEfetivarFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.efetivar());
    }

    @Test
    void naodeveRetornarExperienciaFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.experiencia());
    }

    // Funcionario Efetivo

    @Test
    void deveRetornarAfastarFuncionarioEfetivo() {
        funcionario.setEstado(FuncionarioEstadoEfetivo.getInstance());
        assertTrue(funcionario.afastar());
        assertEquals(FuncionarioEstadoAfastado.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarAposentarFuncionarioEfetivo() {
        funcionario.setEstado(FuncionarioEstadoEfetivo.getInstance());
        assertTrue(funcionario.aposentar());
        assertEquals(FuncionarioEstadoAposentado.getInstance(), funcionario.getEstado());
    }

    @Test
    void naodeveRetornarContratarFuncionarioEfetivo() {
        funcionario.setEstado(FuncionarioEstadoEfetivo.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    void deveRetornarDesligarFuncionarioEfetivo() {
        funcionario.setEstado(FuncionarioEstadoEfetivo.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioEstadoDesligado.getInstance(), funcionario.getEstado());
    }

    @Test
    void naodeveRetornarEfetivarFuncionarioEfetivo() {
        funcionario.setEstado(FuncionarioEstadoEfetivo.getInstance());
        assertFalse(funcionario.efetivar());
    }

    @Test
    void naodeveRetornarExperienciaFuncionarioEfetivo() {
        funcionario.setEstado(FuncionarioEstadoEfetivo.getInstance());
        assertFalse(funcionario.experiencia());
    }

    //Funcionario Experiencia

    @Test
    void deveRetornarAfastarFuncionarioExperiencia() {
        funcionario.setEstado(FuncionarioEstadoExperiencia.getInstance());
        assertTrue(funcionario.afastar());
        assertEquals(FuncionarioEstadoAfastado.getInstance(), funcionario.getEstado());
    }

    @Test
    void naodeveRetornarAposentarFuncionarioExperiencia() {
        funcionario.setEstado(FuncionarioEstadoExperiencia.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    void naodeveRetornarContratarFuncionarioExperiencia() {
        funcionario.setEstado(FuncionarioEstadoExperiencia.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    void deveRetornarDesligarFuncionarioExperiencia() {
        funcionario.setEstado(FuncionarioEstadoExperiencia.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioEstadoDesligado.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarEfetivarFuncionarioExperiencia() {
        funcionario.setEstado(FuncionarioEstadoExperiencia.getInstance());
        assertTrue(funcionario.efetivar());
        assertEquals(FuncionarioEstadoEfetivo.getInstance(), funcionario.getEstado());
    }

    @Test
    void naodeveRetornarExperienciaFuncionarioExperiencia() {
        funcionario.setEstado(FuncionarioEstadoExperiencia.getInstance());
        assertFalse(funcionario.experiencia());
    }

}