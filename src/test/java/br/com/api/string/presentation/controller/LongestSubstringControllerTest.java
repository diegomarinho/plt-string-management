package br.com.api.string.presentation.controller;

import br.com.api.string.application.SubstringFinderApplication;
import br.com.api.string.domain.LongestSubstring;
import br.com.api.string.domain.exception.InvalidStringException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(LongestSubstringController.class)
class LongestSubstringControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private SubstringFinderApplication substringFinderApplication;

    @InjectMocks
    private LongestSubstringController longestSubstringController;

    @BeforeEach
    void setUp() {
        longestSubstringController = new LongestSubstringController(substringFinderApplication);
    }

    //@Test
    void testGetLongestSubstring_ValidInput() throws Exception {
        String input = "abcabcbb";
        String expectedResponse = "Length of longest substring without repeated characters: 3";

        when(substringFinderApplication.execute(input)).thenReturn(new LongestSubstring("abc", 3));

        mockMvc.perform(get("/longest")
                        .param("input", input)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedResponse));

        verify(substringFinderApplication, times(1)).execute(input);
    }

    //@Test
    void testGetLongestSubstring_InvalidInput() throws Exception {
        String input = "";
        String expectedResponse = "The provided string is invalid. It must be non-null and non-empty.";

        when(substringFinderApplication.execute(input)).thenThrow(new InvalidStringException(expectedResponse));

        mockMvc.perform(get("/longest")
                        .param("input", input)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(content().string(expectedResponse));

        verify(substringFinderApplication, times(1)).execute(input);
    }
}
