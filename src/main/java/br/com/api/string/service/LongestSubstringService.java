package br.com.api.string.service;

import br.com.api.string.domain.LongestSubstring;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

@Service
public class LongestSubstringService {

    // Avoid null or empty strings and validate inputs more securely
    public LongestSubstring findLongestSubstring(String input) {
        return Optional.ofNullable(input)
                .filter(s -> !s.isEmpty())
                .map(s -> IntStream.range(0, s.length())
                        .boxed()
                        .flatMap(i -> IntStream.range(i + 1, s.length() + 1)
                                .mapToObj(j -> s.substring(i, j)))
                        .filter(this::isValid)
                        .max(Comparator.comparingInt(String::length))
                        .orElse(""))
                .map(longest -> new LongestSubstring(longest, longest.length()))
                .orElse(new LongestSubstring("", 0));
    }

    // Using Set to check if substring contains duplicate characters more efficiently
    private boolean isValid(String substring) {
        long distinctCount = substring.chars()
                .distinct()
                .count();
        return distinctCount == substring.length();
    }
}
