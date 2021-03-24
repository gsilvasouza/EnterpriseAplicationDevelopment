package br.com.fiap.tds.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity //Obrigatoria
@Table(name = "TB_CLIENTE")
//SequenceName -> nome da sequence no banco de dados
//name -> nome da sequence no Java
//allocationSize -> Incremento da sequence
@SequenceGenerator(sequenceName = "SQ_TB_CLIENTE", name = "cliente", allocationSize = 1)
public class Cliente {
    @Id //Obrigatoria
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
    @Column(name = "cd_cliente")
    private int codigo;

    @Column(name = "nm_cliente", nullable = false)
    private String nome;

    @Column(name = "nr_cpf", nullable = false, length = 14)
    private String cpf;

    @Temporal(TemporalType.DATE) //vai salvar somente a data no campo
    @Column(name = "dt_nascimento")
    private Calendar dataNascimento;

    @Column(name = "st_credito")
    private boolean credito;

    @Column(name = "vl_saldo")
    private double saldo;

    @Transient //Não é uma coluna do banco
    private int idade;

    @Lob //Tipo de BLOB no oracle(arquivos)
    @Column(name = "fl_foto")
    private byte[] foto;

    @Enumerated(EnumType.STRING) //Grava o texto da constante
    @Column(name = "ds_genero")
    private Genero genero;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
