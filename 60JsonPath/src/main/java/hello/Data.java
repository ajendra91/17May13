package hello;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "city",
    "age"
})
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Data {

    @JsonProperty("city")
    private String city;
    @JsonProperty("age")
    private Integer age;
    //@JsonIgnore
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}
