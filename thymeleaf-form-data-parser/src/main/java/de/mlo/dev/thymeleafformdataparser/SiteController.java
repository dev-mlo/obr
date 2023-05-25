package de.mlo.dev.thymeleafformdataparser;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(path = "/person")
public class SiteController {

    @GetMapping
    public String index(Model model){

        Person person = new Person()
                .setFirstName("Hans")
                .setSurname("Meier")
                .setDateOfBirth(new Date())
                .setAddressList(List.of(
                        new Address().setStreet("Main Str.").setZip("12312").setTown("Nimmerland"),
                        new Address().setStreet("Second Str.").setZip("99999").setTown("Narnia")
                ));
        model.addAttribute("person", person);

        return "index";
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String post(Model model, @ModelAttribute Person person){
        model.addAttribute("person", person);
        return "index";
    }
}
