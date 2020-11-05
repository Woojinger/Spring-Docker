package com.example.demo.about;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {
	
	@GetMapping("/api/about")
	@ResponseBody
	public About getAboutInfo() {
		About about = new About();
		about.setImg("profile.jpg");
		about.setParagraphOne("pOne");
		about.setParagraphTwo("pTwo");
		about.setParagraphThree("pThree");
		
		return about;
	}
}
