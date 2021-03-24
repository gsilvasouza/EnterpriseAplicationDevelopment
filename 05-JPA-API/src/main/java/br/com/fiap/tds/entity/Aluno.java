package br.com.fiap.tds.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.text.SimpleDateFormat;
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
    private Boolean ativo;

    @CreationTimestamp //Insere a data de cadastro de forma automaticaa
    @Temporal(TemporalType.DATE)
    @Column(name = "dt_cadastro", updatable = false) //updatable=false -> impede que o valor seja modificado
    private Calendar dataCadastro;

    public Aluno() {}

    public Aluno(String nome, String turma, Calendar dataNascimento, Periodo periodo, Boolean ativo) {
        this.nome = nome;
        this.turma = turma;
        this.dataNascimento = dataNascimento;
        this.periodo = periodo;
        this.ativo = ativo;
    }

    public Aluno(Integer codigo, String nome, String turma, Calendar dataNascimento, Periodo periodo, Boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.turma = turma;
        this.dataNascimento = dataNascimento;
        this.periodo = periodo;
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Aluno{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", turma='" + turma + '\'' +
                ", dataNascimento=" + sdf.format(dataNascimento.getTime()) +
                ", periodo=" + periodo.toString() +
                ", ativo=" + ativo +
                ", dataCadastro=" + sdf.format(dataCadastro.getTime()) +
                '}';
    }

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
        return ativo;
    }

    public void setSituacao(Boolean situacao) {
        this.ativo = situacao;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
