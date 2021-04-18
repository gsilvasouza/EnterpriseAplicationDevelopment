package br.com.fiap.tds.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_RESPOSTA")
@SequenceGenerator(name = "resposta", sequenceName = "SQ_TB_RESPOSTA", allocationSize = 1)
public class Resposta {
    @Id
    @GeneratedValue(generator = "resposta", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "texto", nullable = false)
    private String texto;

    @Column(name = "duracao_segundos")
    private Integer duracao;

    public Resposta() {
    }

    public Resposta(String texto, Integer duracao) {
        this.texto = texto;
        this.duracao = duracao;
    }

    public Resposta(Integer id, String texto, Integer duracao) {
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
        return "Resposta{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
