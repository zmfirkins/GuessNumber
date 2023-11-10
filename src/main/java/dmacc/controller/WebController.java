package dmacc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import dmacc.beans.Game;

@Controller
public class WebController {
    @GetMapping("/playagame")
    public String showIndex() {
        return "index";
    }
    

    @PostMapping("/playagame")
    public String playGame(@RequestParam(name = "guess") int guess, Model model) {
        Game theOutcome = new Game();
        theOutcome.setGuess(guess);
        model.addAttribute("game", theOutcome);
        return "results";
    }
}