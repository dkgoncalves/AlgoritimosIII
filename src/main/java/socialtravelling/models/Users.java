package socialtravelling.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotNull(message = "O campo nome não pode ser nulo")
    private String name;

    @Column(name = "lastname")
    @NotNull(message = "O campo ultimo nome não pode ser nulo")
    private String lastname;

    @Column(name = "email")
    @NotNull(message = "O campo email não pode ser nulo")
    private String email;

    @Column(name = "password")
    @NotNull(message = "O campo senha não pode ser nulo")
    private String password;

    @Column(name = "myphoto")
    @NotNull(message = "O campo foto não pode ser nulo")
    private String myphoto;

    @JoinColumn(name= "usertype_id")
    @NotNull
    @ManyToOne
    private Usertypes usertype;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMyphoto() {
        return myphoto;
    }

    public void setMyphoto(String myphoto) {
        this.myphoto = myphoto;
    }

    public Usertypes getUsertype() {
        return usertype;
    }

    public void setUsertype(Usertypes usertype) {
        this.usertype = usertype;
    }

}
