package dev.rmaiun.springplayground.lazyness;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class ImageCreator {

  @PostConstruct
  public void init(){
    System.out.println("Initializing ImageCreator");
  }

  public void createImage(){
    System.out.println("Creating some image");
  }
}
