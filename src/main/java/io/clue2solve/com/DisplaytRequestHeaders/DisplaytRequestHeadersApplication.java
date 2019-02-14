package io.clue2solve.com.DisplaytRequestHeaders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class DisplaytRequestHeadersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplaytRequestHeadersApplication.class, args);
	}


	@RequestMapping( method = RequestMethod.GET)
	public String hello(HttpServletRequest request) {

		return "<html><h2>" +
				"The Request Originated from  the IP Address:  "  + request.getRemoteAddr() +
				"</h2></html>";
	}
}

