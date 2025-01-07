package br.com.api.string.application;

import br.com.api.string.domain.LongestSubstring;
import br.com.api.string.domain.exception.InvalidStringException;
import br.com.api.string.service.LongestSubstringService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class SubstringFinderApplicationTest {

    private LongestSubstringService longestSubstringService;
    private SubstringFinderApplication substringFinderApplication;

    @BeforeEach
    void setUp() {
        longestSubstringService = mock(LongestSubstringService.class);
        substringFinderApplication = new SubstringFinderApplication(longestSubstringService);
    }

    @Test
    void testFindLongestSubstring() {
        String input = "abcabcbb";
        when(longestSubstringService.findLongestSubstring(input)).thenReturn(new LongestSubstring("abc", 3));

        LongestSubstring result = substringFinderApplication.execute(input);

        assertEquals("abc", result.getValue());
        verify(longestSubstringService, times(1)).findLongestSubstring(input);
    }

    @Test
    void testFindLongestSubstring_InvalidInput() {
        String input = "";

        when(longestSubstringService.findLongestSubstring(input)).thenThrow(new InvalidStringException("A string fornecida é inválida. Deve ser não nula e não vazia."));

        InvalidStringException thrown = assertThrows(InvalidStringException.class, () -> {
            substringFinderApplication.execute(input);
        });

        assertEquals("A string fornecida é inválida. Deve ser não nula e não vazia.", thrown.getMessage());
    }
}
