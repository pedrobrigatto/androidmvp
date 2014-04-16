package br.uniararas.posgrad.androidmvp.presenter;

import br.uniararas.posgrad.androidmvp.modelo.Usuario;
import br.uniararas.posgrad.androidmvp.view.NovoUsuarioView;

/**
 * Presenter responsável por manipular os principais eventos ocorridos na tela de cadastro de usuário
 *
 * @author Pedro Brigatto
 */
public class NovoUsuarioPresenter implements NovoUsuarioView.NovoUsuarioViewHandler {

    /** Interface que permite ao presenter comunicar-se com a view cujos eventos ele manipula */
    private NovoUsuarioView view;

    public NovoUsuarioPresenter (NovoUsuarioView view) {
        this.view = view;
    }

    @Override
    public void cadastrarUsuario(Usuario usuario, NovoUsuarioView.CallbackCadastroUsuario callback) {
        // TODO será chamado um serviço para executar este procedimento.
    }
}
