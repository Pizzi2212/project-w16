package com.example.project_w16.prenotazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Page<Prenotazione> getAllPrenotazioni(Pageable pageable) {
        return prenotazioneRepository.findAll(pageable);
    }

    public Prenotazione savePrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    public void deletePrenotazione(Long id) {
        prenotazioneRepository.deleteById(id);
    }

}