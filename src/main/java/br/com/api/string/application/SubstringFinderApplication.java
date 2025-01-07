package br.com.api.string.application;

import br.com.api.string.domain.LongestSubstring;
import br.com.api.string.service.LongestSubstringService;
import org.springframework.stereotype.Service;

@Service
public class SubstringFinderApplication {

    private final LongestSubstringFinder finder;

    public SubstringFinderApplication(LongestSubstringService service) {
        this.finder = new LongestSubstringFinder(service);
    }

    public LongestSubstring execute(String input) {
        return finder.findLongestSubstring(input);
    }
}
