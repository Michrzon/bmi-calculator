package pl.twojekursy.bmicalculator.circle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/circle")
public class CircleMathController {

    private final CircleMathService circleMathService;

    public CircleMathController(CircleMathService circleMathService) {
        this.circleMathService = circleMathService;
    }

    @GetMapping
    public ResponseEntity<CircleResponse> circleCalculation (@RequestParam(value = "r", required = false) Double r){

        return ResponseEntity.ok().body(circleMathService.calculate(r));
    }
    @PostMapping
    public ResponseEntity<CircleResponse> circleCalculationAsPost (@RequestBody CircleRequest request){

        return ResponseEntity.ok().body(circleMathService.calculate(request.radius()));
    }

}
