package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.dtos.request.CreateModelRequest;
import kodlama.io.rentACar.business.dtos.response.GetAllModelsResponse;

public interface ModelService {

	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest);
	
	
}
