package com.example.project_w16.dipendente;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/dipendenti")
@AllArgsConstructor
public class DipendenteController {
    @Autowired
    private final DipendenteService dipendenteService;


    @GetMapping
    public Page<Dipendente> getAllDipendenti(Pageable pageable) {
        return dipendenteService.getAllDipendenti(pageable);
    }

    @PostMapping
    public Dipendente saveDipendente(Dipendente dipendente) {
        return dipendenteService.saveDipendente(dipendente);
    }

    @PutMapping("/{id}")
    public Dipendente modifyDipendente(@PathVariable Long id, @RequestBody DipendenteRequest request) {
        return dipendenteService.saveDipendente(request);
    }

    @DeleteMapping("/{id}")
    public void deleteDipendente(@PathVariable Long id) {
        dipendenteService.deleteDipendente(id);
    }

    @PostMapping("/{id}/uploadImmagine")
    public Dipendente uploadImmagineProfilo(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        String directory = "uploads/";
        Path filePath = Paths.get(directory + file.getOriginalFilename());

        try {
            Files.createDirectories(Paths.get(directory));
            Files.write(filePath, file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException("Errore nel salvataggio del file", e);
        }
        return dipendenteService.updateImmagineProfilo(id, filePath.toString());
    }
}
