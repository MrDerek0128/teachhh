package teach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import teach.entity.User;
import teach.repository.MyRepository;

@RestController
public class MyController {
    @Autowired
    MyRepository myRepository;

    @GetMapping("/insert")
    public ModelAndView insert(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hh");
        return modelAndView;
    }

    @GetMapping("/doinsert")
    public ModelAndView doinsert(String username,String password){
        myRepository.insert(username,password);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
