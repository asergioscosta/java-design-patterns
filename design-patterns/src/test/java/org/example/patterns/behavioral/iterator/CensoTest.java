package org.example.patterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        Curso curso = new Curso(
                new Aluno("Augusto", true),
                new Aluno("Lucas", true),
                new Aluno("Maria", false),
                new Aluno("Luiza", true)
        );
        assertEquals(3, Censo.contarAlunosAtivosCurso(curso));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        Curso curso = new Curso(
                new Aluno("Augusto", true),
                new Aluno("Lucas", true),
                new Aluno("Maria", false),
                new Aluno("Luiza", true)
        );
        assertEquals(4, Censo.contarTotalAlunosCurso(curso));
    }

}