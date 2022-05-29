package pro.sky.java.course2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return calculatorService.greetings();
    }

    @GetMapping(path = "/plus")
    public String addTwoNums(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber) {
        return calculatorService.addTwoNums(firstNumber, secondNumber);
    }

    @GetMapping(path = "/minus")
    public String substractTwoNums(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber) {
        return calculatorService.substractTwoNums(firstNumber, secondNumber);
    }

    @GetMapping(path = "/multiply")
    public String multiplyTwoNums(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber) {
        return calculatorService.multiplyTwoNums(firstNumber, secondNumber);
    }

    @GetMapping(path = "/divide")
    public String divideTwoNums(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber) {
        return calculatorService.divideTwoNums(firstNumber, secondNumber);
    }
}
