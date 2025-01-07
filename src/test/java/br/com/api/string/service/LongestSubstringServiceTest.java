package br.com.api.string.service;

import br.com.api.string.domain.LongestSubstring;
import br.com.api.string.domain.exception.InvalidStringException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringServiceTest {

    private LongestSubstringService longestSubstringService;

    @BeforeEach
    void setUp() {
        longestSubstringService = new LongestSubstringService();
    }

    @Test
    void testFindLongestSubstringLength_ValidInput() {
        String input = "abcabcbb";
        LongestSubstring result = longestSubstringService.findLongestSubstring(input);
        assertEquals("abc", result.getValue(), "The longest substring without repeated characters must have length 3");
    }

    //@Test
    void testFindLongestSubstringLength_EmptyString() {
        String input = "";
        InvalidStringException thrown = assertThrows(InvalidStringException.class, () -> {
            longestSubstringService.findLongestSubstring(input);
        });
        assertEquals("The provided string is invalid. It must be non-null and non-empty.", thrown.getMessage());
    }

    //@Test
    void testFindLongestSubstringLength_NullString() {
        String input = null;
        InvalidStringException thrown = assertThrows(InvalidStringException.class, () -> {
            longestSubstringService.findLongestSubstring(input);
        });
        assertEquals("The provided string is invalid. It must be non-null and non-empty.", thrown.getMessage());
    }

    @Test
    void testFindLongestSubstringLength_ValidInput_NoRepeatingChars() {
        String input = "abcdef";
        LongestSubstring result = longestSubstringService.findLongestSubstring(input);
        assertEquals("abcdef", result.getValue(), "The longest substring without repeated characters must have length 6");
    }

    @Test
    void testFindLongestSubstringLength_WithRepeatingChars() {
        String input = "pwwkew";
        LongestSubstring result = longestSubstringService.findLongestSubstring(input);
        assertEquals("wke", result.getValue(), "The longest substring without repeated characters must have length 3");
    }
}
