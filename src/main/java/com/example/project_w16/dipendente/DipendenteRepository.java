package com.example.project_w16.dipendente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DipendenteRepository extends JpaRepository<Dipendente, Long> {}