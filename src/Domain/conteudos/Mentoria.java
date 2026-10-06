package Domain.conteudos;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    @Override
    public double CalcularXP() {
        return XP_PADRAO + 20;
    }

    private String Titulo;
    private String Descricao;
    private LocalDate Data;

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        Titulo = titulo;
        Descricao = descricao;
        Data = data;
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

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo='" + Titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", Data=" + Data +
                '}';
    }
}
