package hello;

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
    "name",
    "data"
})
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {

    @JsonProperty("name")
    private String name;
    @JsonProperty("data")
    private Data data;
    //@JsonIgnore
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}
