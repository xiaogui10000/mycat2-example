package io.mycat.app;

import io.mycat.app.mapper.TravelRecordMapper;
import io.mycat.app.pojo.TravelRecord;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadWriteSeparationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReadWriteSeparationApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	}

}
