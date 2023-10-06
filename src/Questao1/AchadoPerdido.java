package Questao1;

public class AchadoPerdido implements Publicacao {

    private String titulo;
    private String tipo;
    private String descricao;
    private String local;
    private String foto;
    private String dataHora;
    private String status;

    public AchadoPerdido(String titulo, String tipo, String descricao, String local, String foto, String dataHora, String status) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.descricao = descricao;
        this.local = local;
        this.foto = foto;
        this.dataHora = dataHora;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void vizualizarDetalhes() {
        System.out.println("Titulo:"+getTitulo()+
                "Foto:"+getFoto()+
                "local Achado"+getLocal()+
                "Tipo"+getTipo()+
                "Status"+getStatus());

    }

    @Override
    public void buscarTitulo() {
        System.out.println("Titulo:"+getTitulo()+
                "Descriçâo: "+getDescricao()+
                "LocalAchado:"+getLocal())
        ;
    }
}
