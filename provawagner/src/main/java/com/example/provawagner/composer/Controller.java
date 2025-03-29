package com.example.provawagner.composer;

import com.example.provawagner.model.Aluno;
import com.example.provawagner.model.Professor;
import com.example.provawagner.model.Pessoa;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/escola")
public class Controller {
    public List<Pessoa> pessoas = new ArrayList<>();

    @RequestMapping("/listarAlunos")
    public List<Aluno> listarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                alunos.add((Aluno) pessoa);
            }
        }
        return alunos;
    }

    @RequestMapping("/listarProfessores")
    public List<Professor> listarProfessores() {
        List<Professor> professores = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Professor) {
                professores.add((Professor) pessoa);
            }
        }
        return professores;
    }

    @PostMapping("/inserirAluno")
    public Aluno inserirAluno(@RequestBody @Valid Aluno aluno) {
        pessoas.add(aluno);
        return aluno;
    }

    @PostMapping("/inserirProfessor")
    public Professor inseriProfessor(@RequestBody Professor professor) {
        pessoas.add(professor);
        return (professor);
    }

    @PutMapping("/atualizarAluno")
    public String atualizarAluno(@RequestBody Aluno alunoAtualizado) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i)instanceof Aluno && pessoas.get(i).getCpf().equals(alunoAtualizado.getCpf()) && pessoas.get(i).getIdade() >= 18) {
                pessoas.set(i, alunoAtualizado);
                return "Aluno atualizado com sucesso!";
            }
        }
        return "Aluno deve ser maior de idade!";
    }
}

    
        
