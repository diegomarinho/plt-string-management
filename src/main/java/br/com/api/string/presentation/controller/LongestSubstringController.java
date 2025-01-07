package br.com.api.string.presentation.controller;

import br.com.api.string.application.SubstringFinderApplication;
import br.com.api.string.domain.LongestSubstring;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/substrings")
public class LongestSubstringController {

    private final SubstringFinderApplication application;

    @GetMapping("/longest")
    public LongestSubstring getLongestSubstring(@RequestParam String input) {
        return application.execute(input);
    }
}
