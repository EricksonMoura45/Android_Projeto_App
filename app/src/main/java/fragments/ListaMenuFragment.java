package fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

import com.example.cadastro_app.R;

public class ListaMenuFragment extends ListFragment {
    String[] clientes = new String[] {};
    String[] enderecos = new String[]{};
    String[] emails = new String[]{};
    String[] datasNascimento = new String[]{};
    String[] Telefones = new String[]{};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.lista_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, clientes);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        DetalhesFragment txt = (DetalhesFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change(
                "Nome: "+ clientes[position],
                "Endereço: "+ enderecos[position],
                "Email: "+ emails[position],
                "Data de Nacimento: "+ datasNascimento[position],
                "Contato: "+ Telefones[position]


        );
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}
