package socialtravelling.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name= "comments")
public class Comments implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "photo")
    @NotNull(message = "O campo nome não pode ser nulo")
    private String photo;

    @Column(name = "description")
    @NotNull(message = "O campo nome não pode ser nulo")
    private String description;

    @Column(name = "country")
    @NotNull(message = "O campo nome não pode ser nulo")
    private String country;

    @Column(name = "city")
    @NotNull(message = "O campo nome não pode ser nulo")
    private String city;

    @JoinColumn(name= "user_id")
    @NotNull(message = "O campo nome não pode ser nulo")
    @ManyToOne

    private Users user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
