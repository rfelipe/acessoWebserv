package AcessoWebserve.Modelo;


import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RetornaFilme {
   private Filme filme;

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Filme ListatodosFilme() throws IOException {
        URL filmeUrl = new URL("http://localhost:8080/locadora/listaFilme.php");
        InputStreamReader filmeReader = new InputStreamReader(filmeUrl.openStream());
        RetornaFilme filmeLista = new Gson().fromJson(filmeReader, RetornaFilme.class);
       return filme=filmeLista.getFilme();
    }
    public Filme BuscaTituloFilme(String titulo) throws IOException {
        URL filmeBuscaUrl = new URL("http://localhost:8080/locadora/listaFilme.php?e="+titulo);
        InputStreamReader filmeBuscaReader = new InputStreamReader(filmeBuscaUrl.openStream());
        RetornaFilme filmeBusca = new Gson().fromJson(filmeBuscaReader, RetornaFilme.class);
        return filme=filmeBusca.getFilme();
    }
    public Filme meuFilme(String usuarioId) throws IOException {
        URL filmeBuscaUrl = new URL("http://localhost:8080/locadora/meuFilme.php?usuarioId="+usuarioId);
        InputStreamReader filmeBuscaReader = new InputStreamReader(filmeBuscaUrl.openStream());
        RetornaFilme buscaMeuFilme = new Gson().fromJson(filmeBuscaReader, RetornaFilme.class);
        return filme=buscaMeuFilme.getFilme();
    }

    public String AlugaFilme(int filmeId, String usuarioId) throws IOException {
        URL filmeBuscaUrl = new URL("http://localhost:8080/locadora/alugaFilme.php?filmeId="+filmeId+"&usuarioId="+usuarioId+"&status=alugado");
        InputStreamReader filmeBuscaReader = new InputStreamReader(filmeBuscaUrl.openStream());
        //RetornaFilme filmeBusca = new Gson().fromJson(filmeBuscaReader, RetornaFilme.class);
        return "Filme Alugado";

    }
    public String DevolveFilme(int filmeId, String usuarioId) throws IOException {
        URL filmeBuscaUrl = new URL("http://localhost:8080/locadora/devolveFilme.php?filmeId="+filmeId+"&usuarioId="+usuarioId+"&status=Disponivel");
        InputStreamReader filmeBuscaReader = new InputStreamReader(filmeBuscaUrl.openStream());
//        RetornaFilme filmeBusca = new Gson().fromJson(filmeBuscaReader, RetornaFilme.class);
        return "Filme Devolvido";
    }
}
