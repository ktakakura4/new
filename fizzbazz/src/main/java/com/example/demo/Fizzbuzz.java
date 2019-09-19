package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Fizzbuzz
 */
@Controller
public class Fizzbuzz {
	
    @GetMapping("tikuwa")
    public String getTikuwa() {
        return "/home";
        
    }

    @PostMapping("/tikuwa")
    public String postFizzbuzz(@RequestParam int num,Model model) {

        List<String> fizzbuzzList = new ArrayList<>();
        
        for(int i=1;i<=num;i++){
        	fizzbuzzList.add(fizzBuzz(i));
        }

        model.addAttribute("answers", fizzbuzzList);
        return "/home";
    }
    
    private String fizzBuzz(int num) {
        if (num % 15 == 0) {
        	return "fizzbuzz";
        }else if (num % 3 == 0) {
            return "fizz";
        }else if (num % 5 == 0) {
            return "buzz";
        }else {
            return Integer.toString(num);
        }
    }
}

class fizzbuzzTest {
	void fizzbuzzTest() {
		// 1の時は1
		String expectString = 1;
		assert(fizzbuzz(1), 1));
	}
}

