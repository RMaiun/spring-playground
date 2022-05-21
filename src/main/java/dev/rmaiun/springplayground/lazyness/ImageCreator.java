package dev.rmaiun.springplayground.lazyness;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class ImageCreator {

  @PostConstruct
  public void init(){
    System.out.println("Initializing ImageCreator");
  }

  public void createImage(){
    System.out.println("Creating some image");
  }
}
