
package person;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "streetname",
    "cityname",
    "countryname"
})
public class Address {

    @JsonProperty("streetname")
    private String streetname;
    @JsonProperty("cityname")
    private String cityname;
    @JsonProperty("countryname")
    private String countryname;

    /**
     * 
     * @return
     *     The streetname
     */
    @JsonProperty("streetname")
    public String getStreetname() {
        return streetname;
    }

    /**
     * 
     * @param streetname
     *     The streetname
     */
    @JsonProperty("streetname")
    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    /**
     * 
     * @return
     *     The cityname
     */
    @JsonProperty("cityname")
    public String getCityname() {
        return cityname;
    }

    /**
     * 
     * @param cityname
     *     The cityname
     */
    @JsonProperty("cityname")
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
     * 
     * @return
     *     The countryname
     */
    @JsonProperty("countryname")
    public String getCountryname() {
        return countryname;
    }

    /**
     * 
     * @param countryname
     *     The countryname
     */
    @JsonProperty("countryname")
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

}
