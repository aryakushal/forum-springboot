package test.ironman.platform.mark4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
	
	@RequestMapping("/ironpunch")
	public String throwIronPunch() {
		// return new String("You got punched twice!");
		return new String("You got punched!");
	}
		
}