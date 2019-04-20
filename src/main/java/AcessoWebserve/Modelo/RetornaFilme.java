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

    public String ListatodosFilme() throws IOException {
        URL filmeUrl = new URL("http://localhost:8080/locadora/listaFilme.php");
        InputStreamReader filmeReader = new InputStreamReader(filmeUrl.openStream());
        RetornaFilme filmeLista = new Gson().fromJson(filmeReader, RetornaFilme.class);
       // System.out.println(filmeLita.getFilme());
        return "ID: "       + filmeLista.getFilme().getFilmeId().toString()
              +"Diretor: "  + filmeLista.getFilme().getFilmeDiretor()
              +"Titulo :"   + filmeLista.getFilme().getFilmeTitulo();
    }
    public String BuscaTituloFilme(String titulo) throws IOException {
        URL filmeBuscaUrl = new URL("http://localhost:8080/locadora/listaFilme.php?e="+titulo);
        InputStreamReader filmeBuscaReader = new InputStreamReader(filmeBuscaUrl.openStream());
        RetornaFilme filmeBusca = new Gson().fromJson(filmeBuscaReader, RetornaFilme.class);

        return "ID: "       + filmeBusca.getFilme().getFilmeId().toString()
              +"Diretor: "  + filmeBusca.getFilme().getFilmeDiretor()
              +"Titulo :"   + filmeBusca.getFilme().getFilmeTitulo();
    }
    public String meuFilme(String usuarioId) throws IOException {
        URL filmeBuscaUrl = new URL("http://localhost:8080/locadora/meuFilme.php?e="+usuarioId);
        InputStreamReader filmeBuscaReader = new InputStreamReader(filmeBuscaUrl.openStream());
        RetornaFilme filmeBusca = new Gson().fromJson(filmeBuscaReader, RetornaFilme.class);

        return "ID: "       + filmeBusca.getFilme().getFilmeId().toString()
                +"Diretor: "  + filmeBusca.getFilme().getFilmeDiretor()
                +"Titulo :"   + filmeBusca.getFilme().getFilmeTitulo();
    }
    public String AlugaFilme(int filmeId, String usuarioId) throws IOException {
        URL filmeBuscaUrl = new URL("http://localhost:8080/locadora/alugaFilme.php?filmeId="+filmeId+"&usuarioId="+usuarioId+"&status=alugado");
        InputStreamReader filmeBuscaReader = new InputStreamReader(filmeBuscaUrl.openStream());
        RetornaFilme filmeBusca = new Gson().fromJson(filmeBuscaReader, RetornaFilme.class);

        return "Filme Alugado";
    }
    public String DevolveFilme(int filmeId, String usuarioId) throws IOException {
        URL filmeBuscaUrl = new URL("http://localhost:8080/locadora/alugaFilme.php?filmeId="+filmeId+"&usuarioId="+usuarioId+"&status=Disponivel");
        InputStreamReader filmeBuscaReader = new InputStreamReader(filmeBuscaUrl.openStream());
        RetornaFilme filmeBusca = new Gson().fromJson(filmeBuscaReader, RetornaFilme.class);

        return "Filme Devolvido";
    }
}
