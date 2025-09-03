package fi.haagahelia.course.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.haagahelia.course.domain.Message;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MessageController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String greetingForm(Model model) {
		model.addAttribute("message", new Message());
		return "hello";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String greetingSubmit(@ModelAttribute Message msg, Model model) {
		model.addAttribute("message", msg);
		return "result";
	}

	@RequestMapping("/helloTymeleaf")
	public String greetIf(@RequestParam(name="name") String name, @RequestParam(name="age") int age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "helloTymeleaf";
	}

}

	/*KOTITEHTAVAN 2 TOTEUTUSIDEA
		@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String kotitehtavat(Model model) {
		model.addAttribute("message", new Message());
	}
		Tuote tuote1 = new Tuote();
		tuote1.setNimi("Puhelin");
		Tuote tuote2 = new Tuote();
		tuote1.setNimi("Tietokone");
		Tuote tuote3 = new Tuote();
		tuote1.setNimi("Tabletti");

		List<Tuote> tuotteet = new ArrayList<Tuote>();
		tuotteet.add(tuote1);
		tuotteet.add(tuote2);
		tuotteet.add(tuote3);

		model.addAttribute("tuotteet", tuotteet); 
		//nyt tuotteet voidaan loopata "hello.html" -sivulla 'th:each' -atribuutin avulla -> th:each="tuote : ${tuotteet}"
		return "hello";
	

	Muista cloonata Git repo ja jakaa tehtävät opettajalle sitä kautta: git releases? tarvitaanko tähän? */
	
