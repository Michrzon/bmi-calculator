package pl.twojekursy.bmicalculator.bmi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bmi")
public class BmiCalculatorController {

    private final BmiCalculatorService bmiCalculatorService;

    public BmiCalculatorController(BmiCalculatorService bmiCalculatorService) {
        this.bmiCalculatorService = bmiCalculatorService;
    }

    @GetMapping("/calculate")
    public ResponseEntity<BmiCalculatorResponse> calculateBmi(@RequestParam("w") Integer weight,
                                               @RequestParam("h") Integer heightCm){
        System.out.println("calculateBMI");
        BmiCalculatorResponse response = bmiCalculatorService.calculate(weight, heightCm);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/calculate")
    public ResponseEntity<BmiCalculatorResponse> calculateBmiAsPost(@RequestBody BmiCalculatorRequest request){
        System.out.println("calculateBMI");
        BmiCalculatorResponse response = bmiCalculatorService.calculate(
                request.getWeight(),
                request.getHeight()
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public void test1(){
        System.out.println("test1");
    }

    @GetMapping("/test2")
    public String test2(String str){
        System.out.println("test2: " + str);
        return "String z metody test2";
    }

    @GetMapping("/test3")
    public ResponseEntity<Void> test3(){
        System.out.println("test3");
        return ResponseEntity.noContent().build();

    }@GetMapping("/test4")
    public ResponseEntity<String> test4(@RequestHeader("User-Agent") String header1, @RequestParam("q") String q){
        System.out.println("test4:" + header1);
        System.out.println("header1:" + header1);
        System.out.println("q:" + q);

        return ResponseEntity.accepted().body(q);
    }
}
