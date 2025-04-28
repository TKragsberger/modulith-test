package dk.modulith.example.modulithTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class ModulithTestApplicationTests {

	ApplicationModules modules = ApplicationModules.of(ModulithTestApplication.class);

	@Test
	void contextLoads() {
	}

	@Test
	void verify(){
		modules.verify();
	}

	@Test
	void writeDocumentationSnippets() {

		new Documenter(modules)
				.writeModulesAsPlantUml()
				.writeIndividualModulesAsPlantUml();
	}

}
