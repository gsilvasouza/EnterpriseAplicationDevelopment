package br.com.fiap.tds.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "TB_FUNCIONARIO")
@SequenceGenerator(name = "funcionario", sequenceName = "SQ_TB_FUNCIONARIO", allocationSize = 1)
public class Funcionario {
    @Id
    @GeneratedValue(generator = "funcionario", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "nome_completo", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha", nullable = false, length = 11)
    private String senha;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_cadaastro", nullable = false)
    private Calendar dataCadastro;

    @Column(name = "numero_telefone", length = 11)
    private String telefone;

    public Funcionario() {
    }

    public Funcionario(String nome, String email, String senha, Calendar dataCadastro, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.telefone = telefone;
    }

    public Funcionario(Integer id, String nome, String email, String senha, Calendar dataCadastro, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dataCadastro=" + dataCadastro.getTime() +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
