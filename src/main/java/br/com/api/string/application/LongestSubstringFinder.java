package br.com.api.string.application;

import br.com.api.string.domain.LongestSubstring;
import br.com.api.string.service.LongestSubstringService;

public class LongestSubstringFinder {

    private final LongestSubstringService service;

    public LongestSubstringFinder(LongestSubstringService service) {
        this.service = service;
    }

    public LongestSubstring findLongestSubstring(String input) {
        return service.findLongestSubstring(input);
    }
}
