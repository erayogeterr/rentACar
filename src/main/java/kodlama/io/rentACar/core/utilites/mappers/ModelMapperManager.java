package kodlama.io.rentACar.core.utilites.mappers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Service // Her seferinde yeniden bir modelMapper üretmesin IOC.
@AllArgsConstructor //ConstructorInjection bir tane modelMapper olsun onu kullansın.
public class ModelMapperManager implements ModelMapperService {
	
	private ModelMapper modelMapper;

	@Override
	public ModelMapper forResponse() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.LOOSE); // Veritabanında diyelim ki id name x y z alanlar var ama sen diyorsunki response nesnemde name x y varsa onları maple diğerlerini mapleme 
		
		return this.modelMapper;
	}

	@Override
	public ModelMapper forRequest() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.STANDARD); // Herşey maplensin yoksa kız.
		
		return this.modelMapper;
	}
}
