package pl.twojekursy.bmicalculator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/text/uppercase")
@RestController
public class TextUppercaseController {

    @GetMapping
    public ResponseEntity<String> word(@RequestParam(value = "word", required = false) String word){
        return ResponseEntity.ok().body(word.toUpperCase());
    }

    @PostMapping
    public ResponseEntity<String> wordAsPost (@RequestBody TextUppercaseRequest request){
        return ResponseEntity.ok().body(request.getText().toUpperCase());
    }

}
