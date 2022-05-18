package dev.rmaiun.springplayground.lazyness;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class TextProcessor {

  @PostConstruct
  public void init(){
    System.out.println("Initializing TextProcessor");
  }

  public void readText(){
    System.out.println("Reading text");
  }
}
