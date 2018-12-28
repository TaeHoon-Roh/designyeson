package aws.controller;

import aws.mapper.BoardMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class MyController {

//    @Resource(name = "aws.mapper.BoardMapper.xml")
//    BoardMapper.xml mapper;

    @GetMapping("/")
    public String helloWorld() {

        return "index";
    }

//    @RequestMapping("/test")
//    //@GetMapping("/test")
//    public String jspTest() throws Exception {
//        System.out.println(mapper.boardCount());
//        return "test";
//    }
}
