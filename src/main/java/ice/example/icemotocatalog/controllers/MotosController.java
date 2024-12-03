package ice.example.icemotocatalog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MotosController {

    @RequestMapping("/hello")
    public String hello(){
        return "test"; //ここはファイル名でなければならない
        //hello.htmlを出す処理。resource/templates/test.htmlにアクセスする　tymeleafというテンプレートエンジンを使うため
    }
    @RequestMapping("param")
    public String param(@RequestParam String name,Model model){
        model.addAttribute("name",name);
        return "test";
        //パラメータを渡すサンプル。/hello?name=hogehoge とアクセスした場合にhtmlの
        //th<span th:text="${name}"> </span>さんこんにちは
    }
}
