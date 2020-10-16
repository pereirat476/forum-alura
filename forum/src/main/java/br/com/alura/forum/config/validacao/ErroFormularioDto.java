package br.com.alura.forum.config.validacao;

import lombok.Getter;


@Getter
public class ErroFormularioDto {
    private String campo;
    private String erro;

    public ErroFormularioDto(String campo, String erro){
        this.campo = campo;
        this.erro = erro;
    }
}
