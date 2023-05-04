package com.example.demoSpringBoot.Repository;

import com.example.demoSpringBoot.Entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaDAO extends JpaRepository<Empresa,String> {
}
