package br.uniararas.posgrad.androidmvp.view.impl;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import br.uniararas.posgrad.androidmvp.R;
import br.uniararas.posgrad.androidmvp.presenter.HomePresenter;
import br.uniararas.posgrad.androidmvp.util.Acao;
import br.uniararas.posgrad.androidmvp.view.HomeView;

/**
 * Tela principal do aplicativo.
 * Apresenta o conteúdo principal, que é o conjunto de eventos cadastrados no sistema.
 *
 * @author pedrobrigatto
 */
public class HomeActivity extends ActionBarActivity implements HomeView {

    private HomeView.HomeViewHandler viewHandler;

    private EditText pesquisa;
    private ImageButton btnPesquisa;
    private ListView listaBaladas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.definirViewHandler(new HomePresenter(this));
        configurarComponentesDaView();
    }

    private void configurarComponentesDaView() {
        pesquisa = (EditText) findViewById(R.id.home_txt_pesquisa);
        btnPesquisa = (ImageButton) findViewById(R.id.home_btn_pesquisa);
        listaBaladas = (ListView) findViewById(R.id.home_lista_baladas);

        btnPesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Atualmente, estamos apenas trabalhando com fluxo de telas para validação do conceito.
                // Nas próximas aulas, substituiremos este comportamento estático por lógica que chega
                // até o back-end com subsequente persistência local de dados.
                Intent intencao = new Intent(Acao.DETALHES_BALADA);
                startActivity(intencao);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("[UNIARARAS]", "Passando pelo método onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("[UNIARARAS]", "Pseudo-banda");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("[UNIARARAS]", "Passando pelo método onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("[UNIARARAS]", "Passando pelo método onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("[UNIARARAS]", "Passando pelo método onDestroy()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("[UNIARARAS]", "Passando pelo método onStop()");
    }

    @Override
    public void definirViewHandler(HomeView.HomeViewHandler handler) {
        this.viewHandler = handler;
    }
}
