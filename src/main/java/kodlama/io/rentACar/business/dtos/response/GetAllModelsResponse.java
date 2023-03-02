package kodlama.io.rentACar.business.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllModelsResponse {
	private int id;
	private String name;
	// private int brandId sadece brandNameyi getirsin istiyoruz.
	private String brandName;

	
}
