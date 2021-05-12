package com.example.MyFirstbootApp.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
  
	
	//dependency injection 
	@Autowired
	private TopicService topicservice;
	
	
	@RequestMapping("/topics")
	public List<Topic> getAlltopics()
	{
		return topicservice.getAllTopics();
	}
	
	//by using curly braces it knows id is variable portion
	//path variable tells path has variable pass the url variable for eg foo is passed to tell foo is id
	@RequestMapping("/topics/{foo}")
	public Topic getTopic(@PathVariable("foo") String id) 
	{ 
		
		return topicservice.getTopic(id);
	}
	

	//create new topics using post
	//when post request happen  on this url below method is called
	@RequestMapping(method = RequestMethod.POST,value = "/topics")
	public void addtopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
		
	}
	
	//update
	@RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id )
	{
		topicservice.updateTopic(id, topic);
	}
	//delete
	@RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id )
	{
		topicservice.deleteTopic(id);
	}
	
	
	
	
	
}

