package auth.pragyanvarshney.in.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private RolesEnums name;

    public Role(RolesEnums name) {
        this.name = name;
    }
    public Role() {
    }
}
