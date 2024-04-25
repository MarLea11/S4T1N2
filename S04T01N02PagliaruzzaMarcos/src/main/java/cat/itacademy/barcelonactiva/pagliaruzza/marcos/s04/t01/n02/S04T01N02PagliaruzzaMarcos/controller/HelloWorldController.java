package cat.itacademy.barcelonactiva.pagliaruzza.marcos.s04.t01.n02.S04T01N02PagliaruzzaMarcos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String greets(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". You are running a Gradle project.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greets2(@PathVariable Optional<String> name) {
        return "Hello, " + name.orElse("UNKNOWN") + ". You are running a Gradle project.";
    }

}
