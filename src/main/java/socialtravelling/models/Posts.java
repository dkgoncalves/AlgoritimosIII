package socialtravelling.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "posts")
public class Posts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    @NotNull(message = "O campo description não pode ser nulo")
    private String description;

    @Column(name = "photo")
    @NotNull(message = "O campo foto não pode ser nulo")
    private String photo;

    @Column(name = "country")
    @NotNull(message = "O campo país não pode ser nulo")
    private String country;

    @Column(name = "city")
    @NotNull(message = "O campo cidade não pode ser nulo")
    private String city;

    @JoinColumn(name= "user_id")
    @NotNull
    @ManyToOne
    private Users user;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
