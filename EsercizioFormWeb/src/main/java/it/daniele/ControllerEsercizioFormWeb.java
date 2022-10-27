package it.daniele;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerEsercizioFormWeb{
	String hello = "ciao";
	String totale;	

	@RequestMapping("/form")
	
	public String welcome(Map<String, Object> model) 
	{

		//model.put("hello", this.hello);

		return "DisposizioneForm";
	}
	
	@RequestMapping(value="Informazioni", method=RequestMethod.POST)
	public String savePersonpost(@ModelAttribute Informazioni information, Model model) {
		System.out.println(information.getNome() + " " + information.getCognome() + " "+ information.getData());
		model.addAttribute("model", information);
		return "helloWorld";
	}

}