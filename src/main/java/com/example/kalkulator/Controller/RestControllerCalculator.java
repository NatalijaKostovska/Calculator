package com.example.kalkulator.Controller;
import com.example.kalkulator.Service.ServiceCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController("/caluclation")
public class RestControllerCalculator {
    //@RequestParam
    @Autowired
    public ServiceCalculator seviceCalculator;

    @GetMapping("/addition")
    public Double addition(@RequestParam Double firstNumber, Double secondNumber) {
        return this.seviceCalculator.addition(firstNumber,secondNumber);
    }
    @GetMapping("/subtraction")
    public Double subtraction(@RequestParam Double firstNumber, Double secondNumber) {
        return this.seviceCalculator.addition(firstNumber,secondNumber);
    }
    @GetMapping("/multiplication")
    public Double multiplication(@RequestParam Double firstNumber, Double secondNumber) {
        return this.seviceCalculator.addition(firstNumber,secondNumber);
    }
    @GetMapping("/devision")
    public Double devision(@RequestParam Double firstNumber, Double secondNumber) {
        return this.seviceCalculator.addition(firstNumber,secondNumber);
    }
}
