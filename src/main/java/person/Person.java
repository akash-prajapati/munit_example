
package person;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "sirName",
    "age",
    "addresses"
})
public class Person {

    @JsonProperty("name")
    private String name;
    @JsonProperty("sirName")
    private String sirName;
    @JsonProperty("age")
    private String age;
    @JsonProperty("addresses")
    private List<Address> addresses = new ArrayList<Address>();

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The sirName
     */
    @JsonProperty("sirName")
    public String getSirName() {
        return sirName;
    }

    /**
     * 
     * @param sirName
     *     The sirName
     */
    @JsonProperty("sirName")
    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    /**
     * 
     * @return
     *     The age
     */
    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    /**
     * 
     * @param age
     *     The age
     */
    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 
     * @return
     *     The addresses
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * 
     * @param addresses
     *     The addresses
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

}
