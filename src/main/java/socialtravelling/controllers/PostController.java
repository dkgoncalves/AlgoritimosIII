package socialtravelling.controllers;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import socialtravelling.models.Posts;
import socialtravelling.repository.PostRepository;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = {"http://127.0.0.1:8000"})
public class PostController {

    @Autowired
    private PostRepository pr;

    @Autowired
    private ApplicationContext appContext;


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
