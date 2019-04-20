package AcessoWebserve.Modelo;

public class Filme {
    private Integer filmeId;
    private String filmeTitulo;
    private String filmeDiretor;
    private String filmeStatus;

    public Integer getFilmeId() {
        return filmeId;
    }

    public void setFilmeId(Integer filmeId) {
        this.filmeId = filmeId;
    }

    public String getFilmeTitulo() {
        return filmeTitulo;
    }

    public void setFilmeTitulo(String filmeTitulo) {
        this.filmeTitulo = filmeTitulo;
    }

    public String getFilmeDiretor() {
        return filmeDiretor;
    }

    public void setFilmeDiretor(String filmeDiretor) {
        this.filmeDiretor = filmeDiretor;
    }

    public String getFilmeStatus() {
        return filmeStatus;
    }

    public void setFilmeStatus(String filmeStatus) {
        this.filmeStatus = filmeStatus;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "filmeId=" + filmeId +
                ", filmeTitulo='" + filmeTitulo + '\'' +
                ", filmeDiretor='" + filmeDiretor + '\'' +
                ", filmeStatus='" + filmeStatus + '\'' +
                '}';
    }
}