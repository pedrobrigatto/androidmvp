package br.uniararas.posgrad.androidmvp.view;

import br.uniararas.posgrad.androidmvp.modelo.Usuario;

/**
 * Interface que define o modelo de comunicação com uma view para operação de login.
 *
 * @author pedrobrigatto
 */
public interface LoginView {

    public void definirLoginViewHandler(LoginViewHandler viewHandler);

    /**
     * Interface que define métodos de retorno da operação de login.
     *
     * @author pedrobrigatto
     */
    interface LoginViewHandler {

        /**
         * Realiza o login a partir de um usuário fornecido.
         *
         * @param usuario Usuário que deseja se logar no aplicativo
         * @param callback Objeto que receberá o retorno da operação de login
         */
        void realizarLogin(Usuario usuario, LoginCallback callback);
    }

    /**
     * Callback usado para que o resultado da operação de login seja processado.
     */
    interface LoginCallback {

        /** Constante que indica que o usuário que buscou se logar existe no sistema. */
        byte USUARIO_OK = 0;

        /** Constante que indica que o usuário que buscou se logar não existe no sistema. */
        byte USUARIO_NOK = 1;

        /**
         * Operação que indica o status da operação de login, uma vez que ela já tenha sido concluída.
         *
         * @param usuario Dados do usuário que buscou se logar no aplicativo.
         * @param status Status que indica o resultado da operação de login.
         */
        public void operacaoFinalizada (Usuario usuario, byte status);
    }
}
