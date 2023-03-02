package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.ModelService;
import kodlama.io.rentACar.business.dtos.request.CreateModelRequest;
import kodlama.io.rentACar.business.dtos.response.GetAllModelsResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("v1/api/models")
@AllArgsConstructor
public class ModelsController {

	private ModelService modelService;
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<GetAllModelsResponse> getAll() {
		return this.modelService.getAll();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() @Valid CreateModelRequest createModelRequest) {
		this.modelService.add(createModelRequest);
	}
	
}
