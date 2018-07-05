package socialtravelling.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import socialtravelling.models.Comments;
import socialtravelling.models.Users;
import socialtravelling.repository.CommentRepository;
import socialtravelling.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = {"http://127.0.0.1:8000"})
public class UserController {

    @Autowired
    private UserRepository ur;

    @PostMapping
    public Users cadastrar(@RequestBody Users users) {
        return ur.save(users);
    }

    @GetMapping
    public List<Users> buscarTodos(){
        return ur.findAll();
    }
}
