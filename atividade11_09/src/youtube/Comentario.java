package youtube;

public class Comentario {
    private int id;
    private Usuario usuario; // para acessar o id do usuário
    private Video video; // para acessar o id do video
    private Curtida curtida; // para acessar o id da curtida
    private Comentario comentario; // para acessar o id do comentário do comentário

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Video getVideo() {
        return video;
    }

    public Curtida getCurtida() {
        return curtida;
    }

    public void setCurtida(Curtida curtida) {
        this.curtida = curtida;
    }

    public Comentario getComentario() {
        return comentario;
    }
}
