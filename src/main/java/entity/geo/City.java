package entity.geo;

import javax.persistence.*;

@Entity
@Table(name="city")
public class City {
    @Id
    @Column(name="id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name="district")
    private String district;
    @ManyToOne(optional = false)
    @JoinColumn(name = "countryCode")
    private Country country;

    public int getId() {
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", country=" + country +
                '}';
    }
}
