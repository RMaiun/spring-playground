package dev.rmaiun.springplayground.lazyness;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class DataOperator {

  private final TextProcessor textProcessor;
  private final ImageCreator imageCreator;

  public DataOperator(TextProcessor textProcessor, @Lazy ImageCreator imageCreator) {
    this.textProcessor = textProcessor;
    this.imageCreator = imageCreator;
  }

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
