package AcessoWebserve.Modelo;

public class Usuario {
    private Integer usuarioId;
    private String usuarioNome;
    private String usuarioEmail;
    private String usuarioSenha;

    public Integer getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
    public String getUsuarioNome() {
        return usuarioNome;
    }
    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }
    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public String getUsuarioSenha() {
        return usuarioSenha;
    }

    public void setUsuarioSenha(String usuarioSenha) {
        this.usuarioSenha = usuarioSenha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioId=" + usuarioId +
                ", usuarioNome='" + usuarioNome + '\'' +
                ", usuarioEmail='" + usuarioEmail + '\'' +
                ", usuarioSenha='" + usuarioSenha + '\'' +
                '}';
    }
}