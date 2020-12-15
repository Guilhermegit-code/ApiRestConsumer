package br.com.ApiRestConsumer.JsonPlaceHolder.Main.Service;

import br.com.ApiRestConsumer.JsonPlaceHolder.Main.Model.Posts;
import br.com.ApiRestConsumer.JsonPlaceHolder.Main.Repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsService {

   @Autowired
   PostsRepository postsRepository;

   public List<Posts> getAllPosts() {

      List<Posts> postList = new ArrayList<>();
      postsRepository.findAll().forEach(postList::add);
      return postList;
   }

   public Posts addPosts(Posts posts) {

      posts = postsRepository.save(posts);

      return posts;
   }
}
