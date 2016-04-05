package entity.geo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="country")
public class Country {
    @Id
    @Column(name="countrycode")
    private String code;
    @Column(name="name")
    private String name;
    @Column(name ="region")
    private String region;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "country",cascade = CascadeType.ALL)
    private List<City> cityList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
