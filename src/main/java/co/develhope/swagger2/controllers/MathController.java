package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    public String welcomeMath(){
        return "Welcome to the math controller";
    }

    @GetMapping("/division-info")
    public ArithmeticOperation divisionInfo(){
        ArithmeticOperation division = new ArithmeticOperation();
        division.setName("division");
        division.setMinNumberOfOperands(2);
        division.setDescription("Divide a numerator by a denominator");
        division.setProperties(new String[]{"Symbol: /", "Distributive", "Invariant"});
        return division;
    }

    @GetMapping("/multiplication")
    public Integer multiplication(@RequestParam int x, @RequestParam int y){
        return x * y;
    }

    @GetMapping("/square/{n}")
    public Integer square(@PathVariable int n) {
        return n * n;
    }
}