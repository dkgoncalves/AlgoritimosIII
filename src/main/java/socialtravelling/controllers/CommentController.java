package socialtravelling.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import socialtravelling.models.Comments;
import socialtravelling.repository.CommentRepository;

import java.util.List;

@RestController
@RequestMapping("/comments")
@CrossOrigin(origins = {"http://127.0.0.1:8000"})
public class CommentController {

    @Autowired
    private CommentRepository cr;

    @PostMapping
    public Comments cadastrar(@RequestBody Comments comments) {
        return cr.save(comments);
    }

    @GetMapping
    public List<Comments> buscarTodos(){
        return cr.findAll();
    }
}
