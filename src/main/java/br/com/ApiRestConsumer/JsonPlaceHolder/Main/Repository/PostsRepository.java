package br.com.ApiRestConsumer.JsonPlaceHolder.Main.Repository;

import br.com.ApiRestConsumer.JsonPlaceHolder.Main.Model.Posts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends CrudRepository<Posts, Long>{

    }
