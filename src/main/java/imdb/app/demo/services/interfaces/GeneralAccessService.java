package imdb.app.demo.services.interfaces;

import imdb.app.demo.entities.Review;
import imdb.app.demo.entities.entries.Production;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GeneralAccessService {

    List<List<Production>> viewHome();

    ResponseEntity<Production> viewProduction(Integer id);

    ResponseEntity<List<Review>> viewProductionReviews(Integer id);
}
