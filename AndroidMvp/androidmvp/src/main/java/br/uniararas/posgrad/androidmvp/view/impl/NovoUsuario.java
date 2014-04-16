package br.uniararas.posgrad.androidmvp.view.impl;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import br.uniararas.posgrad.androidmvp.R;
import br.uniararas.posgrad.androidmvp.presenter.NovoUsuarioPresenter;
import br.uniararas.posgrad.androidmvp.view.NovoUsuarioView;

/**
 * Tela usada para cadastrar novos usuários no sistema.
 *
 * @author pedrobrigatto
 */
public class NovoUsuario extends ActionBarActivity implements NovoUsuarioView {

    private NovoUsuarioViewHandler viewHandler;

    private EditText nomeUsuario;
    private EditText senhaUsuario;
    private EditText confirmaSenhaUsuario;

    private Button salvar;
    private Button limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);
        configurarView();
        definirViewHandler(new NovoUsuarioPresenter(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.novo_usuario, menu);
        return true;
    }

    /**
     * Configura a view da atividade, estabelecendo a lógica para tratamento de eventos de seus
     * componentes.
     */
    private void configurarView () {
    }

    /**
     * Verifica se todos os campos forem devidamente preenchidos, para que a operação de salvamento
     * de novo usuário prossiga.
     *
     * @return <code>true</> se todos os campos estão preenchidos. <code>false</code> caso contrário.
     */
    private boolean camposPreenchidos() {
        return false;
    }

    /**
     * Usado para verificar se as senhas oferecidas são iguais.
     *
     * @return <code>true</> se as duas senhas conferem. <code>false</code> caso contrário.
     */
    private boolean confirmarSenhasIguais() {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void definirViewHandler(NovoUsuarioViewHandler handler) {
        this.viewHandler = handler;
    }
}
