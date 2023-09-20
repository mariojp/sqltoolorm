package com.example;

public class Consumidor {
    
    @Coluna(nome="ID")
    private Long id;

    @Coluna(nome="ID")
    private String nome;
    private String sobrenome;
    private String cidade;
    private String rua;
    
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public String getCidade() {
        return cidade;
    }
    public String getRua() {
        return rua;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    @Override
    public String toString() {
        return "Consumidor [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cidade=" + cidade + ", rua="
                + rua + "]";
    }

    
    


}
