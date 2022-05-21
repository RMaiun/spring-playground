package dev.rmaiun.springplayground.schedulers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class SchedulersConfig {

  public static final Logger LOG = LogManager.getLogger(SchedulersConfig.class);

  @Scheduled(fixedDelay = 4000)
  public void scheduler1() throws InterruptedException {
    // LOG.info("fixed DELAY [start]");
    Thread.sleep(1000);
    LOG.info("fixed DELAY [end]");
  }

  @Scheduled(fixedRate = 4000)
  public void scheduler2() throws InterruptedException {
    // LOG.info("fixed RATE [start]");
    Thread.sleep(1000);
    LOG.info("fixed RATE [end]");
  }

  // @Scheduled(fixedDelay = 500)
  public void scheduler3() {
    System.out.printf("#3 [%s]%n", Thread.currentThread().getName());
  }
}
