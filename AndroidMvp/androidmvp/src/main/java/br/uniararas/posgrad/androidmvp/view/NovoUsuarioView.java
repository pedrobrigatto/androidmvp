package br.uniararas.posgrad.androidmvp.view;

import br.uniararas.posgrad.androidmvp.modelo.Usuario;

/**
 * Protocolo de comunicação entre uma view de cadastro de novos usuários e objetos responsáveis por
 * manipular e dar vazão a esse procedimento.
 *
 * @author Pedro Brigatto
 */
public interface NovoUsuarioView {

    void definirViewHandler (NovoUsuarioViewHandler handler);

    /**
     * Modelo de comportamento de objetos que pretendem manipular as ações iniciadas na view de
     * cadastro de usuários.
     *
     * @author pedrobrigatto
     */
    interface NovoUsuarioViewHandler {

        /**
         * Cadastra um novo usuário no sistema.
         *
         * @param usuario Usuário a ser cadastrado
         * @param callback Objeto que tratará o resultado da operação de cadastro do usuário fornecido
         */
        void cadastrarUsuario (Usuario usuario, CallbackCadastroUsuario callback);
    }

    /**
     * Utilizado para informar o resultado da operação de cadastro.
     *
     * @author pedrobrigatto
     */
    interface CallbackCadastroUsuario {

        byte SUCESSO = 0;
        byte FALHA_SISTEMA_INDISPONIVEL = 1;
        byte FALHA_USERNAME_EM_USO = 2;

        /**
         * Informa o resultado da operação de cadastro de um usuário.
         *
         * @param status O estado da operação de cadastro, já encerrada
         * @param usuario O usuário cujo cadastro foi concluído, com o status indicado
         */
        void operacaoConcluida(byte status, Usuario usuario);
    }
}
