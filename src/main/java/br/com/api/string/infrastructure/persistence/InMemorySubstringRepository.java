package br.com.api.string.infrastructure.persistence;

import br.com.api.string.domain.Substring;
import br.com.api.string.repository.SubstringRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemorySubstringRepository implements SubstringRepository {

    private final List<Substring> substrings = new ArrayList<>();

    @Override
    public void save(Substring substring) {
        substrings.add(substring);
    }

    @Override
    public List<Substring> findAll() {
        return new ArrayList<>(substrings);
    }
}
