package youtube;

public class Video {
    private int id;
    private String nome;
    private Usuario usuario; // para acessar o id do usuário
    private String desc;
    private String link;
    private String duracao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLink() {
        return link;
    }

    public String getDuracao() {
        return duracao;
    }

}
