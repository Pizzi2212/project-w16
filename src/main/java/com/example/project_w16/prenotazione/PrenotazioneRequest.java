package com.example.project_w16.prenotazione;


import com.example.project_w16.dipendente.Dipendente;
import com.example.project_w16.viaggio.Viaggio;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrenotazioneRequest {

    @NotBlank(message = "Il campo data richiesta non puo essere vuoto")
    private String dataRichiesta;
    @NotBlank(message = "Il campo note non puo essere vuoto")
    private String note;


    @NotBlank (message = "Il campo viaggio non puo essere vuoto")
    private Viaggio viaggio;

    @NotBlank (message = "Il campo dipendente non puo essere vuoto")
    private Dipendente dipendente;


}
