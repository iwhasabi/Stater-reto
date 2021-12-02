package starter;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Temp.class)
@EnableConfigurationProperties(TempProperties.class)
public class TempAutoconfigure {

	private final TempProperties properties;
	
	public TempAutoconfigure(TempProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public Temp temp() {
		System.out.println("Métrica: "+properties.getMetrica()+": "+properties.getGrados());
		return new Temp(properties.getGrados(), properties.getMetrica());
	}
}
