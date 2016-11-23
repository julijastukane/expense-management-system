package lv.company.api.controllers.parents;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParentController {

    @RequestMapping(value = "/parents", method = RequestMethod.POST)
    public String addParent(@RequestBody ParentDTO parentDTO) {
        System.out.println("New parent data: " + parentDTO.getId() + " " + parentDTO.getName() + " " + parentDTO.getSurname());
        return "Parent added";
    }

}
