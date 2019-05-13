package hello;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

@RestController
public class EmpController {

	ObjectMapper mapper =new ObjectMapper();

	@GetMapping("/getName")
	public List<Emp> getName2() throws JsonProcessingException{

		String exp ="$.emps[*].name";
		String exp2 ="$.emps[*]";

		Empres res =new Empres();
		res.setCompany("ginusis corp");
		res.setDesc("software com");
		List<Emp> lst= new ArrayList<>();

		Data data1=new Data("delhi",1);
		Emp emp1=new Emp("java",data1);
		lst.add(emp1);

		Data data2=new Data("delhi",1);
		Emp emp2=new Emp("java",data1);
		lst.add(emp2);

		res.setEmps(lst);
		
		String jsonres = mapper.writeValueAsString(res);
		return JsonPath.parse(jsonres).read(exp2,List.class);
	
	}
	
}
