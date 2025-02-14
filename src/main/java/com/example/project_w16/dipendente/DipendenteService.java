package com.example.project_w16.dipendente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
class DipendenteService {
    @Autowired
    private DipendenteRepository dipendenteRepository;

    public Page<Dipendente> getAllDipendenti(Pageable pageable) {
        return dipendenteRepository.findAll(pageable);
    }

    public Dipendente saveDipendente(Dipendente dipendente) {
        return dipendenteRepository.save(dipendente);
    }

    public Dipendente saveDipendente(DipendenteRequest request) {
        Dipendente dipendente = new Dipendente();
        dipendente.setNome(request.getNome());
        dipendente.setCognome(request.getCognome());
        dipendente.setUsername(request.getUsername());
        dipendente.setEmail(request.getEmail());
        dipendente.setImmagineProfilo(request.getImmagineProfilo());
        return saveDipendente(dipendente);
    }

    public void deleteDipendente(Long id) {
        dipendenteRepository.deleteById(id);
    }

    public Dipendente updateImmagineProfilo(Long id, String filePath) {
        Dipendente dipendente = dipendenteRepository.findById(id).orElseThrow();
        dipendente.setImmagineProfilo(filePath);
        return dipendenteRepository.save(dipendente);
    }
}
