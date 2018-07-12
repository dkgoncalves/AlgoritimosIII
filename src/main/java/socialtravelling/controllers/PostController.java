package socialtravelling.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import socialtravelling.models.Posts;
import socialtravelling.repository.PostRepository;

import java.util.List;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = {"http://127.0.0.1:8000"})
public class PostController {

    @Autowired
    private PostRepository pr;

    @PostMapping
    public Posts cadastrar(@RequestBody Posts posts) {
        return pr.save(posts);
    }

    @GetMapping
    public List<Posts> buscarTodos(){
        return pr.findAll();
    }


//    @DeleteMapping("/{id}")
//    public void excluir(@PathVariable("id") Integer id) {
//        pr.deleteById(id);
//    }

}
