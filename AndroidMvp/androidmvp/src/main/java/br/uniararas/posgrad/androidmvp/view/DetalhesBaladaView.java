package br.uniararas.posgrad.androidmvp.view;

import br.uniararas.posgrad.androidmvp.modelo.Balada;
import br.uniararas.posgrad.androidmvp.modelo.Usuario;

/**
 * Interface usada para comunicação entre camadas de interface com usuário e presenter, no tocante
 * a exibição de detalhes de uma balada.
 *
 * @author Pedro Brigatto
 */
public interface DetalhesBaladaView {

    void definirViewHandler(DetalhesBaladaViewHandler handler);

    /**
     * Define o comportamento esperado por objetos que desejam manipular eventos gerados em telas de
     * manipulação de detalhes de uma balada.
     */
    interface DetalhesBaladaViewHandler {

        /**
         * Método usado para se cadastrar a participação de um usuário do aplicativo em uma balada.
         *
         * @param balada Balada na qual o usuário deseja cadastrar sua participação
         * @param callback Usado para ser notificado do resultado da operação de cadastro
         */
        void participar(Balada balada, CallbackParticipacao callback);

        /**
         * Método usado para cancelar um registro de participação em uma balada.
         *
         * @param usuario Usuário que deseja cancelar sua participação
         * @param balada Balada que o usuário não deseja mais ir
         */
        void cancelarParticipacao (Usuario usuario, Balada balada);

        /**
         * Método usado para atualizar um registro de balada no servidor.
         *
         * @param balada Balada com os dados a serem atualizados no backend.
         * @param callback Objeto que tratará o resultado da operação de atualização
         */
        void atualizarBalada(Balada balada, CallbackAtualizacao callback);
    }

    /**
     * Interface que define o comportamento esperado por objetos que precisam ser notificados de que
     * a operação de confirmação de presença em balada foi realizada.
     *
     * @author pedrobrigatto
     */
    interface CallbackParticipacao {

        /**
         * Operação que indica que a participação em uma balada foi registrada com sucesso
         *
         * @param usuario Usuário que solicitou participação na balada
         * @param balada Balada na qual o usuário registrou sua participação
         */
        void participacaoConfirmada (Usuario usuario, Balada balada);
    }

    /**
     * Interface que define o modelo de comportamento de objetos que tratarão o resultado da operação
     * de atualização de baladas.
     *
     * @author pedrobrigatto
     */
    interface CallbackAtualizacao {

        byte ATUALIZACAO_SUCESSO = 0;
        byte ATUALIZACAO_BACKEND_INDISPONIVEL = 1;
        byte ATUALIZACAO_FALHA_ATUALIZACAO = 2;

        /**
         * Operação utilizada para comunicar o resultado da operação de atualização de uma balada no
         * sistema.
         *
         * @param balada Balada com dados que foram enviados para atualização do registro no backend
         * @param status Status da operação
         */
        void operacaoFinalizada(Balada balada, byte status);
    }
}
