package imdb.app.demo.controllers;

import imdb.app.demo.entities.Review;
import imdb.app.demo.entities.entries.Production;
import imdb.app.demo.services.interfaces.GeneralAccessService;
import imdb.app.demo.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("imdb/home")
@RequiredArgsConstructor
public class GeneralAccessController {

    private final GeneralAccessService generalAccessService;

    @GetMapping("/welcome")
    public List<List<Production>> viewhome() {
        return generalAccessService.viewHome();
    }

    @GetMapping("/production/{id}")
    public ResponseEntity<Production> viewProduction(@PathVariable Integer id) {
        return generalAccessService.viewProduction(id);
    }

    @GetMapping("/production/{id}/reviews")
    public ResponseEntity<List<Review>> viewProductionReviews(@PathVariable Integer id) {
        return generalAccessService.viewProductionReviews(id);
    }
}
