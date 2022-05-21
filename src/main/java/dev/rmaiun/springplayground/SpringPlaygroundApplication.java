package dev.rmaiun.springplayground;

import dev.rmaiun.springplayground.lazyness.DataOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringPlaygroundApplication implements CommandLineRunner {

  @Autowired
  private DataOperator dataOperator;

  public static void main(String[] args) {
    System.setProperty("spring.devtools.restart.enabled", "false");
    SpringApplication.run(SpringPlaygroundApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    dataOperator.doSomething();
  }
}
