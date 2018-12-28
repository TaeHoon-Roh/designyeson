package aws;

import aws.mapper.BoardMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class test {

    @Resource(name="aws.mapper.BoardMapper")
    BoardMapper mBoardMapper;

    @RequestMapping("/test")
    //@GetMapping("/test")
    private String jspTest() throws Exception {
        //System.out.println(mBoardMapper.check());
        return "test";
    }
}
