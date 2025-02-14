package com.example.project_w16.prenotazione;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prenotazioni")
@AllArgsConstructor
public class PrenotazioneController {

    @Autowired
    private final PrenotazioneService prenotazioneService;


    @GetMapping
    public Page<Prenotazione> getAllPrenotazioni(Pageable pageable) {
        return prenotazioneService.getAllPrenotazioni(pageable);
    }
    @PostMapping
    public Prenotazione savePrenotazione(Prenotazione prenotazione) {
        return prenotazioneService.savePrenotazione(prenotazione);
    }

   @DeleteMapping("/{id}")
    public void deletePrenotazione(@PathVariable Long id) {
        prenotazioneService.deletePrenotazione(id);
    }

}

