package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.dtos.request.CreateBrandRequest;
import kodlama.io.rentACar.business.dtos.request.UpdateBrandRequest;
import kodlama.io.rentACar.business.dtos.response.GetAllBrandsResponse;
import kodlama.io.rentACar.business.dtos.response.GetByIdBrandResponse;
import lombok.AllArgsConstructor;

@RestController // Bu class bir controllerdır.
@RequestMapping("v1/api/brands") // Bu classın hangi url ile çalışacağını belirtir.
@AllArgsConstructor
public class BrandsController {
	private BrandService brandService;

	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public List<GetAllBrandsResponse> getAll() {
		return brandService.getAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public GetByIdBrandResponse getById(@PathVariable int id) {
		return brandService.getById(id);
	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() @Valid CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
	@PutMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public void update(@RequestBody() UpdateBrandRequest updateBrandRequest) {
		this.brandService.update(updateBrandRequest);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(int id) {
		this.brandService.delete(id);
	}




}
