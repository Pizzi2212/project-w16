package com.example.project_w16.viaggio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ViaggioRepository extends JpaRepository<Viaggio, Long> {}