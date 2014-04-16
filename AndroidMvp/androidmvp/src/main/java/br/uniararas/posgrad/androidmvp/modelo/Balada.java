package br.uniararas.posgrad.androidmvp.modelo;

import java.io.Serializable;

/**
 * Representa uma balada no modelo de dados da solução.
 *
 * @author pedrobrigatto
 */
public class Balada implements Serializable {

    private String nome;
    private String descricao;
    private String data;
    private boolean openBar;
    private String endereço;

    public Balada() {
        super();
    }

    /**
     * Construtor usado para crirar uma balada já com valores definidos para todos os atributos.
     *
     * @param nome Nome da balada
     * @param descricao Descrição da balada
     * @param data Data em que a balada ocorrerá
     * @param endereço Endereço da balada
     * @param openBar <code>true</code> se a balada for open bar, <code>false</code> caso contrário
     */
    public Balada (String nome, String descricao, String data, String endereço, boolean openBar) {
        this();
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.endereço = endereço;
        this.openBar = openBar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isOpenBar() {
        return openBar;
    }

    public void setOpenBar(boolean openBar) {
        this.openBar = openBar;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
