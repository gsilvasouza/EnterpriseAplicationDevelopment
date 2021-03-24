package br.com.fiap.tds.entity;

import javax.persistence.*;
import java.util.Calendar;

/*
Sequence SQ_TB_PRODUTO (código)

TB_PRODUTO
*cd_produto (PK) NUMBER
*nm_produto	 VARCHAR(50)
*ds_produto	 VARCHAR(255)
*vl_produto	 NUMBER
dt_entrada	 DATE
dt_fabricacao	 DATE
fl_foto		 BLOB
ds_estado	 VARCHAR -> Enum no Java (Novo, Usado)
*/
@Entity
@Table(name = "TB_PRODUTO")
@SequenceGenerator(sequenceName = "SEQ_ID_PRODUTO", name="produto", allocationSize = 1)
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
    @Column(name = "cd_produto")
    private Integer codigo;

    @Column(name = "nm_produto", nullable = false, length = 50)
    private String nome;

    @Column(name = "ds_produto", nullable = false)
    private String descricao;

    @Column(name = "vl_produto", nullable = false)
    private Double valor;

    @Temporal(TemporalType.DATE)
    @Column(name="dt_entrada")
    private Calendar dataEntrada;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_fabricacao")
    private Calendar dataFabricacao;

    @Lob
    @Column(name = "fl_foto")
    private byte[] foto;

    @Enumerated(EnumType.STRING)
    @Column(name = "ds_estado")
    private Estado estado;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Calendar getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Calendar dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
