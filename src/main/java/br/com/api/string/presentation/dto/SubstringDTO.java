package br.com.api.string.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SubstringDTO {

    private String value;
    private int length;
}
