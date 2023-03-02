package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.dtos.request.CreateBrandRequest;
import kodlama.io.rentACar.business.dtos.request.UpdateBrandRequest;
import kodlama.io.rentACar.business.dtos.response.GetAllBrandsResponse;
import kodlama.io.rentACar.business.dtos.response.GetByIdBrandResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();

	void add(CreateBrandRequest createBrandRequest);
	
	GetByIdBrandResponse getById(int id);
	
	void update(UpdateBrandRequest updateBrandRequest);
	
	void delete(int id);

}
