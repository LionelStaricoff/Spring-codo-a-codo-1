package ar.com.codoacodo.rest;

import ar.com.codoacodo.restclient.ReqresRestService;
import ar.com.codoacodo.restclient.dto.User;
import ar.com.codoacodo.restclient.dto.Users;
import ar.com.codoacodo.restclient.impl.ReqRestServiceJerseyImpl;

public class MainRestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ReqresRestService clientRest = new ReqRestServiceJerseyImpl("https://reqres.in");
		
		//primera interfas andando
		Users users =clientRest.findUsers();
		
		System.out.println(users);
		
		System.out.println("---------------video 54 minutos"
				+ "--------------------------");
		
		User u = clientRest.gerUser(1);
		System.out.println(u);
	}

}
