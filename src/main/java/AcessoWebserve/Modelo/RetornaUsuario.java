package AcessoWebserve.Modelo;
import AcessoWebserve.Application;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RetornaUsuario {
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String VerificaUsario(String email,String senha) throws IOException {
        URL loginUrl = new URL("http://localhost:8080/locadora/webserv.php?e="+email+"&p="+senha);
        InputStreamReader loginReader = new InputStreamReader(loginUrl.openStream());
        RetornaUsuario login = new Gson().fromJson(loginReader, RetornaUsuario.class);
        return login.getUsuario().getUsuarioNome();

    }

    public String criaUsario(String nome,String email,String pass) throws IOException {
        URL loginUrl = new URL("http://localhost:8080/locadora/userSalva.php?nome="+nome+"&email="+email+"&pass="+pass);
        InputStreamReader loginReader = new InputStreamReader(loginUrl.openStream());
         return "salvo user";
    }
 }
