package com.jjcrojas.pcnube;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class HolaMundoControllerTest {
    private final MockMvc mockMvc = MockMvcBuilders
            .standaloneSetup(new HolaMundoController()).build();

    @ParameterizedTest
    @ValueSource(strings = {"/", "/hola"})
    void respondeHolaMundo(String ruta) throws Exception {
        mockMvc.perform(get(ruta))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith("text/plain"))
                .andExpect(content().string("Hola Mundo"));
    }
}
