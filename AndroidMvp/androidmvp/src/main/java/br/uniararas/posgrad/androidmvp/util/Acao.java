package br.uniararas.posgrad.androidmvp.util;

/**
 * Classe mentida para declarar todas as constantes usadas para identificação de intenções no sistema.
 *
 * Ao invés de criar intenções definindo os alvos de forma explícita, este aplicativo define ações e
 * as utiliza na configuração de filtros de intenção, no manifesto.
 *
 * @author pedrobrigatto
 */
public class Acao {

    /** Ação usada para representar a intenção de navegar até a tela principal do aplicativo */
    public static final String MOSTRA_HOME = "br.uniararas.posgrad.androidmvp.intent.action.MOSTRA_HOME";

    /** Ação usada para representar a intenção de navegar até a tela de detalhes de uma balada */
    public static final String DETALHES_BALADA = "br.uniararas.posgrad.androidmvp.intent.action.DETALHES_BALADA";

    /** Ação usada para representar a intenção de navegar até a tela de cadastro de usuário */
    public static final String CADASTRA_USUARIO = "br.uniararas.posgrad.androidmvp.intent.action.CADASTRA_USUARIO";
}
