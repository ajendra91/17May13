package hello;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jsondoc.core.pojo.ApiStage;
import org.jsondoc.core.pojo.ApiVisibility;

import javax.annotation.PostConstruct;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(name = "Employee Management System", description = "Employee info", group = "Management", visibility = ApiVisibility.PUBLIC, stage = ApiStage.BETA)
public class EmpController {

	public static List<Emp> lst =new ArrayList<Emp>();
	
	@PostConstruct
	public void add() {
		lst.add(new Emp(1,"ajay","13"));
		lst.add(new Emp(2,"php","132"));
	}
	static {
		lst.add(new Emp(3,"dot","1000"));
		lst.add(new Emp(4,"java","2000"));
	}
	
	@RequestMapping("/emp")
	public List<Emp> getAll(){
		return lst;
	}
	
	@RequestMapping(value="/emp2", method = RequestMethod.GET)
	  public Map<String, Object> getAllBooks(){
	    List<Emp> emps = lst;
	    
	    Map<String, Object> response = new LinkedHashMap<String, Object>();
	    response.put("totalBooks", emps.size());
	    response.put("books", emps);
	    return response;
	}
	
	
	@RequestMapping("/getId/{id}")
	@ApiMethod(description = "find employee by id", path = { "id" })
	public Emp getId(@PathVariable int id){
		return lst.get(id);
	}
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id,@RequestBody Emp emp){
		for(int i=0;i<lst.size();i++) {
			Emp e= lst.get(i);
			if(e.id==id) {
				lst.set(i, emp);
				return;
			}
			
			//for(Emp e1: lst) {
				//if(e1.getId()==id) {
					//e1.setName(emp.getName());}}
		}
		
	}
	@PostMapping("/add")
	@ApiMethod(description = "add new employee")
	public void add(@RequestBody Emp emp){
		lst.add(emp);
	}
	@DeleteMapping("/delete/{id}")
	@ApiMethod(description = "remove employee by id", path = { "id" })
	public Emp delete(@PathVariable int id){
		return lst.remove(id);
	}
	@RequestMapping("/getEmp")
	public Emp getEmp(){
		Emp emp =new Emp(5,"panwar","30000");
		return emp;
	}
}
