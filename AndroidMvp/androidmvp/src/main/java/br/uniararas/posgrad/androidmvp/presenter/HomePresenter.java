package br.uniararas.posgrad.androidmvp.presenter;

import br.uniararas.posgrad.androidmvp.modelo.Balada;
import br.uniararas.posgrad.androidmvp.view.HomeView;

/**
 * Presenter responsável por manipular eventos gerados na principal interface do usuário com o aplicativo.
 *
 * @author pedrobrigatto
 */
public class HomePresenter implements HomeView.HomeViewHandler {

    /** Interface que permite ao presenter comunicar-se com a view cujos eventos ele manipula */
    private HomeView view;

    public HomePresenter (HomeView view) {
        this.view = view;
    }

    @Override
    public void abrirBaladaSelecionada(Balada balada) {
        // TODO Comunicação com o servidor (ou banco local/memória) para apresentação de balada selecionada
    }
}
