package br.com.fiap.tds.entity;

import jdk.jfr.Timestamp;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "TB_ALUNO")
@SequenceGenerator(sequenceName = "SQ_TB_ALUNO", name="aluno", allocationSize = 1)
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno")
    @Column(name = "cd_aluno")
    private Integer codigo;

    @Column(name = "nm_aluno", nullable = false, length = 60)
    private String nome;

    @Column(name = "ds_turma", nullable = false, length = 40)
    private String turma;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_nascimento")
    private Calendar dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "ds_periodo", nullable = false, length = 40)
    private Periodo periodo;

    @Column(name = "st_ativo")
    private Boolean situacao;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_cadastro")
    private Calendar dataCadastro;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
