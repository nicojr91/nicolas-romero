package xcale.tecnico.nicolasromero.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/group")
@CrossOrigin
public class GroupResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(GroupResource.class);

}
