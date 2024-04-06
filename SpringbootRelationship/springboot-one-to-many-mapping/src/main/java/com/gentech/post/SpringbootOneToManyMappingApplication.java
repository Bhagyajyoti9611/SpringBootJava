package com.gentech.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gentech.post.entity.Comment;
import com.gentech.post.entity.VideoPost;
import com.gentech.post.repository.CommentRepository;
import com.gentech.post.repository.VedioPostRepository;

@SpringBootApplication
public class SpringbootOneToManyMappingApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOneToManyMappingApplication.class, args);
	}
@Autowired
private VedioPostRepository  vediopostRepository;

@Autowired
private CommentRepository commentRepository;

@Override
public void run(String... args) throws Exception {
	VideoPost post = new VideoPost("Election 2024",
    		  "political" ,"who will get more number of seats");
    		  
    		  
   Comment comment1= new Comment("Positive", "x party will take more number os seats");	
   Comment comment2= new Comment("Positive", "y party will take more number os seats");	
   Comment comment3= new Comment("Positive", "z party will take more number os seats");	
   
   
//    setter and getter commentsname in vedioPost
   
   post.getComments().add(comment1);
   post.getComments().add(comment2);
   post.getComments().add(comment3);
	
   this.vediopostRepository.save(post);
}


	
	
	
	
}
