package com.wellington.curriculo_api.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Curriculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String objetivoProfissional;

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL)
    private List<Experiencia> experiencias;

    public Curriculo() {
    }

    public Curriculo(String nome, String email, String telefone, String objetivoProfissional, List<Experiencia> experiencias) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.objetivoProfissional = objetivoProfissional;
        this.experiencias = experiencias;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getObjetivoProfissional() { return objetivoProfissional; }

    public void setObjetivoProfissional(String objetivoProfissional) { this.objetivoProfissional = objetivoProfissional; }

    public List<Experiencia> getExperiencias() { return experiencias; }

    public void setExperiencias(List<Experiencia> experiencias) { this.experiencias = experiencias; }
}
