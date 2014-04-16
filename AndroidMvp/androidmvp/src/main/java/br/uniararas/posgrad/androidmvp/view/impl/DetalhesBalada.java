package br.uniararas.posgrad.androidmvp.view.impl;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import br.uniararas.posgrad.androidmvp.R;
import br.uniararas.posgrad.androidmvp.presenter.ExibirBaladaPresenter;
import br.uniararas.posgrad.androidmvp.view.DetalhesBaladaView;

/**
 * Tela para apresentar todos os dados de uma balada selecionada pelo usuário.
 *
 * @author pedrobrigatto
 */
public class DetalhesBalada extends ActionBarActivity implements DetalhesBaladaView {

    /** Atributo usado para definir se a tela pode ser aberta em modo de edição ou não */
    private boolean modoAdmin = false;

    /** Interface usada pelo presenter para se comunicar com a view (activity). */
    private DetalhesBaladaViewHandler viewHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_balada);
        definirViewHandler(new ExibirBaladaPresenter(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detalhes_balada, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void definirViewHandler(DetalhesBaladaViewHandler handler) {
        this.viewHandler = handler;
    }
}
