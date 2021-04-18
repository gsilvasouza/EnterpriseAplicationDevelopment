package br.com.fiap.tds.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_PERGUNTA")
@SequenceGenerator(name = "pergunta", sequenceName = "SQ_TB_PERGUNTA", allocationSize = 1)
public class Pergunta {
    @Id
    @GeneratedValue(generator = "pergunta", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "texto", nullable = false)
    private String texto;

    @Column(name = "duracao_segundos")
    private Integer duracao;

    public Pergunta() {
    }

    public Pergunta(String texto, Integer duracao) {
        this.texto = texto;
        this.duracao = duracao;
    }

    public Pergunta(Integer id, String texto, Integer duracao) {
        this.id = id;
        this.texto = texto;
        this.duracao = duracao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Pergunta{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
