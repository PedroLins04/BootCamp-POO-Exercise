package Domain.conteudos;

public class Curso extends Conteudo{

    private String Titulo;
    private String Descricao;
    private int CargaHr;

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHr) {
        Titulo = titulo;
        Descricao = descricao;
        CargaHr = cargaHr;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getCargaHr() {
        return CargaHr;
    }

    public void setCargaHr(int cargaHr) {
        CargaHr = cargaHr;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + Titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", CargaHr=" + CargaHr +
                '}';
    }

    @Override
    public double CalcularXP() {
        return XP_PADRAO + CargaHr;
    }
}
