package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("registracion")

public class RegistroController {

  @GetMapping("/registrarse")
  public String registrarse() {
	  return "registro";
	  
  }
	
  @PostMapping("/registro")
  public String registro() {
	  
	  return "";
  }
  
}
