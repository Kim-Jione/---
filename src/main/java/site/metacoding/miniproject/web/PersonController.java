package site.metacoding.miniproject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject.service.PersonService;
import site.metacoding.miniproject.web.dto.response.PersonInfoDto;

@RequiredArgsConstructor
@Controller
public class PersonController {
	private final PersonService personService;

	@GetMapping("PersonInfo/{personId}")
	public String 구직자상세보기(@PathVariable Integer personId, Model model) {
		List<PersonInfoDto> personInfoDto = personService.개인정보보기(personId);
		List<PersonInfoDto> personSkillInfoDto = personService.개인기술보기(personId);
		model.addAttribute("personInfoDto", personInfoDto);
		model.addAttribute("personSkillInfoDto", personSkillInfoDto);
		return "person/PersonInfo";
	}	

}