package demo.com.matt;

import org.springframework.web.bind.annotation.RestController;

import com.dao.emp.EmployeeResponse;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/index")
    public String index1() {
        return "test from Spring Boot!";
    }
    
    @RequestMapping(value = "/basicPage", method = RequestMethod.GET)
	public List<EmployeeResponse> basicPage() {

		return new com.dao.EmployeeDao().getEmployees();

	}

}
