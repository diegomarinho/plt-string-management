package br.com.api.string.repository;

import br.com.api.string.domain.Substring;

import java.util.List;

public interface SubstringRepository {
    void save(Substring substring);
    List<Substring> findAll();
}
