package br.uniararas.posgrad.androidmvp.presenter;

import br.uniararas.posgrad.androidmvp.modelo.Usuario;
import br.uniararas.posgrad.androidmvp.view.LoginView;

/**
 * Responsável por manipular eventos da tela de login.
 *
 * @author Pedro Brigatto
 */
public class LoginPresenter implements LoginView.LoginViewHandler {

    /** Interface que permite ao presenter comunicar-se com a view cujos eventos ele manipula */
    private LoginView view;

    public LoginPresenter (LoginView view) {
        this.view = view;
    }

    @Override
    public void realizarLogin(Usuario usuario, LoginView.LoginCallback callback) {
        // TODO Chama o serviço de login, que se conecta ao back-end para verificar a existência do usuário
        // Por enquanto estou apenas indicando que o usuário existe, em todos os casos.
        callback.operacaoFinalizada(usuario, LoginView.LoginCallback.USUARIO_OK);
    }
}
