package br.com.fiap.tds.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name="TB_ATENDIMENTO")
@SequenceGenerator(name = "atendimento", sequenceName = "SQ_TB_ATENDIMENTO", allocationSize = 1)
public class Atendimento {
    @Id
    @GeneratedValue(generator = "atendimento", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;

    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = false)
    private Calendar data;

    @Column(name = "duracao_minutos")
    private Integer duracao;

    @Column(name = "assunto")
    private String assunto;

    public Atendimento() {
    }

    public Atendimento(Calendar data, Integer duracao, String assunto) {
        this.data = data;
        this.duracao = duracao;
        this.assunto = assunto;
    }

    public Atendimento(Integer id, Calendar data, Integer duracao, String assunto) {
        this.id = id;
        this.data = data;
        this.duracao = duracao;
        this.assunto = assunto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Atendimento{" +
                "id=" + id +
                ", data=" + data.getTime() +
                ", duracao=" + duracao +
                ", assunto=" + assunto +
                '}';
    }
}
