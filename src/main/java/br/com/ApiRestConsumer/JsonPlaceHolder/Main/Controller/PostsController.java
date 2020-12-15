package br.com.ApiRestConsumer.JsonPlaceHolder.Main.Controller;

import br.com.ApiRestConsumer.JsonPlaceHolder.Main.Model.Posts;
import br.com.ApiRestConsumer.JsonPlaceHolder.Main.Service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class PostsController {

    @Autowired
    private PostsService service;



//    @PostMapping("/posts")
//
//    public void  findAll(){
//        service.findAll();
//        service.save();
//    }

    @GetMapping("/teste")
    public String hello(){
        return "helloWorld";
    }


    @GetMapping("https://jsonplaceholder.typicode.com/posts")
    public List<Posts> getAll() {
        System.out.println("Inside Home Controller");

        return service.getAllPosts();
    }

    @PostMapping("/add")
    public Posts add(@RequestBody Posts posts) {
        return service.addPosts(posts);
    }


}

