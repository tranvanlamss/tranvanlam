package com.example.tranvanlamead.controller;

import com.example.tranvanlamead.entity.BankEntity;
import com.example.tranvanlamead.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping
public class BankController {
    @Autowired
    BankService bankService;


    @GetMapping("/list")
    public String lisBank(Model model){
        List<BankEntity> banks = bankService.getAll();
        model.addAttribute("banks", banks);
        return "list";
    }

    @GetMapping("/search")
    public String search(Model model,@RequestParam("symbol") String symbol){
            List<BankEntity> names = bankService.getStockName(symbol);
            model.addAttribute("names", names);
            return "list";
    }

}
