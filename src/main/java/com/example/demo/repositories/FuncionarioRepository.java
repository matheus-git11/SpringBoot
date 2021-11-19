	package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {

}
