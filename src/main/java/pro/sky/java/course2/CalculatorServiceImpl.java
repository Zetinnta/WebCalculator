package pro.sky.java.course2;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greetings() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @Override
    public String addTwoNums(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        return "<b>Сложение:</b> " + firstNum + " + " + secondNum + " = " + sum;
    }

    @Override
    public String substractTwoNums(int firstNum, int secondNum) {
        int dif = firstNum - secondNum;
        return "<b>Вычитание:</b> " + firstNum + " - " + secondNum + " = " + dif;
    }

    @Override
    public String multiplyTwoNums(int firstNum, int secondNum) {
        int mul = firstNum * secondNum;
        return "<b>Умножение:</b> " + firstNum + " * " + secondNum + " = " + mul;
    }

    @Override
    public String divideTwoNums(int firstNum, int secondNum) {
        if (secondNum == 0) {
            return "<b>ОШИБКА! ДЕЛИТЬ НА НОЛЬ НЕЛЬЗЯ!<b>";
        }
        int div = firstNum / secondNum;
        if (div % 2 == 0 || div == 1) {
            return "<b>Деление:</b> " + firstNum + " / " + secondNum + " = " + div;
        } else {
            return "<b>Кривое деление:</b> " + firstNum + " / " + secondNum + " = " + div;
        }
    }

}
