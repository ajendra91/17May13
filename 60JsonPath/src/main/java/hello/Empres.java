package hello;

import java.util.List;

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
    "company",
    "desc",
    "emps"
})
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Empres {

    @JsonProperty("company")
    private String company;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("emps")
    private List<Emp> emps = null;
    //@JsonIgnore
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}
