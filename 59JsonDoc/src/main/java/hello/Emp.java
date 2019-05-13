package hello;

import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiObject
public class Emp {
	
	@ApiObjectField(name = "employee id", description = "Auto generated id")
	public int id;
	@ApiObjectField(name = "employee name", description = "name same as voterId")
	public String name;
	@ApiObjectField(name = "salary", description = "annual income")
	public String sal;

}
