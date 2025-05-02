package com.hoan.webgame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebGameController {

    @GetMapping({"", "/", "/ping-pong"})
    public String getFirstGame() {
        return "ping-pong";
    }

    @GetMapping("/3d-dice")
    public String getDiceGame() {
        return "dice";
    }
}
