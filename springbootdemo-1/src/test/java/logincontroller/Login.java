package logincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
//@RequestMapping(value="/login",method=RequestMethod.GET)
@GetMapping("/login")
	public String getlogin() {
	return "login";
			
}

}
