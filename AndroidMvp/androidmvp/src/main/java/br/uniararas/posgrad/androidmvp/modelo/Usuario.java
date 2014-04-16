package br.uniararas.posgrad.androidmvp.modelo;

import java.io.Serializable;

/**
 * Representação de um usuário no sistema.
 *
 * @author pedrobrigatto
 */
public class Usuario implements Serializable {

    private String nome;
    private String username;
    private String senha;

    public Usuario() {
        super();
    }

    /**
     * Criação de um objeto representando um usuário com as informações de acesso ao sistema.
     *
     * @param username Username do usuário
     * @param senha Senha de acesso ao aplicativo/sistema
     */
    public Usuario (String username, String senha) {
        this();
        this.username = username;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
