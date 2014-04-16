package br.uniararas.posgrad.androidmvp.view.impl.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import br.uniararas.posgrad.androidmvp.R;
import br.uniararas.posgrad.androidmvp.modelo.Balada;

/**
 * Created by Pedro Brigatto on 16/04/2014.
 */
public class AdaptadorBaladas extends BaseAdapter {

    private List<Balada> baladas;
    private Context context;

    public AdaptadorBaladas(Context context, List<Balada> baladas) {
        this.baladas = baladas;
    }

    @Override
    public int getCount() {
        return baladas.size();
    }

    @Override
    public Object getItem(int position) {
        return baladas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.linha_balada, null);
        // Recuperar os elementos do layout para preenchê-los com valores da balada selecionada.
        // Será feito na Aula 03 da Disciplina de Programação para Dispositivos Móveis
        return null;
    }
}
