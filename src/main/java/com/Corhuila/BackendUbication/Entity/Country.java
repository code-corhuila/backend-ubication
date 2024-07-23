package com.Corhuila.BackendUbication.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country extends ABaseEntity{

    private String code;

    @Column(name = "name", nullable = false , length = 20, unique = true)
    private String name;

    @Column(name = "description", nullable = false , length = 50)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "continent_id", nullable = false, unique = true)
    private Continent continentId;
}
