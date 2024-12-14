package first_project_springBoot.demoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testControler {
	@GetMapping("/test")
	public String test() {
		return "hello world MOHAMED ARSATH V  THIS MY FIRST URL PROJECT ";
	}

}
