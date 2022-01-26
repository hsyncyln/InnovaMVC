package com.patika.web;

import com.patika.model.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
public class _01_ResponseBody {

    //http://localhost:8090/birinci
    @GetMapping("/birinci")
    @ResponseBody //sayfaya gitmeden ekranda yazdırmak
    public String birinciMethod(){
        return "<b>Yükleniyor...</b>";
    }

    //http://localhost:8090/ikinci
    @GetMapping("/ikinci")
    public String ikinciMethod(){
        return "index";
    }

    //http://localhost:8090/ucuncu
    @GetMapping("/ucuncu")
    public String ucuncuMethod(){
        return "other/deneme";
    }

    //http://localhost:8090/dorduncu
    @GetMapping("/dorduncu")
    public String dorduncuMethod(Model model){
        model.addAttribute("param_key", "Merhabalar Java Spring Model ile geldi");
        return "param";
    }

    //////////////////
    //PathVariable

    //http://localhost:8090/besinci/44
    @GetMapping("/besinci/{param1}")
    public String besinciMethod(Model model,@PathVariable(name = "param1") int sayi){
        model.addAttribute("param_key", "Merhabalar " + sayi);
        return "pathvariable";
    }

    //http://localhost:8090/altıncı/44
    //http://localhost:8090/altıncı
    @GetMapping({"/altıncı/{param1}", "/altıncı"})
    public String altıncıMethod(Model model,@PathVariable(name = "param1",required = false) Integer sayi){
        model.addAttribute("param_key", "Data " + sayi);
        return "pathvariable";
    }

    //http://localhost:8090/yedinci/44
    //http://localhost:8090/yedinci
    @GetMapping({"/yedinci/{param1}", "/yedinci"})
    public String yedinciMethod(Model model,@PathVariable(name = "param1",required = false) Integer sayi){

        if(sayi != null){
            model.addAttribute("param_key", "Data " + sayi);
        }
        else{
            model.addAttribute("param_key", "Data");
        }
        return "pathvariable";
    }

    //http://localhost:8090/sekizinci?query=44
    @GetMapping("/sekizinci")
    public String sekizinciMethod(Model model,@RequestParam(name = "query") Integer sayi){
        model.addAttribute("param_key", "Data " + sayi);
        return "pathvariable";
    }

    //http://localhost:8090/dokuzuncu?query=44
    //http://localhost:8090/dokuzuncu
    @GetMapping("/dokuzuncu")
    public String dokuzuncuMethod(Model model,@RequestParam(name = "query", defaultValue = "0") Long sayi){
        model.addAttribute("param_key", "Data " + sayi);
        return "pathvariable";
    }

    //http://localhost:8090/onuncu?adi=Huseyin&soyadi=Ceylan
    //http://localhost:8090/onuncu
    @GetMapping("/onuncu")
    public String onuncuMethod(Model model,
                               @RequestParam(name = "adi", defaultValue = "Adinizi girmediniz") String adi,
                               @RequestParam(name = "soyadi", defaultValue = "Adinizi girmediniz") String soyadi ){
        model.addAttribute("param_key", "Data " + adi + " " + soyadi);
        return "pathvariable";
    }
    //http://localhost:8090/onbirinci
    @GetMapping("/onbirinci")
    public String onbirinciMethod(Model model){
        Student student = Student.builder().studentName("Hüseyin")
                .studentSurname("Ceylan").build();
        model.addAttribute("param_key", "Data " + student);
        return "pathvariable";
    }

    /////////////////////////// FORM ////////////////////////

    //http://localhost:8090/onikinci
    @GetMapping("/onikinci")
    public String getForm(Model model){
        Student student = Student.builder().studentName("Adını girmediniz")
                .studentSurname("Soyadınızı girmediniz").build();
        model.addAttribute("form_key", "Data " + student);
        return "form";
    }
    @PostMapping("/onikinci")
    public String postForm(Model model, Student student){
        log.info(student);
        model.addAttribute("form_key", "Data " + student);
        return "form";
    }

}
//DTO- Data Transfer Object
//DAO- Data Access Object