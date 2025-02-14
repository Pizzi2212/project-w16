package com.example.project_w16.viaggio;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ViaggioRequest {
    @NotBlank(message = "Il campo destinazione non puo essere vuoto")
    private String destinazione;
    @NotBlank(message = "Il campo data non puo essere vuoto")
    private String data;
}

