package controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




/**
 * Created by JiaHao on 2017/2/9.
 */
@Controller

@ResponseBody



@RequestMapping(value = "/test",method = RequestMethod.GET)

public class HelloVC {

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public  @ResponseBody String show(){

        return "heheh";

    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public  @ResponseBody String user(){
        return "{state:200}";
    }






}
