package com.jjcrojas.pcnube;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping(value = {"/", "/hola"}, produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludar() {
        return "Hola Mundo";
    }
}
