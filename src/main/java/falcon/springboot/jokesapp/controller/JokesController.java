package falcon.springboot.jokesapp.controller;

import falcon.springboot.jokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJokes(Model model) {
        model.addAttribute("joke", jokeService.getJokeText());
        return "chucknorris";
    }

}
