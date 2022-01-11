package fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.cadastro_app.R;

public class DetalhesFragment extends Fragment {
    TextView mostraNome,mostraEndereco, mostraEmail, mostraDataNascimento, mostraTelefone;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detalhes_fragment, container, false);
        mostraNome = (TextView)view.findViewById(R.id.Name);
        mostraEndereco = (TextView)view.findViewById(R.id.Endereco);
        mostraEmail = (TextView)view.findViewById(R.id.Email);
        mostraDataNascimento = (TextView)view.findViewById(R.id.DataNascimento);
        mostraTelefone = (TextView)view.findViewById(R.id.Telefone);
        return view;
    }
    public void change(String uname, String uendereco, String uEmail,
                       String uDataNascimento, String uTelefone){
        mostraNome.setText(uname);
        mostraEndereco.setText(uendereco);
        mostraEmail.setText(uEmail);
        mostraDataNascimento.setText(uDataNascimento);
        mostraTelefone.setText(uTelefone);
    }
}
