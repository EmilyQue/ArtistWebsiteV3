//Almicke Navarro and Emily Quevedo
//CST-341
//November 8, 2019 
//This is our own work.

//Rest Service

package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.business.EventBusinessInterface;
import com.model.Event;

@RestController
@RequestMapping("/service")
public class RestService {
		EventBusinessInterface service;
		
		/**
		 * Method to use the business service to get all the events from the database
		 * @return array of events
		 */
		@GetMapping("/events")
		public List<Event> getEvents() {

			List<Event> events = service.findAllEvents();
			
			//returns a list of users
			return events;
		}
		
		/**
		 * Method to set spring bean
		 * @param service
		 */
		@Autowired
		public void setUserService(EventBusinessInterface service) {
			this.service = service;
		}
}


