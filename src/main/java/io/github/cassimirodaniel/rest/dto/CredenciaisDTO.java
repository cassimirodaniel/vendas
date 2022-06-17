package io.github.cassimirodaniel.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.stream.Stream;

@Data
@NoArgsConstructor
public class CredenciaisDTO {
    private String login;
    private String senha;
}