package youtube;

public class Curtida {
    private int id;
    private Usuario usuario; // para acessar o id do usuário
    private Video video; // para acessar o id do video
    private Comentario comentario; // para acessar o id do comentário

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

    public Comentario getComentario() {
        return comentario;
    }

}
