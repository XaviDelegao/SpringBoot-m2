package com.example.demoSpringBoot.Repository;

import com.example.demoSpringBoot.Entity.Alumne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumneDAO extends JpaRepository<Alumne,Long> {
}
