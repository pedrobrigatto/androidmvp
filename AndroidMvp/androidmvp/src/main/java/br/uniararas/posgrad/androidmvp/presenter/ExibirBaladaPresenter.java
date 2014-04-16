package br.uniararas.posgrad.androidmvp.presenter;

import br.uniararas.posgrad.androidmvp.modelo.Balada;
import br.uniararas.posgrad.androidmvp.modelo.Usuario;
import br.uniararas.posgrad.androidmvp.view.DetalhesBaladaView;

/**
 * Presenter responsável por manipular eventos gerados durante a visualização/edição de uma balada.
 *
 * @author Pedro Brigatto
 */
public class ExibirBaladaPresenter implements DetalhesBaladaView.DetalhesBaladaViewHandler {

    /**
     * Interface que define o modelo de comunicação entre uma tela de exibição/edição de dados de uma
     * balada e objetos que necessitam interagir com ela (como é o caso deste presenter)
     */
    private DetalhesBaladaView view;

    public ExibirBaladaPresenter(DetalhesBaladaView view) {
        this.view = view;
    }

    @Override
    public void participar(Balada balada, DetalhesBaladaView.CallbackParticipacao callback) {
        // TODO Comunicação com o servidor para registro de participação
    }

    @Override
    public void cancelarParticipacao(Usuario usuario, Balada balada) {
        // TODO Comunicação com o servidor para registro de cancelamento de participação
    }

    @Override
    public void atualizarBalada(Balada balada, DetalhesBaladaView.CallbackAtualizacao callback) {
        // TODO Comunicação com o servidor para registro de atualização de dados de uma balada
    }
}