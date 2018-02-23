package com.wboot.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dsz
 * @date 18/02/09
 */
@Controller
public class WbootController {

  @GetMapping({"/", ""})
  String index() {
    return "index";
  }


}
