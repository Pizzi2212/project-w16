package com.example.project_w16.viaggio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
class ViaggioService {
    @Autowired
    private ViaggioRepository viaggioRepository;

    public Page<Viaggio> getAllViaggi(Pageable pageable) {
        return viaggioRepository.findAll(pageable);
    }

    public Viaggio saveViaggio(Viaggio viaggio) {
        return viaggioRepository.save(viaggio);
    }

    public Viaggio saveViaggio(ViaggioRequest request) {
        Viaggio viaggio = new Viaggio();
        viaggio.setData(request.getData());
        viaggio.setDestinazione(request.getDestinazione());
        return viaggioRepository.save(viaggio);
    }

    public void deleteViaggio(Long id) {
        viaggioRepository.deleteById(id);
    }

    public Viaggio updateStatoViaggio(Long id, String stato) {
        Viaggio viaggio = viaggioRepository.findById(id).orElseThrow(() -> new RuntimeException("Viaggio non trovato"));
        viaggio.setStato(stato);
        return viaggioRepository.save(viaggio);
    }
}