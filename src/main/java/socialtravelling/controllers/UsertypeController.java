package socialtravelling.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import socialtravelling.models.Usertypes;
import socialtravelling.repository.UsertypeRepository;

import java.util.List;

@RestController
@RequestMapping("/usertype")
public class UsertypeController {

    @Autowired
    private UsertypeRepository ur;

    @PostMapping
    public Usertypes cadastrar(@RequestBody Usertypes user_type) {
        return ur.save(user_type);
    }

    @GetMapping
    public List<Usertypes> buscarTodos(){
        return ur.findAll();
    }
}
