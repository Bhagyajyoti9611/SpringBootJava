package com.gentech.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gentech.post.entity.Comment;
import com.gentech.post.entity.VideoPost;
import com.gentech.post.repository.CommentRepository;
import com.gentech.post.repository.VideoPostRepository;

@SpringBootApplication
public class SpringbootOneToManyMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOneToManyMappingApplication.class, args);
	}

	@Autowired
	private VideoPostRepository postRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		VideoPost post=new VideoPost("Election 2024",
				"Political", "Who will get more Number of Seats");
		
		Comment comment1=new Comment("Positive", "X Party will take more Number of Seats");
		Comment comment2=new Comment("Positive", "Y Party will take more Number of Seats");
		Comment comment3=new Comment("Positive", "Z Party will take more Number of Seats");
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
		this.postRepository.save(post);
		
	}

}
