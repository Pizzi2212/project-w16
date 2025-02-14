package com.example.project_w16.dipendente;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DipendenteRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

