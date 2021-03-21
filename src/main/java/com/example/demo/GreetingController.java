package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HTTP リクエストを処理するコントローラークラス
 * アノテーション @RestController は @Controller と @ResponseBody を含む
 */
@RestController
public class GreetingController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  /**
   * GETリクエストを受け、挨拶を JSON で応答する.
   * アノテーション @GetMapping は @RequestMapping(method = RequestMethod.GET) と同義
   * 自動的に MappingJackson2HttpMessageConverter によって JSON に変換
   *
   * @param name 名前
   * @return 挨拶
   */
  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }
}
