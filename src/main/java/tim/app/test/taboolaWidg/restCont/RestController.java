package tim.app.test.taboolaWidg.restCont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tim.app.test.taboolaWidg.model.PreeSet;
import tim.app.test.taboolaWidg.model.PreviewCard;
import tim.app.test.taboolaWidg.model.TabooCard;
import tim.app.test.taboolaWidg.model.TabooCardNotFoundException;
import tim.app.test.taboolaWidg.repo.PreeSetRepo;
import tim.app.test.taboolaWidg.repo.TabooCardRepo;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private TabooCardRepo tRep;
    private PreeSetRepo pRep;

    public RestController(TabooCardRepo tRep, PreeSetRepo pRep) {
        this.tRep = tRep;
        this.pRep = pRep;
    }

    @GetMapping("/REST/getById/{id}")
    public TabooCard getById(@PathVariable Long id){
        return tRep.findById(id).orElseThrow(() -> new TabooCardNotFoundException(id));
    };

    @GetMapping("/REST/getAll/")
    public ArrayList<PreviewCard> findAll(){
        System.out.println( "   The Request for ALL came!");
        ArrayList<PreviewCard> resp = new ArrayList<>();
        Iterable<TabooCard> allSelect = tRep.findAll();
        for ( TabooCard t : allSelect ) {
            resp.add(new PreviewCard(t.getId(),t.getLoc(),t.getBrand()));
        }
        return resp;
    };

    @GetMapping("/REST/preset/{num}")
    public PreeSet getPreset(@PathVariable int num){
        List<PreeSet> pSarr = (List<PreeSet>) pRep.findAll();
        return pSarr.get(num);
    }
}


