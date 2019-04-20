package AcessoWebserve;

import AcessoWebserve.Modelo.RetornaFilme;
import AcessoWebserve.Modelo.RetornaUsuario;
import AcessoWebserve.Modelo.Usuario;
import com.google.gson.Gson;
import net.minidev.json.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException, ParseException {
		SpringApplication.run(Application.class, args);

		String titulo,email,senha;
		int filmeid=1;

		Scanner scan= new Scanner(System.in);

		 RetornaUsuario logar = new RetornaUsuario();
		 RetornaFilme gerenciaFilme = new RetornaFilme();
		 Usuario usuario =new Usuario();
		 logar.VerificaUsario("","");
		 gerenciaFilme.ListatodosFilme();
		 gerenciaFilme.BuscaTituloFilme("");
		 logar.criaUsario("","","");
		 gerenciaFilme.AlugaFilme(filmeid,logar.getUsuario().getUsuarioId().toString());

	}

}


