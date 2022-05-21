package dev.rmaiun.springplayground.lazyness;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class DataOperator {

  @Autowired
  private TextProcessor textProcessor;
  @Lazy
  @Autowired
  private ImageCreator imageCreator;

  @PostConstruct
  public void init() {
    System.out.println("Initializing DataOperator");
  }

  public void doSomething() {
    System.out.println("Call services");
    textProcessor.readText();
    imageCreator.createImage();
  }
}
