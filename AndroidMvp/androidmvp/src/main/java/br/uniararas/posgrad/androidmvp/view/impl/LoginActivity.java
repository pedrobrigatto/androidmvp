package br.uniararas.posgrad.androidmvp.view.impl;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.uniararas.posgrad.androidmvp.R;
import br.uniararas.posgrad.androidmvp.modelo.Usuario;
import br.uniararas.posgrad.androidmvp.presenter.LoginPresenter;
import br.uniararas.posgrad.androidmvp.util.Acao;
import br.uniararas.posgrad.androidmvp.view.LoginView;

/**
 * Atividade principal do sistema.
 *
 * Permite ao usuário, através de uma conta cadastrada no sistema, entrar na aplicação e usufruir de
 * suas funcionalidades.
 *
 * @author pedrobrigatto
 */
public class LoginActivity extends ActionBarActivity implements LoginView {

    private LoginViewHandler viewHandler;

    // Definir atributos dentro da activity, para referenciar cada componente da tela
    private EditText textoUsuario;
    private EditText textoSenha;
    private Button botaoEntrar;
    private Button botaoLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        configurarComponentesDaTela();

        // Aqui é onde o registro do handler para login é feito. Quem cuida do processo de login,
        // uma vez que ele seja necessário, não é a tela em si, mas um manipulador de eventos que
        // essa tela dispara (e que sejam eventos associados a operações de 'negócio', como é o caso
        // da verificação de usuários no banco de dados da solução de back-end.
        definirLoginViewHandler(new LoginPresenter(this));
    }

    /**
     * Configurar cada um dos componentes de tela:
     *
     *   1. guardar uma referência para cada um deles
     *   2. configurar o tratamento de eventos de cada um deles
     */
    private void configurarComponentesDaTela () {

        // 1. Referência para o campo de usuário
        textoUsuario = (EditText) findViewById(R.id.main_txt_usuario);

        // 2. Referência para o campo de senha
        textoSenha = (EditText) findViewById(R.id.main_txt_senha);

        // 3. Referência para o botão de login
        botaoEntrar = (Button) findViewById(R.id.main_btn_login);

        // 4. Referência para o botão de limpeza de campos
        botaoLimpar = (Button) findViewById(R.id.main_btn_limpar);

        // Configurando o tratamento de eventos para o botão de limpeza de dados
        botaoLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoSenha.setText("");
                textoUsuario.setText("");
            }
        });

        // Configurando o tratamento de eventos para o botão de entrada na tela principal
        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valorVazio = "";
                String usuarioDigitado = textoUsuario.getText().toString();
                String senhaDigitada = textoSenha.getText().toString();

                if (valorVazio.equals(usuarioDigitado) ||
                        valorVazio.equals(senhaDigitada)) {
                    Toast.makeText(LoginActivity.this, R.string.msg_login_campos_vazios,
                            Toast.LENGTH_LONG).show();
                } else {

                    // Campos digitados. Próximos passos são:
                    //
                    //  1. Validar o usuário junto ao back-end da solução (tema para a aula 03)
                    //  2. Caso o usuário seja válido, entrar na tela principal do aplicativo
//                    startActivity(new Intent(IntentList.ACAO_MOSTRA_HOME));
                    Usuario usuario = new Usuario(textoUsuario.getText().toString(),
                            textoSenha.getText().toString());

                    getViewHandler().realizarLogin(usuario, new LoginCallback() {
                        @Override
                        public void operacaoFinalizada(Usuario usuario, byte status) {
                            if (status == LoginCallback.USUARIO_OK) {
                                startActivity(new Intent(Acao.MOSTRA_HOME));
                            } else {
                                Toast.makeText(LoginActivity.this, R.string.msg_login_mal_sucedido,
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
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
    public void definirLoginViewHandler(LoginViewHandler viewHandler) {
        this.viewHandler = viewHandler;
    }

    public LoginView.LoginViewHandler getViewHandler() {
        return viewHandler;
    }
}
