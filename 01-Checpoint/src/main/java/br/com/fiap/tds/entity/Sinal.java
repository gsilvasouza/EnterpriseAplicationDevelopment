package br.com.fiap.tds.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_SINAL")
@SequenceGenerator(name = "sinal", sequenceName = "SQ_TB_SINAL", allocationSize = 1)
public class Sinal {
    @Id
    @GeneratedValue(generator = "sinal", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "texto", nullable = false)
    private String texto;

    @Column(name = "tempo_reconhecimento", nullable = false)
    private Integer tempoReconhecimento;

    public Sinal() {
    }

    public Sinal(String texto, Integer tempoReconhecimento) {
        this.texto = texto;
        this.tempoReconhecimento = tempoReconhecimento;
    }

    public Sinal(Integer id, String texto, Integer tempoReconhecimento) {
        this.id = id;
        this.texto = texto;
        this.tempoReconhecimento = tempoReconhecimento;
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

    public Integer getTempoReconhecimento() {
        return tempoReconhecimento;
    }

    public void setTempoReconhecimento(Integer tempoReconhecimento) {
        this.tempoReconhecimento = tempoReconhecimento;
    }

    @Override
    public String toString() {
        return "Sinal{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", tempoReconhecimento=" + tempoReconhecimento +
                '}';
    }
}
