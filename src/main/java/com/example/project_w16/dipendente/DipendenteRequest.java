package com.example.project_w16.dipendente;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DipendenteRequest {
    @NotBlank(message = "Il campo nome non puo essere vuoto")
    private String nome;
    @NotBlank(message = "Il campo cognome non puo essere vuoto")
    private String cognome;

    @NotBlank(message = "Il campo username non puo essere vuoto")
    private String username;

    private String immagineProfilo;

    @NotBlank(message = "Il campo email non puo essere vuoto")
    @Email(message = "Email non valida")
    private String email;
}

