package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class PostController {

	
	@GetMapping("/mypost/{id}")
	public ResponseEntity<Posts> getPostData(@PathVariable("id")String  id){
		
		
		String url="https://jsonplaceholder.typicode.com/posts/"+id;
		
		System.out.println(" id is "+id);
		RestClient rc=RestClient.create();
		
		
		Posts response=rc.get()
		.uri(url)
		.retrieve()
		.body(Posts.class);
		
		System.out.println("data got "+response.getBody());
		return ResponseEntity.ok(response);
		
	}
}
