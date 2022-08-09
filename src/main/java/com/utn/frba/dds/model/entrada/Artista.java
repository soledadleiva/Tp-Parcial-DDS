
package com.utn.frba.dds.model.entrada;


import javax.persistence.*;

@Entity
@Table(name = "artista")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    public String avatar;
    public String webUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
