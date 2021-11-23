package example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.stereotype.Controller

@Controller
class DefaultController {

  @GetMapping(Array("/", "/home"))
  def home(): String = {
      return "/home"
  }

}
