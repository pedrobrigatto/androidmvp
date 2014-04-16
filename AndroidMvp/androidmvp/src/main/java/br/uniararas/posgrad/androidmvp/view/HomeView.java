package br.uniararas.posgrad.androidmvp.view;

import br.uniararas.posgrad.androidmvp.modelo.Balada;

/**
 * Interface que define o conjunto de funcionalidades visível da view principal do aplicativo.
 *
 * @author pedrobrigatto
 */
public interface HomeView {

    public void definirViewHandler(HomeViewHandler handler);

    /**
     * Interface que define o conjunto de habilidades esperadas em um objeto que manipula instâncias
     * da view principal do aplicativo.
     *
     * @author pedrobrigatto
     */
    interface HomeViewHandler {

        /**
         * Abre uma balada selecionada na view.
         *
         * @param balada Balada selecionada.
         */
        void abrirBaladaSelecionada (Balada balada);
    }
}
