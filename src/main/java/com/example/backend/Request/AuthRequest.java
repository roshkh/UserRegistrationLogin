package com.example.backend.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class AuthRequest {
    @NotNull
    private String username;
    private String password;

}
