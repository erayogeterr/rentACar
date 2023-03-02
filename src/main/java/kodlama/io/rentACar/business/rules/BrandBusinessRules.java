package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilites.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service //IOC'ye yerleştirdik. 1 Kez oluştu.
public class BrandBusinessRules {
		
	private BrandRepository brandRepository;
	
	public void checkIfBrandNameExists(String name) {
		if(this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exists."); //Java exception types. Bu hata çalışma anında olur. O yüzden runtime ama her hata runtime hatasımı bunun business hatası olduğunu anlatmamız lazım.Kendi business clasını yazacaksın.
		}
	}
}
