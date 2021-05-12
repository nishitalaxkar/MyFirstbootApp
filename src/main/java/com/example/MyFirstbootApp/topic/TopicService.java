package com.example.MyFirstbootApp.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/* business service are singleton
 * spring creates instances of this and register it  
 * we use @ notation service to tell service @service
 */
@Service
public class TopicService {

	private List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("spring","springFRAMEWORK","SPRING FRAME DECRIP"),
			new Topic("core","core RAMEWORK","SPRING FRAME DECRIP"),
			new Topic("java","spring java FRAMEWORK","SPRING FRAME DECRIP")
			));
	
	 
	public List<Topic> getAllTopics(){
		return topics;
	} 
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id,Topic topic)
	{
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
			
		}
	}
	
	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	}

}
