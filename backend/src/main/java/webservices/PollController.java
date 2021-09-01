package webservices;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import config.URL;
import models.PollRequest;
import models.PollResponse;

@RestController
@RequestMapping(value=URL.BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class PollController {
	@PostMapping(value=URL.POLL)
	ResponseEntity<PollResponse> createPoll(@RequestBody PollRequest request){
		
	}
}
