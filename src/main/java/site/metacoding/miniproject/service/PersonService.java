package site.metacoding.miniproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject.domain.person.PersonDao;
import site.metacoding.miniproject.domain.person_skill.PersonSkillDao;
import site.metacoding.miniproject.web.dto.response.PersonInfoDto;

@RequiredArgsConstructor
@Service
public class PersonService {

	private final PersonDao personDao;
	private final PersonSkillDao personSkillDao;

	public List<PersonInfoDto> 개인정보보기(Integer personId){
		return personDao.findById(personId);
	}

	public List<PersonInfoDto> 개인기술보기(Integer personId){
		return personSkillDao.findAll(personId);
	}

}