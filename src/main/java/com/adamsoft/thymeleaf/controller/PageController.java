package com.adamsoft.thymeleaf.controller;

import com.adamsoft.thymeleaf.domain.SampleVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class PageController {
    @GetMapping("/")
    public String main(Model model){
        Map<String, Object> map = new HashMap<>();
        map.put("Language", "Java");
        map.put("IDE", "IntelliJ");
        map.put("BuildTool", "Gradle");
        model.addAttribute("map", map);

        List<String> list = new ArrayList<>();
        list.add("BackEnd Developer");
        list.add("FrontEnd Developer");
        list.add("DBA");
        list.add("Operator");
        list.add("BigData");
        list.add("DevOps");
        list.add("AI");
        list.add("MLOps");
        model.addAttribute("list", list);

        return "main";
    }

    @GetMapping("/ex1")
    public void ex1(){
        System.out.println("ex1");
    }

    @GetMapping({"/ex2", "/exlink", "/exformat"})
    public void ex2(Model model){
        List<SampleVO> list = new ArrayList<>();
        for(long i=0; i<10; i=i+1) {
            SampleVO vo = SampleVO.builder()
                    .sno(i)
                    .first("First.." + i)
                    .last("Last.." + i)
                    .regTime(LocalDateTime.now())
                    .build();
            list.add(vo);
        }
        model.addAttribute("list", list);
        System.out.println(list);
    }

    @GetMapping({"/exlayout1", "/exlayout2", "/extemplate", "/exsidebar"})
    public void exlayout(){}

    @GetMapping({"/inline"})
    public String exInline(RedirectAttributes redirectAttributes){
        SampleVO vo = SampleVO.builder().sno(100L).first("First..100").last("Last..100").regTime(LocalDateTime.now()).build();
        redirectAttributes.addFlashAttribute("result", "success");
        redirectAttributes.addFlashAttribute("vo", vo);
        return "redirect:/ex3";
    }

    @GetMapping("/ex3")
    public void ex3(){}

}
