package br.com.api.string.service;

import br.com.api.string.domain.Substring;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class SubstringValidationService {

    public boolean validate(Substring substring) {
        return Optional.ofNullable(substring)
                .map(s -> s.getLength() > 0 && isValid(s.getValue()))
                .orElse(false);
    }

    // Using Stream to check if there are any duplicate characters in the string
    private boolean isValid(String value) {
        Set<Character> seen = new HashSet<>();
        return value.chars()
                .allMatch(c -> seen.add((char) c));
    }

}
