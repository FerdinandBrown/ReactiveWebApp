package ai.leantech.school.ReactiveWebApp;

import org.springframework.boot.SpringApplication;

public class TestReactiveWebApp {

	public static void main(String[] args) {
		SpringApplication.from(ReactiveWebApp::main).with(TestcontainersConfiguration.class).run(args);
	}

}
